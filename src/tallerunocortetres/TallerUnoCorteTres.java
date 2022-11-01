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
        int sum = 0;
        int opc; 
        int cont=1;
        int NN [] = null ;
        
        while(cont==1){         
            System.out.println("Ingrese un numero natural");
            NN = ArrayTool.addPosition(NN,leer.nextInt());
            if(NN[NN.length-1]<0){
                while(NN[NN.length-1]<0){
                    System.out.println("Eso no es un numero natural");
                    System.out.println("Vuelva a intentarlo");
                    NN[NN.length-1] = leer.nextInt();
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
        if(NN.length==1){
            System.out.println("La suma total del numero natural que ha ingresado es: "+NN[0]);
        }else{
            System.out.println("La suma de los "+NN.length+" numeros naturales que ha ingresado es:");
            for(int i=0;i<=NN.length-1;i++){
                System.out.println(NN[i]);
                sum=sum+NN[i];
            }
            System.out.println("---------------- +");
            System.out.println(sum);
        }
    }
}
