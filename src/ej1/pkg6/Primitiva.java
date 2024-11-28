/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1.pkg6;
import java.util.*;
/**
 *
 * @author yasse
 */
public class Primitiva {
     private SortedSet<Integer> numerosSorteo;

    // Constructor que genera los números de la primitiva
    public Primitiva() {
        numerosSorteo = new TreeSet<>();
        Random random = new Random();

        while (numerosSorteo.size() < 6) {
            int numero = random.nextInt(49) + 1; // Genera un número entre 1 y 49
            numerosSorteo.add(numero);
        }
    }

    // Método para obtener el número de aciertos
    public int calcularAciertos(Set<Integer> combinacionUsuario) {
        Set<Integer> interseccion = new HashSet<>(numerosSorteo);
        interseccion.retainAll(combinacionUsuario); // Retiene solo los números comunes
        return interseccion.size();
    }

    // Getter para los números del sorteo
    public SortedSet<Integer> getNumerosSorteo() {
        return numerosSorteo;
    }

    @Override
    public String toString() {
        return "Números del sorteo: " + numerosSorteo;
    }
}
