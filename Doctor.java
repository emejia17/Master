/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Subclase Doctor
public class Doctor extends Persona {
    private String especialidad;

    // Constructor
    public Doctor(String nombre, String direccion, String especialidad) {
        super(nombre, direccion);
        this.especialidad = especialidad;
    }

    // Método para obtener y establecer la especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Doctor: " + getNombre() + ", Dirección: " + getDireccion() + ", Especialidad: " + getEspecialidad());
    }
}