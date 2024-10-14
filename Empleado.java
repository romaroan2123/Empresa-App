/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author rober
 */

    public class Empleado extends Persona {
    private String puesto;

    // Constructor
    public Empleado(String nombre, int edad, String puesto) {
        super(nombre, edad);
        this.puesto = puesto;
    }

    // Método para solicitar permiso
    public String solicitudPermiso() {
        return "Permiso solicitado por " + getNombre() + " en el puesto de " + puesto;
    }

    // Método para reportar horas extra
    public String reporteHorasExtra(int horas) {
        return "Empleado " + getNombre() + " ha reportado " + horas + " horas extra.";
    }
}
