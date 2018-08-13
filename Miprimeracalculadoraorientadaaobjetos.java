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
        // crear objeto
        miCalculadora=new calculadoraAritmetica();
        miCalculadora.meterNumeros();
        System.out.print("selecciones operacion:\n1.sumar\n2.restar\n3.multiplicar\n4.dividir\n5.residuo"
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
            default :System.out.println("opcion invalida ");  
                   break;
                  }
        
            }
    }
    
    

             
