import java.util.Scanner;

public class fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;

        System.out.print("Ingrese la cantidad de terminos: ");
        n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}