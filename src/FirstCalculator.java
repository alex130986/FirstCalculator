import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        int ans;
        char op;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default : System.out.print("Error! Invalid operator");
                return;
        }
        System.out.print("Result:");
        System.out.print(ans);
    }
}