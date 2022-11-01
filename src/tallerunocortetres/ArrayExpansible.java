/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tallerunocortetres;

/**
 * 
 * @author andrich
 */
public class ArrayExpansible {
    
    /**
     *
     * @param array
     * @param valor
     * @return
     */
    public int [] addPosition(int array [], int valor){    
            if(array==null){
                array= new int [1];
                array[0] = valor;
            }else{
                int add [] = new int  [array.length+1];
                for(int i=0;i<=array.length-1;i++){
                    add[i]=array[i];
                }
                array = new int [add.length];
                for(int i=0;i<=add.length-2;i++){
                    array[i]=add[i];    
                }
                array[array.length-1]=valor;
            }
      return array;
    }
}
