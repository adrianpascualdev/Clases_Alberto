package objetos;

public class Ejecutar {

    public static void main(String[] args) {
        Persona adrian1 = new Persona("29182819A", "Adrian", "Perez Palacios", 18);
        Persona adrian2 = new Persona("29182819A", "Adrian", "Perez Palacios", 18);
        if (adrian1.equals(adrian2)) {
            System.out.println("Son la misma");
        }else {
            System.out.println("No son la misma");
        }
        Persona adrian3 = new Persona("29182819A", "Adrian", "Perez Palacios", 18);
        Persona adrian4 = new Persona("29182819A", "Adrian", "Perez Palacios", 18);
        if (adrian3.equals(adrian4))
    }

}
