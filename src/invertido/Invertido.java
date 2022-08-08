/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertido;

/**
 *
 * @author Edgardoidk
 */
public class Invertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(invertir("Hola"));
    }
    public static String invertir (String entradaTexto){
        String res;
        char textoArray[]=entradaTexto.toCharArray();
        int cont=0;
        char textoRes[]=entradaTexto.toCharArray();
        for(int x=0;x<textoArray.length/2;x++){
            if((textoArray[x]>=65 && textoArray[x]<=90) || (textoArray[x]>=97 && textoArray[x]<=122)){
      
                for(int y=cont;y<(textoArray.length/2);y++){
                    int posInv = textoArray.length - y - 1;
                    if((textoArray[x]>=65 && textoArray[x]<=90) || (textoArray[x]>=97 && textoArray[x]<=122)){
                    
                        char letraTemp=textoArray[posInv];
                        textoRes[posInv]=textoRes[x];
                        textoRes[x]=letraTemp;
                        cont++;
                        break;
                    }
                }
            }
        }
        System.out.println(textoRes);
        res=textoRes.toString();
        return res;
    }
}
