import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num1, num2;
            System.out.println("Enter First Number:- ");
            num1 = sc.nextInt();
            System.out.println("Enter Second Number:- ");
            num2 = sc.nextInt();
            System.out.println("Enter the Operator");
            String operator = sc.next();
            sc.close();
            switch (operator) {
                case "+":
                    System.out.println("The sum is :- " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The subtraction is :- " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("The multiplication is :- " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("The division is :- " + (num1 / num2));
                    break;
                case "%":
                    System.out.println("The remainder is :- " + (num1 % num2));
                    break;

                default:
                    break;
            }
    }

}