public class Telefono implements Wifi, Bluetooth{
    @Override
    public void conectar() {
        // Llamamos explícitamente al método de la interfaz Wifi.
        Wifi.super.conectar();
        // Mostramos un mensaje propio del teléfono.
        System.out.println("El teléfono se ha conectado correctamente.");
    }
}
