package poo.ejercicio1;

public class SmartPhone extends SmartDevice{

    private double capacidadBateria;

    public SmartPhone() {
    }

    public SmartPhone(String color, double altura, double ancho, double peso, double capacidadBateria) {
        super(color, altura, ancho, peso);
        this.capacidadBateria = capacidadBateria;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "capacidadBateria=" + capacidadBateria +
                '}';
    }
}
