import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreva o primeiro número");
        double n1 = sc.nextDouble();
        System.out.println("Escreva o segundo número");
        double n2 = sc.nextDouble();
        System.out.println("Escreva o terceiro número");
        double n3 = sc.nextDouble();
        if (n1>n2) {
            if (n2>n3) {
                System.out.println("Maior número: " + n1 + "Menor número: " + n3);
            }
        }
        if (n1>n3) {
            if (n3>n2) {
                System.out.println("Maior número: " + n1 + "Menor número: " + n2);
            }
        }
        if (n2>n1) {
            if (n1>n3) {
                System.out.println("Maior número: " + n2 + "Menor número: " + n3);
            }
        }
        if (n2>n3) {
            if (n3>n1) {
                System.out.println("Maior número: " + n2 + "Menor número: " + n1);
            }
        }
        if (n3>n1) {
            if (n1>n2) {
                System.out.println("Maior número: " + n3 + "Menor número: " + n2);
            }
        }
        if (n3>n2) {
            if (n2>n1) {
                System.out.println("Maior número: " + n3 + "Menor número: " + n1);
            }
        }
        sc.close();
    }

}