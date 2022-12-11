import java.util.Scanner;
public class ImprimirN {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um número natural: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("========================== ");
        imprimir(n);

        sc.close();
    }

    static void imprimir(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(i + " ");
        }
    }
}