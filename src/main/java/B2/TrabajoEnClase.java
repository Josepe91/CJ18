package B2;


import java.util.Scanner;

public class TrabajoEnClase {



    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);

        System.out.println("Ingrese el el valor en pesos" );


        double pesos= scaner.nextDouble();

        conver(pesos);


}

    private static void conver(double pesos) {
        double dolar=4068;
        System.out.println("Usted tiene "+(pesos/dolar)+ " Dolares" );

    }


}


