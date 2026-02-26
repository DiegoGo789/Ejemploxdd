package ProyectoBlanco.Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Visual extends JFrame {
    
    //estos deben ser public para que el Controlador los vea
    public JButton botonAnimales;
    public JButton botonFrutas;
    public JButton botonEstaciones;
    public JButton botonDias;
    
    public Visual(){
        setTitle("Menu principal - Lecciones de ingles");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/imagenes/icono.png")));
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        JPanel panelFondo = new JPanel();
        panelFondo.setLayout(new BoxLayout(panelFondo, BoxLayout.Y_AXIS));
        panelFondo.setBackground(Color.PINK);
        panelFondo.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel titulo = new JLabel("Lecciones Disponibles");
        titulo.setForeground(Color.black);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        botonAnimales = BotonMenu("Animales - Animals");
        botonFrutas = BotonMenu("Frutas - Fruits");
        botonEstaciones = BotonMenu("Estaciones - Seasons");
        botonDias = BotonMenu("Dias - Days");
        
        panelFondo.add(titulo);
        panelFondo.add(Box.createVerticalStrut(30));
        panelFondo.add(botonAnimales);
        panelFondo.add(Box.createVerticalStrut(20));
        panelFondo.add(botonFrutas);
        panelFondo.add(Box.createVerticalStrut(20));
        panelFondo.add(botonEstaciones);
        panelFondo.add(Box.createVerticalStrut(20));
        panelFondo.add(botonDias);
        add(panelFondo);
    }

    private JButton BotonMenu(String texto){
        JButton boton = new JButton(texto);
        boton.setBackground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        return boton;
    }
    
    // public para que el Controlador pueda usarlo
    public void conectarAlControlador(ActionListener c){
        botonAnimales.addActionListener(c);
        botonFrutas.addActionListener(c);
        botonEstaciones.addActionListener(c);
        botonDias.addActionListener(c);
    }
}