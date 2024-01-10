/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * 
 */
public class TicTacToe implements ActionListener {
    
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    
    
    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        
        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));
        
        for(int i=0;i<9;i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);
        
        firstTurn();
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        for(int i=0;i<9;i++){
            if(e.getSource()==buttons[i]){
                if(player1_turn) {
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textfield.setText("O Turn");
                        check();
                    }
                }
                else{
                   if(buttons[i].getText()==""){
                       buttons[i].setForeground(new Color(0,0,255));
                       buttons[i].setText("O");
                       player1_turn=true;
                       textfield.setText("X Turn");
                       check();
                    }
                }
            }
        }
        
    }
    public void firstTurn(){
       
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(random.nextInt(2)==0){
            player1_turn=true;
            textfield.setText("X turn");
        }
        else{
            player1_turn=false;
            textfield.setText("O turn");
        }
    }
    
    
    public void check(){
        //check X Win Konditionen
        if(     
                (buttons[0].getText()=="X") &&
                (buttons[1].getText()=="X") &&
                (buttons[2].getText()=="X")
                ){
            
        }
        
        //check O Win Konditionen
    }
    
    
    public void xWins(int a, int b, int c){
        
    }
    
    
    public void oWins(int a, int b, int c){
        
    }
    
}
