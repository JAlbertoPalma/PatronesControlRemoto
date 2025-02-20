/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utileria;

import comandos.Command;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Beto_
 */
public class ControlRemoto {
    private final Map<String, Command> commands = new HashMap<>();

  public void addCommand(String button, Command command) {
    commands.put(button, command);
  }

  public void pressButton(String button) {
    Command command = commands.get(button);
    if (command != null) {
      command.execute();
    } else {
      System.out.println("Botón no configurado");
    }
  }

}
