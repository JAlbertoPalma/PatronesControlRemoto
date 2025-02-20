/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadena;

import comandos.Command;

/**
 *
 * @author Beto_
 */
public interface ManejadorComando {
    void establecerSiguienteManejador(ManejadorComando siguiente);
    void manejarComando(Command comando);
}
