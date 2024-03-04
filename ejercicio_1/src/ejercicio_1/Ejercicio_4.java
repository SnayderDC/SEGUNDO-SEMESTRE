/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Lab5
 */
import javax.swing.JOptionPane;
class ejercicio4 {
  
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Ingresa el primer número:");
        String numero2 = JOptionPane.showInputDialog("Ingresa el segundo número:");


        double resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);


        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
        System.exit(0);
    }

}
