
import java.util.Scanner;

public class calcular
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escolha:\n 1: calcular e imprimir o perímetro do círculo. \n 2: calcular e imprimir a área do círculo. \n 3: calcular e imprimir o volume da esfera.");
        double n1 = sc.nextDouble();
        System.out.println("Digite o valor do circulo/esfera");
        double n2 = sc.nextDouble();

        if (n1 == 1) {
            System.out.print("O valor do perímetro é:");
            System.out.println(2*Math.PI*n2);
        }
        if (n1 == 2) {
            System.out.print("O valor da área do circulo é:");
            System.out.println(Math.PI*(n2*n2));
        }
        if (n1 == 3) {
            System.out.print("O valor do volume da esfera é:");
            System.out.println((4/3)Math.PI(n2*n2*n2));
        }
        if (n1 != 1 && n1 != 2 && n1 != 3) {
            System.out.print("Digite um número válido:");
        }
        sc.close();
    }
}