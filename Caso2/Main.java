/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cine.inicializarAsientos();
        mostrarMenu();
    }

    private static void mostrarMenu() {
        String[] opciones = { "Mostrar Asientos", "Modificar Película", "Asignar Asiento", "Salir" };
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Cine", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    Cine.mostrarAsientos();
                    break;
                case 1:
                    Cine.modificarPelicula();
                    break;
                case 2:
                    Cine.asignarAsiento();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}