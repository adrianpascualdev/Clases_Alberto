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

        Vehiculo vehiculo = new Vehiculo("ASDADA", 4);
        Vehiculo vehiculo1 = new Vehiculo("ASDADDD", 4);
        if (vehiculo.equals(vehiculo1)) {
            System.out.println("Son el mismo");
        }else {
            System.out.println("No son el mismo");
        }
    }

}
