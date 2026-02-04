/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter2;

/**
 *
 * @author labesp
 */
public class ReproductorAdapter implements Reproductor{
     private ReproductorMp4 mp4;

    public ReproductorAdapter(ReproductorMp4 mp4) {
        this.mp4 = mp4;
    }
     
    @Override
    public void reproducir(String archivo) {
        mp4.playMp4(archivo); //reproduce un archivo mp4 en un reproductor mp3
    }
    
}
