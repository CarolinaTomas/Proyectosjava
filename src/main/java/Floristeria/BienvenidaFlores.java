/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Floristeria;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class BienvenidaFlores extends JFrame implements ActionListener, FocusListener {
    private JTextField nombreField;
    private JButton siguienteBtn;
    private JLabel nombreLbl, marcaLbl;
    private ImageIcon logo;
    
    public BienvenidaFlores(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        // Icono de inicio
        // cargar imagen
        logo = new ImageIcon(("C:\\Users\\wcaro\\OneDrive\\Documentos\\NetBeansProjects\\FloristeriaWendy\\src\\main\\java\\Floristeria\\lflor.png"));
        Image logoDimension = logo.getImage().getScaledInstance(200,200 ,Image.SCALE_SMOOTH);
        ImageIcon adjustedlogo = new ImageIcon(logoDimension);
        JLabel imageLabel = new JLabel(adjustedlogo);
        imageLabel.setBounds(150, 20, 200, 200);
        this.add(imageLabel);
        
        //Icono en la barra de título
        this.setIconImage(logo.getImage());
        
        //Etiqueta nombre
        nombreLbl = new JLabel("Nombre");
        nombreLbl.setFont(new Font("Arial", Font.BOLD, 20));
        nombreLbl.setBounds(75, 230, 350, 30);
        nombreLbl.setForeground(Color.WHITE);
        this.add(nombreLbl);
        
        //Campo para introducir el nombre
        nombreField = new JTextField("Escriba su nombre aquí");
        nombreField.setBounds(120, 270, 260, 25);
        nombreField.addFocusListener(this);
        this.add(nombreField);
        
        //Botón siguiente
        siguienteBtn = new JButton("Siguiente");
        siguienteBtn.setBounds(170,310,160,40);
        siguienteBtn.setForeground(Color.WHITE);
        siguienteBtn.setBackground(new Color(186,85,211));
        siguienteBtn.setOpaque(true);
        siguienteBtn.setBorderPainted(false);
        siguienteBtn.addActionListener(this);
        this.add(siguienteBtn);
        
        //Etiqueta marca
        marcaLbl = new JLabel("©2024 WENDYTOMAS FLORISTERIA. Wendy Tomas Tubac, Programación 2,secciónA");
        marcaLbl.setFont(new Font("Arial", Font.ITALIC, 8));
        marcaLbl.setBounds(100, 365, 350, 30);
        marcaLbl.setForeground(Color.WHITE);
        this.add(marcaLbl);
        
        //Ventana Bienvenida
        this.setTitle("Bienvenida");
        this.setLocationRelativeTo(null);
        this.setSize(500, 450);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.pink);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==siguienteBtn){
            String nombre = nombreField.getText();
            if (nombre.isEmpty()||nombre.equals("Escriba su nombre aquí")){
                JOptionPane.showMessageDialog(this, "Ingrese su nombre", "ERROR",0);
            } else {
                MainFlores.usuario=nombre;
                Terminos Terminos = new Terminos();
                this.dispose();
            }
        }
    }

    @Override
    public void focusGained(FocusEvent fe) {
       if (fe.getSource()==nombreField){
           if(nombreField.getText().equals("Escriba su nombre aquí")){
               nombreField.setText("");
               nombreField.setForeground(Color.BLACK);
           }
       }
    }

    @Override
    public void focusLost(FocusEvent fe) {
       if (fe.getSource()==nombreField){
           if(nombreField.getText().equals("")){
               nombreField.setText("Escriba su nombre aquí");
               nombreField.setForeground(Color.BLACK);
           }
       }
    }
    
}
    
    

   

