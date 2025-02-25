/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

import comandos.AjustarVolumenCmd;
import comandos.Command;
import utileria.TV;

/**
 *
 * @author Beto_
 */
public class EjecutorAjustarVolumen implements ManejadorComando{
    ManejadorComando siguiente;
    
    @Override
    public void establecerSiguienteManejador(ManejadorComando siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarComando(Command comando) {
        if (comando instanceof AjustarVolumenCmd) {
            AjustarVolumenCmd comandoAjustarVolumen = (AjustarVolumenCmd) comando;
            TV.getInstance().ajustarVolumen(comandoAjustarVolumen.getNivel());
        } else if (siguiente != null) {
            System.out.println("El manejador pasó por el comando ajustar volumen");
            siguiente.manejarComando(comando);
        }
    }
}
