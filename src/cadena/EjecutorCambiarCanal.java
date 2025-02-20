/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

import comandos.Command;

/**
 *
 * @author Beto_
 */
public class EjecutorCambiarCanal implements ManejadorComando{
    ManejadorComando siguiente;
    
    @Override
    public void establecerSiguienteManejador(ManejadorComando siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarComando(Command comando) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
