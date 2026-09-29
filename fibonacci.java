import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;
        int a = 0;
        int b = 1;
        int c;

        System.out.print("Ingrese la cantidad de terminos: ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }
}