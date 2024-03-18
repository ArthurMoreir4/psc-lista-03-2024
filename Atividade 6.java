
import java.util.Scanner;
import java.util.Random;

public class ParImpar
{
    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();

        if (n1>n2) {
            System.out.println("O número sorteado é:");
            int n3 = rn.nextInt(n1 - n2 + 1) + n2;
            if (n3 % 2 == 0) {
                System.out.println(n3 + " E é par");
            } else {
                System.out.println(n3 + " E é impar");
            }
        }
        if (n1<n2) {
            System.out.println("O número sorteado é:");
            int n3 = rn.nextInt(n2 - n1 + 1) + n1;
            if (n3 % 2 == 0) {
                System.out.println(n3 + " E é par");
            } else {
                System.out.println(n3 + " E é impar");
            }
        }
        sc.close();
    }
}