
package B4;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EjercicioEnClase {

    private static final Logger logger= Logger.getLogger(EjercicioEnClase.class.getName());

    public static void main(String[] args) {
        int resultado;

        Scanner scaner=new Scanner(System.in);
        logger.setLevel(Level.INFO);

        try{
            FileHandler fileHandler= new FileHandler("log txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter= new SimpleFormatter();
            fileHandler.setFormatter(formatter);

       do {
        System.out.println("Ingrese el primer número entero:");
        int num1= scaner.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int num2= scaner.nextInt();

        try {

        resultado=multiplicar(num1,num2);
            logger.log(Level.INFO, "El resultado de la multiplicación es: "+resultado);

           if (resultado <= 100) {
               logger.log(Level.INFO,"El resultado de la multiplicación es " + resultado + " al no superar 100 debe ingresar nuevamente los números");
           }

       } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Error de división por cero");
            resultado=0;
        }
        }
       while ( resultado<=100);
        System.out.println("el resultado es mayor a 100, aplicación finalizada");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error en el programa", e);
        } finally {
            scaner.close();
        }
    }
    public static int multiplicar(int a , int b) {
        if(b==0){
            throw new ArithmeticException("División por cero");
        }
        return a*b;
    }


}

