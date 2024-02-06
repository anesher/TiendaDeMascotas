public class Main {
    public static void main(String[] args) {
        TiendaMascotas tienda= new TiendaMascotas();

        tienda.agregarMascota("miguel", 5, "periquito");
        tienda.agregarMascota("antonio", 5, "cerdo");
        tienda.agregarMascota("paula", 5, "gato");
        tienda.agregarMascota("lot", 5, "perro");

        tienda.venderMascota("miguel");

        tienda.mostrarInventario();
    }
}
