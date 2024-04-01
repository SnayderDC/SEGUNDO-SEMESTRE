/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S05_05;

/**
 *
 * @author Lab12
 */
public class MainS05_05 {
    public static void main(String[] args) {
        
        Calculadora_05 obj1 = new Calculadora_05();
        
        obj1.ingresarDatos();
        obj1.num1 = 10;
        obj1.num2 = 20;
        obj1.sumar();
        obj1.restar();
        obj1.mostrarDatos();
        
        
       
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.altura = 1.70;
        persona1.apellido = "del carpio";
        persona1.dni = 74778044;
        persona1.edad = 24;
        persona1.nombre = "Snayder";
                
        persona2.altura = 1.70;
        persona2.apellido = "del carpio";
        persona2.dni = 74778044;
        persona2.edad = 24;
        persona2.nombre = "Snayder";
        
        

    }
}
