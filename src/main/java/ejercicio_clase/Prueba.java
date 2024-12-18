package ejercicio_clase;

public class Prueba {

    public static void main(String[] args) {
        //arrayEnteros();
        String nombres[] = new String[4];
        nombres[0] = "Pedro";
        nombres[1] = "Juan";
        nombres[2] = "Pepe";
        nombres[3] = "Luis";
        String nombres2[] = new String[]{"Marcos","Adrian","Alberto"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

    public static void arrayEnteros() {
        int numeros[] = new int[5]; // numeros -> 0,1,2,3,4

        //int numeros[] = new int[]{1,3,4,5,6,7,8,20,12,3,5,4,2,123,1212};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i*5;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
