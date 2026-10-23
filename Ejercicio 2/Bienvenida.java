public class Bienvenida {
    // Usa void porque imprime y no devuelve un valor.
    public void saludar(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes "
                + edad + " años. ¡Bienvenido al sistema!");
    }

    public static void main(String[] args) {
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.saludar("Antony", 19);
    }
}
