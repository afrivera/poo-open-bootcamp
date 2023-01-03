package poo.ejercicio1;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        SmartWatch watch = new SmartWatch();

        SmartDevice phone1 = new SmartPhone("blanco", 0.012d, 0.07, 190.0, 5000);
        SmartDevice watch1 = new SmartWatch("Azul", 0.02d, 0.04, 90.0, true);

        // set valores del phone
        phone.setColor("Verde");
        phone.setAncho(0.013);
        phone.setAltura(0.015);
        phone.setPeso(190);
        phone.setCapacidadBateria(4500);

        // set valores del watch
        watch.setColor("Verde");
        watch.setAncho(0.012);
        watch.setAltura(0.07);
        watch.setPeso(80);
        watch.setBrujula(false);


        System.out.println(watch);
        System.out.println(phone);
        System.out.println(watch1);
        System.out.println(phone1);


    }
}
