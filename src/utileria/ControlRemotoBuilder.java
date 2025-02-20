/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utileria;

import comandos.AjustarVolumenCmd;
import comandos.CambiarCanalCmd;
import comandos.EncenderCmd;

/**
 *
 * @author Beto_
 */
public class ControlRemotoBuilder {
    private final ControlRemoto remoteControl;
    private final BaseTV tv;

    public ControlRemotoBuilder(BaseTV tv) {
      this.remoteControl = new ControlRemoto();
      this.tv = tv;
    }

    // Métodos para agregar comandos específicos
    public ControlRemotoBuilder addPowerButton() {
      remoteControl.addCommand("power", new EncenderCmd(tv));
      return this;
    }

    public ControlRemotoBuilder addVolumeButtons() {
      remoteControl.addCommand("vol_up", new AjustarVolumenCmd(tv, 5));
      remoteControl.addCommand("vol_down", new AjustarVolumenCmd(tv, -5));
      return this;
    }

    public ControlRemotoBuilder addChannelButton(int channel) {
      remoteControl.addCommand("channel" + channel, new CambiarCanalCmd(tv, channel));
      return this;
    }

    // Configuraciones predefinidas
    public ControlRemoto buildSimple() {
      this.addPowerButton()
          .addVolumeButtons()
          .addChannelButton(1)
          .addChannelButton(2);
      return remoteControl;
    }

    public ControlRemoto buildAdvanced() {
      this.addPowerButton()
          .addVolumeButtons();
      for (int i = 0; i <= 9; i++) {
        this.addChannelButton(i);
      }
      return remoteControl;
    }
}
