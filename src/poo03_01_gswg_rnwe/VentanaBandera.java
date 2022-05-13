/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo03_01_gswg_rnwe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaBandera extends JFrame{

    private JPanel jPanel1;
    private JPanel jPanelBandera;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelBanderaList;
    
    
    public VentanaBandera(String title) {
        super(title);
        this.setSize(800, 600);
        this.setLocation(150, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarBandera();
        this.iniciarEtiquetas();
    }
   
    public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.YELLOW);
       this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.jPanel1.setLayout(new BorderLayout(3,2));
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
       this.jLabelList.get(0).setText("\n Computación");
       this.jLabelList.get(1).setBackground(Color.WHITE);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("\n Telecomunicaciones");
       this.jLabelList.get(2).setBackground(Color.PINK);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Electrónica y automatización");
       this.jLabelList.get(3).setBackground(Color.BLUE);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Automotriz");
       this.jLabelList.get(4).setBackground(Color.GREEN);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("           Mecánica          ");
       
       this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
       this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
       this.jPanel1.add(this.jLabelList.get(2),BorderLayout.EAST);
       this.jPanel1.add(this.jPanelBandera,BorderLayout.CENTER);
       this.jPanel1.add(this.jLabelList.get(4),BorderLayout.WEST);
    }
   
    public void iniciarBandera(){
       this.jPanelBandera = new JPanel();
       this.jPanelBandera.setLayout(new GridLayout(7,9));
       
       this.jLabelBanderaList = new ArrayList<>();
       
       for(var i=0;i<63;i++)
           this.jLabelBanderaList.add(new JLabel());
              
       this.jLabelBanderaList.get(0).setBackground(Color.RED);
       this.jLabelBanderaList.get(1).setBackground(Color.RED);
       this.jLabelBanderaList.get(2).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(3).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(4).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(5).setBackground(Color.RED);
       this.jLabelBanderaList.get(6).setBackground(Color.RED);  
       this.jLabelBanderaList.get(7).setBackground(Color.RED);
       this.jLabelBanderaList.get(8).setBackground(Color.RED);   
       this.jLabelBanderaList.get(9).setBackground(Color.RED);
       this.jLabelBanderaList.get(10).setBackground(Color.RED); 
       this.jLabelBanderaList.get(11).setBackground(Color.WHITE);     
       this.jLabelBanderaList.get(12).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(13).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(14).setBackground(Color.RED);     
       this.jLabelBanderaList.get(15).setBackground(Color.RED);
       this.jLabelBanderaList.get(16).setBackground(Color.RED);
       this.jLabelBanderaList.get(17).setBackground(Color.RED);       
       this.jLabelBanderaList.get(18).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(19).setBackground(Color.WHITE);  
       this.jLabelBanderaList.get(20).setBackground(Color.WHITE);     
       this.jLabelBanderaList.get(21).setBackground(Color.BLUE);    
       this.jLabelBanderaList.get(22).setBackground(Color.WHITE);     
       this.jLabelBanderaList.get(23).setBackground(Color.WHITE); 
       this.jLabelBanderaList.get(24).setBackground(Color.WHITE);     
       this.jLabelBanderaList.get(25).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(26).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(27).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(28).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(29).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(30).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(31).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(32).setBackground(Color.BLUE);      
       this.jLabelBanderaList.get(33).setBackground(Color.BLUE); 
       this.jLabelBanderaList.get(34).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(35).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(36).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(37).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(38).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(39).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(40).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(41).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(42).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(43).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(44).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(45).setBackground(Color.RED);
       this.jLabelBanderaList.get(46).setBackground(Color.RED);
       this.jLabelBanderaList.get(47).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(48).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(49).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(50).setBackground(Color.RED);
       this.jLabelBanderaList.get(51).setBackground(Color.RED);
       this.jLabelBanderaList.get(52).setBackground(Color.RED);
       this.jLabelBanderaList.get(53).setBackground(Color.RED);
       this.jLabelBanderaList.get(54).setBackground(Color.RED);
       this.jLabelBanderaList.get(55).setBackground(Color.RED);
       this.jLabelBanderaList.get(56).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(57).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(58).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(59).setBackground(Color.RED);
       this.jLabelBanderaList.get(60).setBackground(Color.RED);
       this.jLabelBanderaList.get(61).setBackground(Color.RED);
       this.jLabelBanderaList.get(62).setBackground(Color.RED);
       
       for(var i=0;i<63;i++){
           this.jPanelBandera.add(this.jLabelBanderaList.get(i));
           this.jLabelBanderaList.get(i).setOpaque(true);
       }
    }
  
}

       