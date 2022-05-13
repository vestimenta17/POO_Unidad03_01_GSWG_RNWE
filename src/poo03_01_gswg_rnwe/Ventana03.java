/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo03_01_gswg_rnwe;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @Guallimba, Ramón
 */
public class Ventana03 extends JFrame{

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    
   public Ventana03(String title) {
        super(title);
        this.setSize(400, 200);
        this.setLocation(50, 85);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.WHITE);
       this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.jPanel1.setLayout(new GridLayout(1,4));
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setBackground(Color.ORANGE);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("Computación");
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("           2");
       this.jLabelList.get(2).setBackground(Color.PINK);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Electrónica y automatización");
       this.jLabelList.get(3).setBackground(Color.CYAN);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Automotriz");
       this.jLabelList.get(4).setBackground(Color.GREEN);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Mecánica");
       
       this.jPanel1.add(this.jLabelList.get(0));
       this.jPanel1.add(this.jLabelList.get(1));
       this.jPanel1.add(this.jLabelList.get(2));
       this.jPanel1.add(this.jLabelList.get(3));
       this.jPanel1.add(this.jLabelList.get(4));
       
       
   }

   
}