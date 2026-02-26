package ProyectoBlanco.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    public static List<Ficha> getAnimalesL1() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Perro", "Dog", "perro.png", "Perro.wav", "Dog.wav"));
        lista.add(new Ficha("Gato", "Cat", "gato.png", "Gato.wav", "Cat.wav"));
        return lista;
    }

    public static List<Ficha> getAnimalesL2() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Conejo", "Rabbit", "conejo.png", "Conejo.wav", "Rabbit.wav"));
        lista.add(new Ficha("Zorro", "Fox", "zorro.png", "Zorro.wav", "Fox.wav"));
        return lista;
    }

    public static List<Ficha> getFrutasL1() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Naranja", "Orange", "naranja.png", "Naranja.wav", "Orange.wav"));
        lista.add(new Ficha("Manzana", "Apple", "manzana.png", "Manzana.wav", "Apple.wav"));
        return lista;
    }

    public static List<Ficha> getFrutasL2() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Sandía", "Watermelon", "sandia.png", "Sandia.wav", "Watermelon.wav"));
        lista.add(new Ficha("Plátano", "Banana", "platano.png", "Platano.wav", "Banana.wav"));
        return lista;
    }

    public static List<Ficha> getEstacionesL1() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Primavera", "Spring", "primavera.png", "Primavera.wav", "Spring.wav"));
        lista.add(new Ficha("Verano", "Summer", "verano.png", "Verano.wav", "Summer.wav"));
        return lista;
    }

    public static List<Ficha> getEstacionesL2() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Otoño", "Autumn", "otoño.png", "Otoño.wav", "Autumn.wav"));
        lista.add(new Ficha("Invierno", "Winter", "invierno.png", "Invierno.wav", "Winter.wav"));
        return lista;
    }

    public static List<Ficha> getDiasL1() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Lunes", "Monday", "lunes.png", "lunes.wav", "Monday.wav"));
        lista.add(new Ficha("Martes", "Tuesday", "martes.png", "martes.wav", "Tuesday.wav"));
        return lista;
    }

    public static List<Ficha> getDiasL2() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Miércoles", "Wednesday", "miercoles.png", "miercoles.wav", "Wednesday.wav"));
        lista.add(new Ficha("Jueves", "Thursday", "jueves.png", "jueves.wav", "Thursday.wav"));
        return lista;
    }

    public static List<Ficha> getDiasL3() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Viernes", "Friday", "viernes.png", "Viernes.wav", "Friday.wav"));
        lista.add(new Ficha("Sábado", "Saturday", "sabado.png", "Sabado.wav", "Saturday.wav"));
        return lista;
    }
    
    public static List<Ficha> getDiasL4() {
        List<Ficha> lista = new ArrayList<>();
        lista.add(new Ficha("Domingo", "Sunday", "domingo.png", "Domingo.wav", "Sunday.wav"));
        return lista;
    }
}