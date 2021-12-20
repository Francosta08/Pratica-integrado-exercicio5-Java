import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int cont = 0;

        System.out.println("Digite um número n : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Digite um número m : ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Digite um número d:  ");
        int d = new Scanner(System.in).nextInt();

        System.out.println("Número digitado n:  " + n);
        System.out.println("Número digitado m:  " + m);
        System.out.println("Número digitado d:  " + d);


        for (int i =0 ; i <=n ;i++) {
            for (n = 3; n <= d; n++) {
                System.out.println(i + ""+ n);
                for (m = 0; m <= d; m++) {
                    System.out.println( i + "" + n + "" + m);
                }

            }


        }
    }
}