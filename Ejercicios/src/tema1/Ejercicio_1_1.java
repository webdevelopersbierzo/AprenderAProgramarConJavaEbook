/*
    En este ejercicio se pide un numero y después se muestra tal cual.
    En este caso no procesamos el dato de entradas.
    Esto no es un caso tipico, pero nos sirve para ir mostrando los distintas
    herramientas de las que disponemos


 */

package tema1;

import java.util.Scanner;

public class Ejercicio_1_1 {
    public static void main(String[] args) {
        int num;
        System.out.println("Escribe un numero");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        System.out.println("Valor introducido= " + num);

    }
}
