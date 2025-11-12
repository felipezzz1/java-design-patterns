package main.java.com.fezor.behavioral.strategy.paymentMethodExample;

import main.java.com.fezor.behavioral.strategy.paymentMethodExample.order.Order;
import main.java.com.fezor.behavioral.strategy.paymentMethodExample.strategies.PayByCreditCard;
import main.java.com.fezor.behavioral.strategy.paymentMethodExample.strategies.PayByPayPal;
import main.java.com.fezor.behavioral.strategy.paymentMethodExample.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while(!order.isClosed()){
            int cost;

            String continueChoice;

            do{
                System.out.print("Please, select a product:" + "\n" +
                        "1 - CPU" + "\n" +
                        "2 - Mother board" + "\n" +
                        "3 - Memory" + "\n" +
                        "4 - SSD" + "\n");

                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);

                System.out.println("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Do you wish to continue selecting products? Y/N");
                continueChoice = reader.readLine();
            } while(continueChoice.equalsIgnoreCase("Y"));

            if(strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PayPal" + "\n" +
                        "2 - Credit Card");

                String paymentMethod = reader.readLine();

                if(paymentMethod.equals("1")){
                    strategy = new PayByPayPal();
                } else{
                    strategy = new PayByCreditCard();
                }
            }

            order.processOrder(strategy);

            System.out.println("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            if(proceed.equalsIgnoreCase("P")){
                if(strategy.pay(order.getTotalCost())){
                    System.out.println("Payment has been successful.");
                } else{
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}
