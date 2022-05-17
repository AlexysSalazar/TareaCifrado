/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizacioncodigo2209;

import ico.fesherencia.Alumno;
import ico.fesherencia.Persona;

/**
 *
 * @author win10-94
 */
public class PruebaPolimorfismo {
    public static void main(String[] args) {
        System.out.println("Hola Polimorfismo");
        Persona per1 =new Persona();
        per1.setNombre("Jose ");
        per1.dormir();
        
        Alumno al1 = new Alumno();
        al1.setNombre("Jose");
        al1.dormir();
        al1.dormir(4);
        
    }
}
