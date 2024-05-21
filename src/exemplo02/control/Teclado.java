/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo02.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author profslvo
 */
public class Teclado implements KeyListener{

    public boolean cima,baixo,esquerda,direita;
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if(tecla==KeyEvent.VK_W){
            cima = true;
        }
        else if(tecla == KeyEvent.VK_A){
            esquerda = true;
        }
        else if(tecla == KeyEvent.VK_S){
            baixo = true;
        }
        else if(tecla == KeyEvent.VK_D){
            direita = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int tecla = e.getKeyCode();
        if(tecla==KeyEvent.VK_W){
            cima = false;
        }
        else if(tecla == KeyEvent.VK_A){
            esquerda = false;
        }
        else if(tecla == KeyEvent.VK_S){
            baixo = false;
        }
        else if(tecla == KeyEvent.VK_D){
            direita = false;
        }
    }
    
}
