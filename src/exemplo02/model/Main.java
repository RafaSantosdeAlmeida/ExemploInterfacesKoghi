/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo02.model;

import exemplo02.view.Jogo;
import javax.swing.JFrame;

/**
 *
 * @author profslvo
 */
public class Main extends JFrame{
    
    public Main(){
        initComponentes();
    }
    
    private void initComponentes(){
        //Definir a ação de fechamento
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Coloca o título
        setTitle("Oba, beleza mestrão");
        //Desabilitar o redimensionamento
        setResizable(false);
        
        Jogo panel = new Jogo();
        add(panel);
        pack();
        
        //Para criar a janela sempre centralizada
        setLocationRelativeTo(null);
        //Deixar o frame visivel
        setVisible(true);
    }
    
    public static void main(String[] args){
        Main janela = new Main();
    }
    
}