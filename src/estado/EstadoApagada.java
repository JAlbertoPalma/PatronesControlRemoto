/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estado;

/**
 *
 * @author Beto_
 */
public class EstadoApagada implements EstadoTV{

    @Override
    public void presionarBotonEncendido() {
        tv.getInstance().cambiarEstado(new EstadoEncendida());
        System.out.println("TV encendida");
    }

    @Override
    public void presionarBotonCanal(int canal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
