import java.util.*;

public class java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opertor, number1, number2, Result;
        System.out.println("Enter first number");
        number1 = sc.nextInt();
        System.out.println("Enter second number");
        number2 = sc.nextInt();
        System.out.println(" 1.Add \n 2.Sub \n 3.Mul\n 4.Div \n 5.Mod");
        opertor = sc.nextInt();
        Result = 0;
        switch (opertor) {
            case 1:
                Result = number1 + number2;
                break;
            case 2:
                Result = number1 - number2;
                break;
            case 3:
                Result = number1 * number2;
                break;
            case 4:
                Result = number1 / number2;
            case 5:
                Result = number1 % number2;
                break;
            default:
                System.out.println("written opertor is inavlid");
        }
        System.out.println("Result is:" + Result);

    }
}
