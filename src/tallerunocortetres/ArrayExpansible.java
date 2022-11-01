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
    int array [] = null;
    
    public void addValor(int entero){
        if(array==null){
            array = new int [1];
            array[0]=entero;
        }else{
            int add [] = new int  [this.array.length+1];
            for(int i=0;i<=this.array.length-1;i++){
                add[i]=this.array[i];
            }
            add[add.length-1] = entero;
            this.array = new int [add.length];
            
            for(int i=0;i<=add.length-1;i++){
                this.array[i]=add[i];
            }
        }
    }
    
    public int nPosiciones(){
        return this.array.length;
    }
    
    public int retornaValor(int posicion){
        return array[posicion];
    }
}
