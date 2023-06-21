package clase3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import otroPaquete.Hermano;

public class Clase3 {

    public static void main(String[] args) {

        // ARREGLO DINAMICO
        ArrayList arreglo = new ArrayList();
        arreglo.add(0);
        arreglo.add(0.23);
        arreglo.add("A");
        arreglo.add("Oracion");
        arreglo.add(true);
        arreglo.add(false);
        arreglo.add('\uFFFF');

        System.out.println(arreglo);

        
        
        
        // ITERACIONES 
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println("For i: " + arreglo.get(i));
        }

        arreglo.remove(true);

        for (Object item : arreglo) {
            System.out.println("For(:) : " + item + "    " + item.getClass());
        }

        arreglo.remove("A");

        arreglo.forEach((item) -> {
            System.out.printf("forEach: %s %s%n", item, item.getClass().getName());
        });

        
        
        
        // JOPTIONPANE
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número con coma"));
        char letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);

        System.out.printf("Los números ingresados son %d y %.2f y la letra es %c%n", numero1, numero2, letra);

        
        
        
        
        // SOBRECARGA DE CONSTRUCTORES
        
        Sobrecarga primeraClase = new Sobrecarga();
        System.out.println(primeraClase.edad);
        System.out.println(primeraClase.nombre);

        Sobrecarga segundaClase = new Sobrecarga(25);
        System.out.println(segundaClase.edad);
        System.out.println(segundaClase.nombre);

        Sobrecarga terceraClase = new Sobrecarga(30, "Felipe");
        System.out.println(terceraClase.edad);
        System.out.println(terceraClase.nombre);

        // HERENCIA
        
        Hijo hijo = new Hijo(10);
        System.out.println(hijo.pertenencia);
        System.out.println(hijo.herenciaPadre);
        System.out.println("valorPadre: " + hijo.valorPadre);
        System.out.println("valorAbuelo: " + hijo.herenciaDelAbuelo);
        hijo.saludoAbuelo();
        
        Hermano hermano = new Hermano(7);
        System.out.println(hermano.herenciaProtegidaPadre);
    }

}
