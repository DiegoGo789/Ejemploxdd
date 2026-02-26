package ProyectoBlanco;

import ProyectoBlanco.Vista.Visual;
import ProyectoBlanco.Controlador.Controlador;

public class Main {
    
    public static void main(String[] args) {
        //EjemploXDD
        // INICIAR LA VISTA (el menu visual)
        Visual menuPrincipal = new Visual();
        
        // INICIAR EL CONTROLADOR (el cerebro)
        new Controlador(menuPrincipal);
        
      
        menuPrincipal.setVisible(true);
    }
}