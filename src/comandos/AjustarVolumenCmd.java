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
public class AjustarVolumenCmd implements Command{
    private final BaseTV tv;
    private final int nivel;

    public AjustarVolumenCmd(BaseTV tv, int nivel) {
      this.tv = tv;
      this.nivel = nivel;
    }

    @Override
    public void execute() {
      tv.ajustarVolumen(nivel);
    }
}
