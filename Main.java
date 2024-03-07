/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Doctor y Deportista
        Doctor doctor = new Doctor("Dr. Smith", "Calle Principal 123", "Cardiología");
        Deportista deportista = new Deportista("Juan Pérez", "Avenida Central 456", "Fútbol");

        // Mostrar información de Doctor y Deportista
        doctor.mostrarInformacion();
        deportista.mostrarInformacion();
    }
}

