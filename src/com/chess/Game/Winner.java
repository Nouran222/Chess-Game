/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chess.Game;

import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author DELL
 */
public class Winner extends JFrame   {
   
    JLabel label;

    public Winner(int color)
    {
        super();
        if(color == 0)
        {
            label = new JLabel("<Black Wins>", JLabel.CENTER);
        }
        else
        {
            label = new JLabel("<White Wins>", JLabel.CENTER);
        }
        setSize(600, 200);
        setResizable(false);
        setLocation(380, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(249, 235, 223));
        add(label);
        label.setFont(new java.awt.Font("No Virus", 0, 90));
        label.setAlignmentX(0);
        label.setAlignmentY(0);
        setVisible(true);
        
    }

}
