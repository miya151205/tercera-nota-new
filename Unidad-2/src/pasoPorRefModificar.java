
    // Tema: Modificar un objeto (Paso por referencia)
// Creación de la clase rectángulo
class Rectangulo {
    // Creación de los atributos del objeto
    int ancho;
    int alto;

    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}
public class pasoPorRefModificar {
    // Creación de un método para modificar los atributos del objeto
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 30;
        System.out.println("Dentro del método: ancho = " + r.ancho + ", alto = " + r.alto);
    }
    public static void main(String[] args) {
        // Creamos un objeto de la clase rectangulo y le pasamos directamente los valores

        Rectangulo miRectangulo = new Rectangulo(10, 20);
        System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
        modificarRectangulo(miRectangulo);
        System.out.println("Después de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }
}

