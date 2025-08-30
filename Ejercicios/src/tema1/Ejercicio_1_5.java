/*
 * Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
 * Hay que tener en cuenta que la media puede contener decimales.
 */
package tema1;

import java.util.Scanner;

public class Ejercicio_1_5 {
    public  static void  main(String[] args){
        int nota1;
        int nota2;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1 =sc.nextInt();
        System.out.println("Introduce la segunda nota");
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2.0;
        sc.close();
        System.out.println("media = " + media);

    }
}
