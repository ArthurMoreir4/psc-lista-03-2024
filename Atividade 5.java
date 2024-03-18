
import java.util.Scanner;

public class SSMDP
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escolha:\n +: Soma. \n -: Subtração. \n x: Multiplicação. \n /: Divisão. \n ^: Potenciação.");
        char op = sc.next().charAt(0);
        System.out.println("Digite o primeiro número");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = sc.nextDouble();

        if (op == '+') {
            System.out.print("O resultado da soma é:");
            System.out.println(n1+n2);
        }
        if (op == '-') {
            System.out.print("O resultado da subtração é:");
            System.out.println(n1-n2);
        }
        if (op == 'x') {
            System.out.print("O resultado da multiplicação é:");
            System.out.println(n1*n2);
        }
        if (op == '/') {
            System.out.print("O resultado da divisão é:");
            System.out.println(n1/n2);
        }
        if (op == '^') {
            System.out.print("O resultado da potenciação é:");
            System.out.println(Math.pow(n1, n2));
        }
        sc.close();
    }
}