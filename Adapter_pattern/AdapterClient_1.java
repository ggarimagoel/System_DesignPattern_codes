package Adapter_pattern;

public class AdapterClient_1 {
    public static void main(String[] args) {
        modernPrinter printer = new printerAdapter_1(new oldPrinter_1());
        printer.printText("hello from old printer using adapter");
    }
}

