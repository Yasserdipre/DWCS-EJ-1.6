/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1.pkg6;
import java.util.*;
/**
 *
 * @author yasse
 */
public class EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Primitiva primitiva = new Primitiva();
        System.out.println(primitiva);

        while (true) {
            try {
                System.out.println("Introduce tu boleto (6 números entre 1 y 49, sin repetidos): ");
                String input = scanner.nextLine();
                String[] numeros = input.split(" ");
                
                if (numeros.length != 6) {
                    throw new IllegalArgumentException("Debe ingresar exactamente 6 números.");
                }

                Set<Integer> boletoUsuario = new HashSet<>();
                for (String num : numeros) {
                    int numero = Integer.parseInt(num); // Convierte a entero
                    if (numero < 1 || numero > 49) {
                        throw new IllegalArgumentException("Los números deben estar entre 1 y 49.");
                    }
                    if (!boletoUsuario.add(numero)) {
                        throw new IllegalArgumentException("No puede haber números repetidos.");
                    }
                }

                int aciertos = primitiva.calcularAciertos(boletoUsuario);
                System.out.println("Tu boleto: " + boletoUsuario);
                System.out.println("Aciertos: " + aciertos);

                System.out.println("¿Quieres jugar otra vez? (s/n)");
                String respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Solo se permiten números enteros.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
