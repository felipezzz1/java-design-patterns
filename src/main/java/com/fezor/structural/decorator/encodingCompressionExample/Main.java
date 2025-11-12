package main.java.com.fezor.structural.decorator.encodingCompressionExample;

import main.java.com.fezor.structural.decorator.encodingCompressionExample.decorators.*;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name, Salary\nJohn Doe,10000\nJoseph Button,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded ----------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ----------");
        System.out.println(encoded.readData());
    }
}
