public class dataloss {
    public static void main(String[] args) {
        // small --> big
        int number1 = 500;
        double number2 = number1;

        // big --> small
        double number3 = 123.456f;
        int number4 = (int)number3;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        
    }
}
