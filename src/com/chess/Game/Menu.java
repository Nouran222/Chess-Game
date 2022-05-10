/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chess.Game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;


public class Menu extends JFrame implements ActionListener {
    JButton button = new JButton("Play");
    boolean did = false;
    JPanel p = new JPanel();
    JLabel label = new JLabel("Cute Chess !");
    
    public Menu ()
    {
      super();
    setTitle("Chess");
    setSize(600,600);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocation(380, 50);
    
    
//  p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
    button.setBounds(50,100,100,50);
    button.setBackground(new java.awt.Color(255, 239, 0));
   // button.setAlignmentX(Component.CENTER_ALIGNMENT);
    //button.setAlignmentY(Component.CENTER_ALIGNMENT);
    
    //label.setAlignmentX(Component.CENTER_ALIGNMENT);
    //label.setAlignmentY(Component.CENTER_ALIGNMENT);
    label.setFont(new java.awt.Font("Cooper Black", 0, 48));
    label.setForeground(new java.awt.Color(255, 204, 229));
 
    
    p.add(label);
    p.add(button);

    p.setBackground(new java.awt.Color(153, 51, 255)); this.add(p);
 
    
    GroupLayout jPanel1Layout = new GroupLayout(p);
    p.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
    .addGap(213, 213, 213)
    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGroup(jPanel1Layout.createSequentialGroup()
    .addGap(140, 140, 140)
    .addComponent(label)))
    .addContainerGap(167, Short.MAX_VALUE))
    );
    
    jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
    .addGap(97, 97, 97)
    .addComponent(label)
    .addGap(31, 31, 31)
    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(358, Short.MAX_VALUE))
    );

    GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addComponent(p, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
   
   
    
    //p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

       setVisible(true);
      button.addActionListener(this);
       
    }
 public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 
 }
 public boolean it ()
 {
     return did;     
 }
    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == button)
       {
           Game game = new Game();
           game.addspots();
           game.Setup();
       // game.setVisible(true);
       }
      
    }
    
}
