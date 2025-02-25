/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estado;

import utileria.TV;

/**
 *
 * @author Beto_
 */
public class EstadoEncendida implements EstadoTV{

    @Override
    public void presionarBotonEncendido() {
        TV.getInstance().cambiarEstado(new EstadoApagada());
        System.out.println("Se ha apagado la TV");
    }

    @Override
    public void presionarBotonCanal(int canal) {
        System.out.println("Cambiando al canal: " + canal);
    }
    
}
