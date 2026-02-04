/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author labesp
 */
public class Escudo extends PersonajeDecorador{

    public Escudo(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescricion() {
       return personaje.getDescricion() + " + Escudo";
    }

    @Override
    public int getDefensa() {
       return personaje.getDefensa() + 10;
    }

    @Override
    public int getAtaque() {
       return personaje.getAtaque();
    }
    
}
