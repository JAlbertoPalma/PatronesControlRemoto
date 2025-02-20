/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observador;

/**
 *
 * @author Beto_
 */
public class Bocina implements ObservadorTV{

    @Override
    public void actualizar(boolean encendida) {
        if(encendida){
            System.out.println("Las bocinas se han encendido");
        } else {
            System.out.println("Las bocinas se han apagado");
        }
    }
    
}
