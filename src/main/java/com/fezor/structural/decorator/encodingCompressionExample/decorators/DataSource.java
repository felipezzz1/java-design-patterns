package main.java.com.fezor.structural.decorator.encodingCompressionExample.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
