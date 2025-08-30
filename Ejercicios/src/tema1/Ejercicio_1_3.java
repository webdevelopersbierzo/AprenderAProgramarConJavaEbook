/*
 * Escribir una aplicación que pida el año actual y el de nacimiento del usuario.
 * Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha
 * cumplido años
 *
 * La edad puede calcularse como la diferencia entre el año actual y el de
 * nacimiento. Esto puede contener un error, en el caso de que en la fecha actual
 * aún no se haya celebrado el cumpleaños del año en curso.
 * Supondremos que el cumpleaños del usuario ya ha tenido lugar este año.

 */

package tema1;

import java.util.Scanner;

public class Ejercicio_1_3 {
    public static void main(String[] args){
        int year;
        int yearBirthday;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año en curso");
        year = sc.nextInt();
        System.out.println("Introduce el año de nacimiento");
        yearBirthday = sc.nextInt();
        System.out.println("Tu edad es de " + (year - yearBirthday) + " años");


    }
}
