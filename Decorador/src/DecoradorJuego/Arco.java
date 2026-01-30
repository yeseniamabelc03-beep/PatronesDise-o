/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author labesp
 */
public class Arco extends PersonajeDecorador{

    public Arco(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescricion() {
       return personaje.getDescricion() + " + Arco";
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
