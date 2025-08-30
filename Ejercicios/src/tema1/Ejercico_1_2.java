/*
 * Pedir al usuario su edad y mostrar la que tendrá el proximo año
 * En el ejercicio realizamos las tres fases tipicas de cualquier aplciacion:
 *  - Entrada de datos: pedimos la edad
 *  - Procesado: en este caso incrementar la edad en 1
 *  - Salida de datos: mostrar el resultado
 */

package tema1;

import java.util.Scanner;

public class Ejercico_1_2 {
    public static void main(String[] args){

        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe su edad");
        edad = sc.nextInt();
        edad = edad + 1;
        System.out.println("El proximo año tendrá la edad de  = " + edad);

    }
}
