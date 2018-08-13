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
public class calculadoraAritmetica {
    Scanner entrada = new Scanner(System.in);//sin esta cuestion no se pueden meter datos!!!
    int operando1;
    int operando2;
    int residuo;
    void meterNumeros(){
        System.out.println("digita el primer numero : ");
        operando1 = entrada.nextInt();
        System.out.println("digita el segundo numero : ");
        operando2 = entrada.nextInt();
    }
    int sumar(){
        int r;
        r=operando1+operando2;
        return r;
               }
    int restar(){
        int e;
        e=operando1-operando2;
       return e;
               }
    int multiplicar(){
       return operando1*operando2;
               }
    float dividir(){
        return (float)operando1/operando2;//el float es para cambiar los datos de int a float
        }
    float residuo(){
       
        residuo=operando1%operando2;
        
        return residuo;
        }
    
    }
