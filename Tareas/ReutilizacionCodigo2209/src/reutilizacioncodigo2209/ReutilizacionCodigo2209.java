/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fesherencia.Alumno;
import javax.swing.JFrame;

public class ReutilizacionCodigo2209 {

    public static void main(String[] args) {
        String nombre = new String("Jose Jose");
        System.out.println(nombre);
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.toUpperCase());
        
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca("asus");
        miCompu.setCpu(new Procesador("Intel", 26.f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio establecer un mouse de marca Logitech tipo optico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        miCompu.setTeclado(new Teclado("Logitech", 5));
        System.out.println(miCompu);
        
        Computadora compu2 = new Computadora("apple", "MAcBook Pro",
                new Monitor("Toshiba",14.3f),
                new Mouse("acteck","optico"),
                new Teclado("Apple", 101),
                new Procesador("M1",3.4f));
        System.out.println(compu2);
        compu2.setRaton(new Mouse("apple", "Tocuh"));
        System.out.println(compu2);
        
        System.out.println("_____________________");
        Alumno alu1=new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        
        Alumno alu2 = new Alumno("12321321", "ICO", "Jose Perez", 19);
        System.out.println(alu2);
    }
   
}
