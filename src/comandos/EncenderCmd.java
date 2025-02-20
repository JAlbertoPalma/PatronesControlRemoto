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
public class EncenderCmd implements Command{
    private final BaseTV tv;

    public EncenderCmd(BaseTV tv) {
      this.tv = tv;
    }

    @Override
    public void execute() {
      tv.encender();
    }
}
