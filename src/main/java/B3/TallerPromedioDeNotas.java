package B3;

import java.util.Scanner;

public class TallerPromedioDeNotas {

    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);

        double[]notas=new double[5];

        double suma=0;

        for (int i=0; i<5;i++){
            System.out.println("Ingrese la nota "+ (i+1)+":");
            double notaIndividual= scaner.nextDouble();

            if (notaIndividual>5){

                System.out.println("La nota no es válida ");
                i--;

            } else {

                notas[i]=notaIndividual;
            }

            suma=suma+notas[i];
        }

        double promedio=suma/5;
        System.out.println("El promedio de las notas es "+promedio);


        }

    }

