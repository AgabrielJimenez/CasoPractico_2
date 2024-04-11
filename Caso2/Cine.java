/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Cine {
    // Por aquí un poco de lo que se lleva en la clase, por ejemplo el tamaño de la matriz. 
    private static final int FILAS = 5;
    private static final int COLUMNAS = 10;
    private static String[][] asientos = new String[FILAS][COLUMNAS];
    private static String peliculaActual = "Película Actual";

    public static void inicializarAsientos() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                asientos[i][j] = "L" + (i + 1) + "C" + (j + 1);
            }
        }
    }

    public static String[][] getAsientos() {
        return asientos;
    }

    public static void setAsientos(String[][] asientos) {
        Cine.asientos = asientos;
    }

    public static String getPeliculaActual() {
        return peliculaActual;
    }

    public static void setPeliculaActual(String peliculaActual) {
        Cine.peliculaActual = peliculaActual;
    }
// Por aquí tenemos un poco de como se va a mostrar los asientos asignados. 
    public static void mostrarAsientos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asientos Disponibles:\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sb.append(asientos[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append("Pelicula Actual: ").append(peliculaActual);
        JOptionPane.showMessageDialog(null, sb.toString(), "Asientos Disponibles", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void modificarPelicula() {
        String nuevaPelicula = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva película:", "Modificar Película", JOptionPane.QUESTION_MESSAGE);
        if (nuevaPelicula != null && !nuevaPelicula.isEmpty()) {
            peliculaActual = nuevaPelicula;
            JOptionPane.showMessageDialog(null, "La película ha sido modificada correctamente.", "Modificar Película", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de película inválido.", "Modificar Película", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void asignarAsiento() {
        String filaStr = JOptionPane.showInputDialog(null, "Ingrese la fila del asiento:", "Asignar Asiento", JOptionPane.QUESTION_MESSAGE);
        String columnaStr = JOptionPane.showInputDialog(null, "Ingrese la columna del asiento:", "Asignar Asiento", JOptionPane.QUESTION_MESSAGE);

        try {
            int fila = Integer.parseInt(filaStr);
            int columna = Integer.parseInt(columnaStr);

            if (fila >= 1 && fila <= FILAS && columna >= 1 && columna <= COLUMNAS) {
                asientos[fila - 1][columna - 1] = "OCUPADO";
                JOptionPane.showMessageDialog(null, "Asiento asignado correctamente.", "Asignar Asiento", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Asiento inválido.", "Asignar Asiento", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Asignar Asiento", JOptionPane.ERROR_MESSAGE);
        }
    }
}

