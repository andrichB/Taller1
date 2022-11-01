/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerunocortetres;

import java.util.Scanner;

/**
 *
 * @author andri
 */
public class TallerUnoCorteTres {

    /**REQUERIMIENTOS
     * Implementar un software que permita la obtención de n números Naturales, los adicione en un arreglo
     * y porteriormente muestre en pantalla el resultado de la suma acumulativa.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sum = 0;
        int opc; 
        int cont=1; 
        int numN [] = null;
        
        while(cont==1){
            System.out.println("Ingrese un numero entero");
            if(numN==null){
                numN = new int [1];
                do
                {
                    if(numN[0]<0){
                        System.out.println("Eso no es un numero natural");
                        System.out.println("Vuelva a intentarlo");
                    }
                    numN[0]=leer.nextInt();
                }while(numN[0]<0);
            }else{
                int add [] = new int [numN.length+1];
    
                for(int i=0;i<=add.length-2;i++){
                    add[i]=numN[i];
                }                                                          
                do{
                    if(add[add.length-1]<0){
                        System.out.println("Eso no es un numero natural");
                        System.out.println("Vuelva a intentarlo");
                    }
                    add[add.length-1]=leer.nextInt();
                }while(add[add.length-1]<0);
                
                numN = new int [add.length];
                
                for(int i=0;i<=add.length-1;i++){
                    numN[i]=add[i];
                }
            }
            opc=1;
            while(opc==1){
                System.out.println("Desea ingresar otro numero?");
                System.out.println("1 - - - Si");
                System.out.println("0 - - - No");
                cont = leer.nextInt();
                switch(cont){
                    case 1 -> opc=0;
                    case 0 -> opc=0;
                    default -> {
                        opc=1;
                        System.out.println("Opcion invalida");
                    }
                }
            }   
        } 
        System.out.println("La suma de los "+numN.length+" numeros que ha ingresado es:");
        for(int i=0;i<=numN.length-1;i++){
            System.out.println(numN[i]);
            sum=sum+numN[i];
        }
        System.out.println("_____________+");
        System.out.println(sum);
    }
}