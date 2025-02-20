/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comandos;

import utileria.BaseTV;

/**
 *
 * @author Beto_
 */
public class CambiarCanalCmd implements Command{
    private final BaseTV tv;
    private final int canal;

    public CambiarCanalCmd(BaseTV tv, int canal) {
      this.tv = tv;
      this.canal = canal;
    }

    @Override
    public void execute() {
      tv.cambiarCanal(canal);
    }

}
