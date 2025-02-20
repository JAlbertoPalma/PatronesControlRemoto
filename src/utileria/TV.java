/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utileria;

/**
 *
 * @author Beto_
 */
public class TV implements BaseTV{
    // Única instancia estática y privada (eager initialization)
    private static TV instance;

    // Constructor privado para evitar new TV()
    private TV() {
      System.out.println("¡TV inicializada!");
    }

    // Método estático para acceder a la instancia
    public static TV getInstance() {
      if (instance == null) {
        instance = new TV();
      }
      return instance;
    }

    // Métodos de la TV (sin cambios)
    @Override
    public void encender() {
      System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
      System.out.println("TV apagada");
    }

    @Override
    public void cambiarCanal(int canal) {
      System.out.println("Cambiando al canal " + canal);
    }

    @Override
    public void ajustarVolumen(int nivel) {
      System.out.println("Volumen ajustado a " + nivel);
    }

}
