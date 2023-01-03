package poo.ejercicio2;

public class MainInterface {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {

        cocheCRUD.findAll();
        cocheCRUD.save();
        cocheCRUD.delete();
    }
}
