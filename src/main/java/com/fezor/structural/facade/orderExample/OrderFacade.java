package main.java.com.fezor.structural.facade.orderExample;

public class OrderFacade {

    private Payment payment;
    private Stock stock;
    private Invoice invoice;

    public OrderFacade(){
        payment = new Payment();
        stock = new Stock();
        invoice = new Invoice();
    }

    public void placeOrder(){
        payment.processPayment();
        stock.removeFromStock();
        invoice.generateInvoice();
        System.out.println("Order completed...");
    }
}
