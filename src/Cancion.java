public class Cancion implements Multimedia{
    @Override
    public void grabar() {
        System.out.println("Grabando canción...");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción...");
    }
}
