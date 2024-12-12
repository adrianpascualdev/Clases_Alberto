package objetos;

public class Persona {

    // nombre, apellidos, edad, dni
    private String dni;

    private String nombre;

    private String apellido;

    private int edad;

    public Persona(String dni, String nombre, String apellido, int edad) {
        if (dni.length() != 9) {
            throw new RuntimeException("Dni incorrecto");
        }
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // si altera valor de la clase -> void || si devuelve tipo correspondiente

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        if (dni.length() != 9) {
            throw new RuntimeException("Dni incorrecto");
        }
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Persona) {
            Persona persona = (Persona) object;
//            return this.dni.equals(persona.getDni()) && this.nombre.equals(persona.getNombre()) && this.apellido.equals(persona.getApellido()) && this.edad == persona.getEdad();
            return this.dni.equals(persona.getDni());
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Persona -> Dni: %s, Nombre: %s, Apellidos: %s, Edad: %d", dni, nombre, apellido, edad);
        // return "Perdona: Dni " + dni + " Nombre: " + nombre;
    }

}
