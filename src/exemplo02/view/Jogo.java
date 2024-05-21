/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo02.view;

import exemplo02.control.Teclado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author profslvo
 */
public class Jogo extends JPanel implements Runnable {

    //As imagens terão 48x48px
    final int tamanhoTile = 48;
    
    //Configurando a tela
    //Largura
    final int colunas = 10;
    final int larguraTela = colunas * tamanhoTile;
    //Altura
    final int linhas = 10;
    final int alturaTela = linhas * tamanhoTile;
    
    //Posicionamento inicial do retângulo
    int x = 100;
    int y = 100;
    
    //Carregar a classe de movimento
    Teclado tc = new Teclado();
    
    public Jogo(){
        this.setPreferredSize(new Dimension(larguraTela,alturaTela));
        //PINTAR O FUNDO DO PAINEL
        this.setBackground(Color.PINK);
        //Carregar a imagem antes da atualização da tela
        this.setDoubleBuffered(true);
        //Adicionar um Listener de Teclado
        this.addKeyListener(tc);
        //Forçar que a janela seja criada no foco
        setFocusable(true);
    }
    
    public void atualizar(){
        if(tc.cima == true){
            y -= 10;
        }
        else if(tc.baixo == true){
            y += 10;
        }
        else if(tc.esquerda == true){
            x -= 10;
        }
        else if(tc.direita == true){
            x += 10;
        }
    }
    
    public void paintComponent(Graphics g){
        //Desenhar a informação no painel
        super.paintComponent(g);
        //Criar uma forma geométrica
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.red);
        
        g2.fillRect(100, 100, tamanhoTile, tamanhoTile);
        
        g2.dispose();
    }
    
    @Override
    public void run() {
        atualizar();
    }
    
}
