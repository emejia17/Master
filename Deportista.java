/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Subclase Deportista
public class Deportista extends Persona {
    private String deporte;

    // Constructor
    public Deportista(String nombre, String direccion, String deporte) {
        super(nombre, direccion);
        this.deporte = deporte;
    }

    // Método para obtener y establecer el deporte
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Deportista: " + getNombre() + ", Dirección: " + getDireccion() + ", Deporte: " + getDeporte());
    }
}