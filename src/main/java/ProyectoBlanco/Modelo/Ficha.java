package ProyectoBlanco.Modelo;

public class Ficha {
    public String nombreEs;
    public String nombreEn;
    public String rutaImagen;
    public String rutaAudioEs;
    public String rutaAudioEn;

    public Ficha(String es, String en, String img, String audioEs, String audioEn) {
        this.nombreEs = es;
        this.nombreEn = en;
        this.rutaImagen = img;
        this.rutaAudioEs = audioEs;
        this.rutaAudioEn = audioEn;
    }
}