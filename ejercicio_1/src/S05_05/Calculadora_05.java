package S05_05;

import javax.swing.JOptionPane;

public class Calculadora_05 {

    //atributos (caracteristicas)
    int num1;
    int num2;
    int suma;
    int resta;

    //metodos (acciones)
    public void sumar() {

        suma = num1+ num2;
    }

    public void restar() {
        
         resta = num1 - num2;
        
    }

    public void ingresarDatos() {

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
    }

    public void mostrarDatos() {

        JOptionPane.showMessageDialog(null,"La suma es " + suma + "\n" + "La resta es " + resta);
    }

}
