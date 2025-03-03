/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

import comandos.CambiarCanalCmd;
import comandos.Command;
import utileria.TV;

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
        if (comando instanceof CambiarCanalCmd) {
            CambiarCanalCmd comandoCambiarCanal = (CambiarCanalCmd) comando;
            TV.getInstance().cambiarCanal(comandoCambiarCanal.getCanal());
        } else if (siguiente != null) {
            System.out.println("El manejador pasó por el comando cambiar canal");
            siguiente.manejarComando(comando);
        }
    }
    
}
