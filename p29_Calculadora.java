//p29_Calculadora - Realiza operaciones básicas sobre 2 números
import java.util.Scanner;

public class p29_Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println("\nEfectuando operaciones matemáticas básicas sobre 2 números");
        System.out.print("Dame el primer número: "); 
        n1 = obj.nextDouble();

        System.out.print("Dame el segundo número: "); 
        n2 = obj.nextDouble();

        System.out.print("Escribe la operación: + - / * ^: ");
        op = obj.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("n1 + n2 = %.2f", n1 + n2);
                break;
            case '-':
                System.out.printf("n1 - n2 = %.2f", n1 - n2);
                break;
            case '*':
                System.out.printf("n1 * n2 = %.2f", n1 * n2);
                break;
            case '/':
                if (n2 != 0) {
                    System.out.printf("n1 / n2 = %.2f", n1 / n2);
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            case '^':
                System.out.printf("n1 ^ n2 = %.2f", Math.pow(n1, n2));
                break;
            default:
                System.out.println("\nOperación Inválida ...");
                break;
        }

        System.out.println("\n\nProceso terminado ...");
    }
}
