package poo.ejercicio1;

public class SmartWatch extends SmartDevice{

    private boolean brujula;

    public SmartWatch() {
    }

    public SmartWatch(String color, double altura, double ancho, double peso, boolean brujula) {
        super(color, altura, ancho, peso);
        this.brujula = brujula;
    }

    public boolean isBrujula() {
        return brujula;
    }

    public void setBrujula(boolean brujula) {
        this.brujula = brujula;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brujula=" + brujula +
                '}';
    }
}
