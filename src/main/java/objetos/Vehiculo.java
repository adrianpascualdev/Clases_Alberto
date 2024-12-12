package objetos;

public class Vehiculo {

    // ruedas y matricula

    private String matricula;

    private int ruedas;

    public Vehiculo(String matricula, int ruedas) {
        this.matricula = matricula;
        this.ruedas = ruedas;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Vehiculo) {
            Vehiculo vehiculo = (Vehiculo) object;
            return this.matricula.equals(vehiculo.getMatricula());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tiene " + ruedas + " ruedas y la matricula es " + matricula;
    }

}
