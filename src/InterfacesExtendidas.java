public class InterfacesExtendidas {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();

        Reproducible reproducible =cancion;
        Grabable grabable= cancion;
        Multimedia multimedia = cancion;

        // Variable Reproducible:
        // Solo puede llamar al método reproducir(),
        // porque pertenece a la interfaz Reproducible.

        reproducible.reproducir();

        // Variable Grabable:
        // Solo puede llamar al método grabar(),
        // porque pertenece a la interfaz Grabable.
        grabable.grabar();

        // Variable Multimedia:
        // Puede llamar a reproducir() y grabar(),
        // porque Multimedia extiende ambas interfaces.
        multimedia.reproducir();
        multimedia.grabar();

        Telefono telefono = new Telefono();

        telefono.conectar();

        /*
        El error que da al compilar el programa es que java no sabe que
        metodo utilizar si el de conectar de wifi o el de bluetooth
        al ser dos metodo defaults, la solucion a ello es sobreescribir
        el metodo conectar y poner delante del super el nombre de la clase
        a la que quieres que acceda
        */
    }
}