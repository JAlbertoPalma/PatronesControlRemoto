/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utileria;

import estado.EstadoApagada;
import estado.EstadoEncendida;
import estado.EstadoTV;
import java.util.ArrayList;
import java.util.List;
import observador.ObservadorTV;

/**
 *
 * @author Beto_
 */
public class TV implements BaseTV{
    // Única instancia estática y privada (eager initialization)
    private static TV instance;
    
    // Declarar el estado de la TV y la lista de observadores
    private EstadoTV estadoActual;
    private List<ObservadorTV> observadores = new ArrayList();

    // Constructor privado para evitar new TV()
    private TV() {
      System.out.println("¡TV inicializada!");
      estadoActual = new EstadoApagada();
    }

    // Método estático para acceder a la instancia
    public static TV getInstance() {
      if (instance == null) {
        instance = new TV();
      }
      return instance;
    }
    
            // Métodos de estado
    public void cambiarEstado(EstadoTV nuevoEstado){
        this.estadoActual = nuevoEstado;
    }
    
    public boolean estaEncendida(){
        return estadoActual instanceof EstadoEncendida;
    }
    
           // Métodos observadores
    public void agregarObservador(ObservadorTV observador){
        observadores.add(observador);
    }
    
    public void eliminarObservador(ObservadorTV observador){
        observadores.remove(observador);
    }
    
    public void notificarObservadores(){
        for (ObservadorTV observador : observadores) {
            observador.actualizar(estadoActual instanceof EstadoEncendida);
        }
    }

    // Métodos de la TV (ya con cambios)
    @Override
    public void encender() {
      estadoActual.presionarBotonEncendido();
      notificarObservadores();
    }

    @Override
    public void apagar() {
      estadoActual.presionarBotonEncendido();
      notificarObservadores();
    }

    @Override
    public void cambiarCanal(int canal) {
      estadoActual.presionarBotonCanal(canal);
    }

    @Override
    public void ajustarVolumen(int nivel) {
      System.out.println("Volumen ajustado a " + nivel);
    }

}
