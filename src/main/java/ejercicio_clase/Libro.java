package ejercicio_clase;

public class Libro {

    // titulo, autor, anioPublicacion, disponible

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true; // Por defecto, está disponible
    }

    // prestamo, devolucion, muestrarLibro, getTitulo

    public String getTitulo() {
        return this.titulo;
    }

    public void prestamo() {
        if (this.disponible) {
            this.disponible = false;
            System.out.printf("EL libro %s ha sido prestado %n", titulo);
        }else {
            System.out.printf("EL libro %s no se puede prestar, no está disponible! %n", titulo);
        }
    }

    public void devolucion() {
        if (!this.disponible) {
            this.disponible = true;
            System.out.printf("Se ha devuelto el libro %s correctamente %n", titulo);
        }else {
            System.out.printf("EL libro %s no se ha podido devoler! %n", titulo);
        }
    }

    @Override
    public String toString() {
        return String.format("Libro -> Titulo: %s, Autor: %s, Año: %d, Disponible: %b", this.titulo, this.autor, this.anioPublicacion, this.disponible);
    }

}
