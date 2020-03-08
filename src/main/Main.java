package main;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner teclado= new Scanner(System.in);

        System.out.println("SELECCIONE UNA OPCION");
        System.out.println("");
        System.out.println("1. DESAYONO: $4000");
        System.out.println("2. ALMUERZO: $10000");
        System.out.println("3. CENA: $8000");
        int opcion = teclado.nextInt();

        if(opcion == 1){
            System.out.println("PAGA 4000 POR DESAYUNO");
        }else if(opcion == 2){
                System.out.println("PAGA 10000 POR ALMUERZO");
        }else if(opcion == 3){
        System.out.println("PAGA 8000 POR CENA");
    } else{
        System.out.println("OPCION ERRADA");
        }
        System.out.println("uso del SWITCH");

        switch (opcion) {
            case 1:
                System.out.println("PAGA 4000 POR DESAYUNO");
                break;

            case 2:
                System.out.println("PAGA 10000 POR ALMUERZO");
                break;

            case 3:
                System.out.println("PAGA 8000 POR CENA");
                break;

            default:
                System.out.println("OPCION ERRADA");
                break;
        }
            System.out.println("0A 3 ES UN BEBE-4A 7 NIÑO-15 A 20 JOVEN-21 A 40 ADULTO-41 O MAS ANCIANO");
            System.out.println("INGRESE EDAD");
           int edad =  teclado.nextInt();
            if(edad >=0 && edad<= 3){
                System.out.println("ES UN BEBE");
            }else if(edad >=4 && edad<= 7){
                System.out.println("ES UN NIÑO");
            }else if(edad >=15 && edad<= 20){
                System.out.println("ES UN JOVEN");
            }else if(edad >=21 && edad<= 40){
                System.out.println("ES UN ADULTO");
            }else if(edad >=41) {
                System.out.println("ES UN ANCIANO");
            }else{
                System.out.println("error en la edad");
            }



        }



    }

