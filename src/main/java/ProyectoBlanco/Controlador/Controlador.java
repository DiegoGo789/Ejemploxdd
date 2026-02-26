package ProyectoBlanco.Controlador;


import ProyectoBlanco.Modelo.Ficha;
import ProyectoBlanco.Modelo.Repositorio;
import ProyectoBlanco.Vista.VentanaLeccion;
import ProyectoBlanco.Vista.Visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener {
    private Visual vistaMenu; 

    public Controlador(Visual vi){
        this.vistaMenu = vi;
        this.vistaMenu.conectarAlControlador(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // --- AUDIO ---
        String comando = e.getActionCommand();
        if (comando != null && comando.endsWith(".wav")) {
            sonar(comando);
            return;
        }

        List<Ficha> datos = null;
        String titulo = "";

        // --- BOTONES DEL MENÚ ---
        if(e.getSource() == vistaMenu.botonAnimales){
            int resp = selector("Animales", "L1: Perro/Gato", "L2: Conejo/Zorro");
            if (resp == 0) { datos = Repositorio.getAnimalesL1(); titulo = "Animales L1"; }
            else if (resp == 1) { datos = Repositorio.getAnimalesL2(); titulo = "Animales L2"; }
        }
        else if(e.getSource() == vistaMenu.botonFrutas){
            int resp = selector("Frutas", "L1: Naranja/Manzana", "L2: Sandía/Plátano");
            if (resp == 0) { datos = Repositorio.getFrutasL1(); titulo = "Frutas L1"; }
            else if (resp == 1) { datos = Repositorio.getFrutasL2(); titulo = "Frutas L2"; }
        }
        else if(e.getSource() == vistaMenu.botonEstaciones){
            int resp = selector("Estaciones", "L1: Prima/Vera", "L2: Otoño/Invierno");
            if (resp == 0) { datos = Repositorio.getEstacionesL1(); titulo = "Estaciones L1"; }
            else if (resp == 1) { datos = Repositorio.getEstacionesL2(); titulo = "Estaciones L2"; }
        }
        else if(e.getSource() == vistaMenu.botonDias){
            String[] opts = {"L1: Lun-Mar", "L2: Mié-Jue", "L3: Vie-Sáb", "L4: Dom"};
            int resp = JOptionPane.showOptionDialog(vistaMenu, "Elige días:", "Días", 0, -1, null, opts, opts[0]);
            if (resp == 0) datos = Repositorio.getDiasL1();
            else if (resp == 1) datos = Repositorio.getDiasL2();
            else if (resp == 2) datos = Repositorio.getDiasL3();
            else if (resp == 3) datos = Repositorio.getDiasL4();
            titulo = "Días de la Semana";
        }

        if(datos != null){
            new VentanaLeccion(titulo, datos, this).setVisible(true);
        }
    }

    private void sonar(String archivo) {
        try {
            java.net.URL url = getClass().getResource("/recursos/audios/" + archivo);
            if (url != null) {
                AudioInputStream ais = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                clip.start();
            }
        } catch (Exception ex) { System.err.println("Audio error: " + archivo); }
    }

    private int selector(String t, String o1, String o2) {
        String[] opts = {o1, o2};
        return JOptionPane.showOptionDialog(vistaMenu, "Elige nivel:", t, 0, -1, null, opts, opts[0]);
    }
}