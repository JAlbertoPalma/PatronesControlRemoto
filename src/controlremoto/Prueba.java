/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlremoto;

import cadena.EjecutorAjustarVolumen;
import cadena.EjecutorCambiarCanal;
import cadena.ManejadorComando;
import cadena.ValidadorEstado;
import comandos.AjustarVolumenCmd;
import comandos.CambiarCanalCmd;
import comandos.Command;
import comandos.EncenderCmd;
import observador.Bocinas;
import observador.Sintonizador;
import utileria.ControlRemoto;
import utileria.ControlRemotoBuilder;
import utileria.TV;

/**
 *
 * @author Beto_
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        TV tv = TV.getInstance();
//
//        // Construcción con Builder
//        ControlRemotoBuilder builder = new ControlRemotoBuilder(tv);
//
//        // Control remoto simple (solo power, volumen, canales 1 y 2)
//        ControlRemoto simpleRemote = builder.buildSimple();
//        simpleRemote.pressButton("power"); // Enciende TV
//        simpleRemote.pressButton("channel1"); // Canal 1
//
//        // Control remoto avanzado (power, volumen, canales 0-9)
//        ControlRemoto advancedRemote = builder.buildAdvanced();
//        advancedRemote.pressButton("channel5"); // Canal 5
//
//
//        TV smartTV = TV.getInstance();
//        ControlRemoto remote = new ControlRemoto();
//
//        // Configurar comandos
//        remote.addCommand("power", new EncenderCmd(smartTV));
//        remote.addCommand("vol_up", new AjustarVolumenCmd(smartTV, 10));
//
//        // Simular pulsación de botones
//        remote.pressButton("power"); // Enciende TV
//        remote.pressButton("vol_up"); // Volumen ajustado a 10
//        remote.pressButton("power"); // Apaga TV (silencia bocinas)
        // Instanciamos la TV
        TV smartTV = TV.getInstance();
        
        // Crear subsistemas (Observadores)
        Bocinas bocinas = new Bocinas();
        Sintonizador sintonizador = new Sintonizador();

        // Agregar observadores a la TV
        smartTV.agregarObservador(bocinas);
        smartTV.agregarObservador(sintonizador);

        // Crear comandos
        Command comandoCambiarCanal = new CambiarCanalCmd(smartTV, 5);
        Command comandoAjustarVolumen = new AjustarVolumenCmd(smartTV, 17);

        //Creamos manejadores (Chain of Responsibility)
        ManejadorComando validadorEstado = new ValidadorEstado();
        ManejadorComando ejecutorCambioCanal = new EjecutorCambiarCanal();
        ManejadorComando ejecutorAjusteVolumen = new EjecutorAjustarVolumen();

        //Configurar la cadena
        validadorEstado.establecerSiguienteManejador(ejecutorCambioCanal);
        ejecutorCambioCanal.establecerSiguienteManejador(ejecutorAjusteVolumen);

        // Simulamos interacciones
        smartTV.encender();
        validadorEstado.manejarComando(comandoCambiarCanal);
        validadorEstado.manejarComando(comandoAjustarVolumen);
        smartTV.apagar();
        
        //Se tiene que validar y en teoría nos daría un mensaje de invalidez
        validadorEstado.manejarComando(comandoCambiarCanal); 
    }
    
}
