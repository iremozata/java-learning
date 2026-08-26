//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();

        System.out.println(fourOperations.addition(3, 1));
        System.out.println(fourOperations.addition(4, 1, 5, 9));
        System.out.println(fourOperations.subtraction(2,6));
        System.out.println(fourOperations.subtraction(5,3,5));
        System.out.println(fourOperations.multiplication(8,9));
        System.out.println(fourOperations.multiplication(7,9,3,2,3));
        System.out.println(fourOperations.division(8,4));
    }
}
