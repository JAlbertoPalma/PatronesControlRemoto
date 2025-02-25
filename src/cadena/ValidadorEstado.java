/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

import comandos.Command;
import utileria.TV;

/**
 *
 * @author Beto_
 */
public class ValidadorEstado implements ManejadorComando{
    private ManejadorComando siguiente;

    @Override
    public void establecerSiguienteManejador(ManejadorComando siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarComando(Command comando) {
        if (TV.getInstance().estaEncendida()) {
            siguiente.manejarComando(comando);
        } else {
            System.out.println("La TV está apagada, no se puede ejecutar el comando");
        }
    }
}
