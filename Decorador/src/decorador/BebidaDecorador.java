/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author labesp
 */
public abstract class BebidaDecorador implements Bebida{ //agrgar caracteristicas
    protected Bebida bebida;

    public BebidaDecorador(Bebida bebida) {
        this.bebida = bebida;
    }
    
    
}
