/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author labesp
 */
public class PersonajeBase implements Personaje{

    @Override
    public String getDescricion() {
      return "Crash";
    }

    @Override
    public int getDefensa() {
        return 10;
    }

    @Override
    public int getAtaque() {
       return 10;
    }
    
}
