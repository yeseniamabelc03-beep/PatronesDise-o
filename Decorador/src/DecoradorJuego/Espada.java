/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author labesp
 */
public class Espada extends PersonajeDecorador{

    public Espada(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescricion() {
       return personaje.getDescricion() + " + Espada";
    }

    @Override
    public int getDefensa() {
        return personaje.getDefensa();
    }

    @Override
    public int getAtaque() {
       return personaje.getDefensa() + 10;
    
    }
    
}
