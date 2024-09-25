import Task1.NumWordPrinter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumWordPrinter numWordPrinter=new NumWordPrinter();
        String result= numWordPrinter.printWord(2,"lowercase");
        System.out.println(result);
    }
}