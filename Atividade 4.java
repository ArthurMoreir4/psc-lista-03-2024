
import java.util.Scanner;

public class segundoGrau
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreva o valor de A");
        double a = sc.nextDouble();
        System.out.println("Escreva o valor de B");
        double b = sc.nextDouble();
        System.out.println("Escreva o valor de C");
        double c = sc.nextDouble();

        if (a==0 && b==0 && c!=0) {
            System.out.println("Coeficientes informados incorretamente.");
            return;
        }
        if (a==0 && b!=0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double x = (b*b) - (4*c);
            System.out.println(b*x-c);
            return;
        }
        if ((b*b) - 4*a*c < 0) {
            System.out.println("Esta equação não possui raízes reais.");
            return;
        }
        if ((b*b) - 4*a*c == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");
            System.out.print("(-b*-b) - 4*a*c = ");
            System.out.println((-b*-b) - 4*a*c);
            System.out.print("(b*b) - 4*a*c = ");
            System.out.println((b*b) - 4*a*c);
            return;
        }
        if ((b*b) - 4*a*c > 0) {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            System.out.print("(-b*-b) - 4*a*c = ");
            System.out.println((-b*-b) - 4*a*c);
            System.out.print("(b*b) - 4*a*c = ");
            System.out.println((b*b) - 4*a*c);
            return;
        }
        sc.close();
    }
}{
}
