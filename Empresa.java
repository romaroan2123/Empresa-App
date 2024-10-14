/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de Empleado y Cliente
        Empleado empleado = new Empleado("Alberto", 21, "DBA");
        Cliente cliente = new Cliente("Dennia", 24, "545332");

        // Menú instructivo
        int opcion;
        
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Solicitar permiso (Empleado)");
            System.out.println("2. Reportar horas extra (Empleado)");
            System.out.println("3. Contactar representante (Cliente)");
            System.out.println("4. Solicitar información (Cliente)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(empleado.solicitudPermiso());
                    break;
                case 2:
                    System.out.print("Ingrese el número de horas extra: ");
                    int horas = scanner.nextInt();
                    System.out.println(empleado.reporteHorasExtra(horas));
                    break;
                case 3:
                    System.out.println(cliente.contactarRepresentante());
                    break;
                case 4:
                    System.out.println(cliente.solicitarInformacion());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
        
        
        

    }
