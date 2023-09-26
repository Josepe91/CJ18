package B2;

import java.util.Scanner;

public class AreaDelCuadrado {

    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);

        System.out.println("Ingrese la medida de un lado del cuadrado");
        double lado= scaner.nextDouble();

        Area(lado);

    }

    private static void Area(double lado) {
        System.out.println("El area del cuadrado es "+(lado*lado));
    }


}

