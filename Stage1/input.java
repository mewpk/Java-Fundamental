import java.util.Scanner;
class input {
 public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        String name = sc.nextLine();
        System.out.println(name);
        int number1 = sc.nextInt();
        System.out.println(number1);
        System.out.println(number1+name);
    }
 }   
}
