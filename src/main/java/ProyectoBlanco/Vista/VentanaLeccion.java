package ProyectoBlanco.Vista;

import ProyectoBlanco.Modelo.Ficha;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.border.EmptyBorder;

import java.util.List;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaLeccion extends JFrame {

    public VentanaLeccion(String titulo, List<Ficha> listaDeDatos, ActionListener controlador) {
        setTitle(titulo);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Panel donde irán todas las fichas
        JPanel panelContenido = new JPanel();
        panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.Y_AXIS));
        panelContenido.setBackground(Color.WHITE);
        panelContenido.setBorder(new EmptyBorder(20, 20, 20, 20)); 
        
       add(panelContenido);

        if (listaDeDatos != null) {
            for (Ficha ficha : listaDeDatos) {
                panelContenido.add(crearFila(ficha, controlador));
                panelContenido.add(Box.createVerticalStrut(20)); 
            }
        }
        
        // obliga a la ventana a dibujarse
        panelContenido.revalidate();
        panelContenido.repaint();
    }

    private JPanel crearFila(Ficha ficha, ActionListener controlador) {
        JPanel fila = new JPanel();
        fila.setLayout(new BoxLayout(fila, BoxLayout.X_AXIS));
        fila.setBorder(new EmptyBorder(10, 10, 10, 10));
        fila.setBackground(new Color(245, 245, 245));
        fila.setMaximumSize(new Dimension(Integer.MAX_VALUE, 150));

        // imagen
        JLabel lblImagen = new JLabel();
        lblImagen.setPreferredSize(new Dimension(130, 130));
        try {
            String path = "/recursos/imagenes/" + ficha.rutaImagen;
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                ImageIcon icon = new ImageIcon(imgURL);
                Image img = icon.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
                lblImagen.setIcon(new ImageIcon(img));
            } else {
                lblImagen.setText("No found: " + ficha.rutaImagen);
            }
        } catch (Exception e) { lblImagen.setText("Error"); }
        
        // botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        panelBotones.setOpaque(false);

        JButton btnIngles = new JButton("Ingles: " + ficha.nombreEn);
        JButton btnEspanol = new JButton("Español: " + ficha.nombreEs);

        // el comando es el nombre del archivo de audio
        btnIngles.setActionCommand(ficha.rutaAudioEn);
        btnEspanol.setActionCommand(ficha.rutaAudioEs);
        
        btnIngles.addActionListener(controlador);
        btnEspanol.addActionListener(controlador);

        panelBotones.add(btnIngles);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnEspanol);

        fila.add(lblImagen);
        fila.add(Box.createHorizontalStrut(20));
        fila.add(panelBotones);
        return fila;
    }
}