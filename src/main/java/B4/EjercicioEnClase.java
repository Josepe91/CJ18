
package B4;

import java.util.Scanner;

public class EjercicioEnClase {

    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);

        System.out.println("Ingrese el primer número entero:");
        int num1= scaner.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int num2= scaner.nextInt();

        int resultado=num1*num2;

        while (resultado<100) {

            System.out.println("el resultado es: "+resultado);
        }

    }


}
