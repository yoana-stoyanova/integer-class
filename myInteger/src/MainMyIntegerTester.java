import java.util.Scanner;

public class MainMyIntegerTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyInteger a = new MyInteger(input.nextInt());
        System.out.println("Even: " + a.isEven());
        System.out.println("Odd: " + a.isOdd());
        System.out.println("Prime: " + a.isPrime());

        int eq = input.nextInt();
        System.out.println("Equals: " + a.isEven(eq));

        char[] arr = new char[5];
        for(int i = 0; i < 5; i++) arr[i] = input.next().charAt(0);
        a.parseInt(arr);

        String str = input.next();
        a.parseInt(str);
    }
}
