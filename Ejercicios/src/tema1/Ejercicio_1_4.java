/*
 * El tipo short permite almacenar valores comprendidos entre -32768 y 32767
 * Se pide escribir un programa que compurebe que el rango de valores de un tipo
 * se comporta de forma ciclica, es decir, el valor siguiente al máximo es el valor
 * minimo y viceversa
 *
 *  Veremos como Java evita que una operación provoque un desbordamiento
 */
package tema1;

public class Ejercicio_1_4 {
    public static void main(String[] args){
        short num;
        num = 32767; // valor maximo dentro del rango de short
        System.out.println("Valor maximo para el tipo short  = " + num);
        num++; // incrementamos en 1
        System.out.println("num = " + num);


    }
}
