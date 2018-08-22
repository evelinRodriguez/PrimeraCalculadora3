/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeracalculadoraorientadaaobjetos;
import static java.lang.Math.*;
/**
 *
 * @author Estudiantes
 */
public class calculadoratrigonometrica {
    double call;
    double inversa;

    void convertir (double unangulo){
        call = Math.toRadians(unangulo);
    }

 double seno(){
     return sin(call);
 }
 double coseno(){
     return cos(call);
 }
double tangente(){
     return tan(call);
 }
double arcsin(){
     return Math.asin(inversa);
 }
double arccos(){
     return Math.acos(inversa);
 }
double arctan(){
     return Math.atan(inversa);
 }


}