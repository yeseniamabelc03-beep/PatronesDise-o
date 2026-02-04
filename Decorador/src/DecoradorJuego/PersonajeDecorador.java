/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author labesp
 */
public abstract class PersonajeDecorador implements Personaje{
    protected Personaje personaje;

    public PersonajeDecorador(Personaje personaje) {
        this.personaje = personaje;
    }
    
}
