package poo.ejercicio1;

public abstract class SmartDevice {
    private String color;
    private double altura;
    private double ancho;
    private double peso;

    public SmartDevice() {
    }

    public SmartDevice(String color, double altura, double ancho, double peso) {
        this.color = color;
        this.altura = altura;
        this.ancho = ancho;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", altura=" + altura +
                ", ancho=" + ancho +
                ", peso=" + peso +
                '}';
    }
}
