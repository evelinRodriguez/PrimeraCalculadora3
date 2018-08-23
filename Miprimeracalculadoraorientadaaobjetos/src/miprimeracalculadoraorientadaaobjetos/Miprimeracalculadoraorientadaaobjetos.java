/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeracalculadoraorientadaaobjetos;
import java.util.Scanner;//biblioteca para meter datos por consola
/**
 *
 * @author Estudiantes
 */
public class Miprimeracalculadoraorientadaaobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//sin esta cuestion no se pueden meter datos!!!
        //definir objeto
        calculadoraAritmetica miCalculadora;
        miCalculadora=new calculadoraAritmetica();
        calculadoratrigonometrica miCalculadora1;                                    // crear objeto
        miCalculadora1=new calculadoratrigonometrica();
        miCalculadora.meterNumeros();
       
        
        System.out.print("selecciones operacion:\n1.sumar\n2.restar\n3.multiplicar\n4.dividir\n5.residuo\n6.seno\n7.coseno\n8.tangente\n9.arcoseno\n10.arccoseno\n11.arctangente"
                + "\n digite su respuesta :");
         
        int opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                   System.out.println("la suma es = "+miCalculadora.sumar());
                   break;
        
            case 2:
                   System.out.println("la resta es ="+ miCalculadora.restar());      
                   break;
                   
            case 3:System.out.println("la multiplicacion es ="+miCalculadora.multiplicar());      
                   break;          
            
            case 4:System.out.println("la division es ="+miCalculadora.dividir());      
                   break; 
            
            case 5:System.out.println("el residuo es ="+miCalculadora.residuo());      
                   break;  
            case 6:System.out.println("el seno es ="+miCalculadora1.seno());      
                   break; 
            case 7:System.out.println("el coseno es ="+miCalculadora1.coseno());      
                   break; 
            case 8:System.out.println("la tangente es ="+miCalculadora1.tangente());      
                   break;        
            case 9:System.out.println("el arcoseno es ="+miCalculadora1.arcsin());      
                   break;     
            case 10:System.out.println("el arccoseno es ="+miCalculadora1.arcos());      
                   break;            
            case 11:System.out.println("el arctangente es ="+miCalculadora1.arctan());      
                   break;            
                   
            default :System.out.println("opcion invalida ");  
                   break;
                  }
        
            }
    }
    
    