/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_05;

/**
 *
 * @author Lab12
 */
public class Persona {
    //Atributos
    
    double altura;
    String apellido;
    int dni;
    int edad;
    String nombre;
    
    //Metodos
    
    public void saludar(){
        System.out.println("hola yo soy" + nombre);
    }
    
    public void caminar(){
        System.out.println("la persona esta caminando");
    }
    public void hablar(){
        System.out.println("La persona esta hablando");
    }
    
}
