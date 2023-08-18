package Adapter_pattern;



// Adapter to make OldPrinter compatible with ModernPrinter interface
public class printerAdapter_1 implements modernPrinter{
    private oldPrinter_1 oldPrinter;

    printerAdapter_1(oldPrinter_1 op){
        oldPrinter = op;
    }
    public void printText(String s){
        oldPrinter.print(s);
    }
}
