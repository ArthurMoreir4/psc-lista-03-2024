
import java.util.Scanner;

public class nota
{
    static int nota50, nota20, nota10, nota5, nota2, moeda1;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreva o valor da sua compra");
        int v1 = sc.nextInt();
        System.out.println("Escreva quanto de dinheiro você deu");
        int v2 = sc.nextInt();
        int troco = v2 - v1;
        System.out.println("Seu troco é: " + troco);
        while (troco > 0) {
            if (troco >= 50) {
                troco -= 50;
                nota50++;
            } else if (troco >= 20) {
                troco -= 20;
                nota20++;
            } else if (troco >= 10) {
                troco -= 10;
                nota10++;
            } else if (troco >= 5) {
                troco -= 5;
                nota5++;
            } else if (troco >= 2) {
                troco -= 2;
                nota2++;
            } else if (troco >= 1) {
                troco -= 1;
                moeda1++;
            }
        }
        System.out.println("Vão ser:\n " + nota50 + " Notas de 50 reais.\n " + nota20 + " Notas de 20 reais.\n " + nota10 + " Notas de 10 reais.\n " + nota5 + " Notas de 5 reais.\n " + nota2 + " Notas de 2 reais.\n " + moeda1 + " Moeda de 1 real.");
        sc.close();
    }

}