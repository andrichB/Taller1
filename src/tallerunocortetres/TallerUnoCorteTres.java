/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerunocortetres;

import java.util.Scanner;

/**
 *
 * @author andrich
 */
public class TallerUnoCorteTres {

    /**REQUERIMIENTOS
     * Implementar un software que permita la obtención de n números Naturales, los adicione en un arreglo
     * y porteriormente muestre en pantalla el resultado de la suma acumulativa.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayExpansible ArrayTool = new ArrayExpansible();
        int suma = 0;
        boolean opc; 
        int opcion=1;
        int numerosNaturales [] = null ;  
        while(opcion==1){         
            System.out.println("Ingrese un numero natural");
            numerosNaturales = ArrayTool.addPosition(numerosNaturales,leer.nextInt());
                while(numerosNaturales[numerosNaturales.length-1]<0){
                    System.out.println("Eso no es un numero natural");
                    System.out.println("Vuelva a intentarlo");
                    numerosNaturales[numerosNaturales.length-1] = leer.nextInt();
                }            
            do{
                System.out.println("Desea ingresar otro numero?");
                System.out.println("1 - - - Si");
                System.out.println("0 - - - No");
                opcion = leer.nextInt();
                switch(opcion){
                    case 1 -> opc=false;
                    case 0 -> opc=false;
                    default -> {
                        opc=true;
                        System.out.println("Opcion invalida");
                    }
                }
            }while(opc==true);
        }
        if(numerosNaturales.length==1){
            System.out.println("La suma total del numero natural que ha ingresado es: "+numerosNaturales[0]);
        }else{
            System.out.println("La suma de los "+numerosNaturales.length+" numeros naturales que ha ingresado es:");
            for(int i=0;i<=numerosNaturales.length-1;i++){
                System.out.println(numerosNaturales[i]);
                suma=suma+numerosNaturales[i];
            }
            System.out.println("---------------- +");
            System.out.println(suma);
        }
    }
}
