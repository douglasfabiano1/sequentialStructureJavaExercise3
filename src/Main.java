import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para A: ");
        int a = sc.nextInt();
        System.out.print("Digite um valor inteiro para B: ");
        int b = sc.nextInt();
        System.out.print("Digite um valor inteiro para C: ");
        int c = sc.nextInt();
        System.out.print("Digite um valor inteiro para D: ");
        int d = sc.nextInt();

        int difference = a * b - c * d;

        System.out.printf("A diferença do produto A e B "
                + "pelo produto de C e D conforme a fórmula:  "
                + "(A * B - C * D). %nDIFERENCA = %d", difference);
        sc.close();
    }
}
