/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacg;

import javax.swing.JFrame;

/**
 *
 * @author Edson Bruno
 */
public class AulasCG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Desenha Reta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.add(new DesenhaFormas());
        frame.setVisible(true);
    }
    
}
