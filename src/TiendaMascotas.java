import java.util.Arrays;

public class TiendaMascotas {

    Mascota [] inventario;
    int cantidadMascotas;

    // inicializamos el constructor
    public TiendaMascotas() {
        this.inventario=new Mascota[100];
        this.cantidadMascotas=0;
    }
    // utilizamos un metodo para agregarMascota
     public void agregarMascota(String nombre, int edad ,String tipoAnimal){
         Mascota mascota=new Mascota( nombre, edad, tipoAnimal);
         //para añadir al array
         inventario[cantidadMascotas]=mascota;
         cantidadMascotas++;
         System.out.println("la mascota " +nombre+ " se ha añadido correctamente");
     }

    public void venderMascota(String nombre){
        //se recorre todo el array para poder ver cual se ha vendido
       for (int i = 0; i < cantidadMascotas ; i++) {
           // se busca el nombre para ver si se ha vendido y asi quitarlo del array .equals(tipoVariable) es como == para la condicion
           if (inventario[i].getNombre().equals(nombre)){
                System.out.println("la mascota tal " +inventario[i].getNombre() + "se ha vendido");
                // se vacia la posicion de donde lo han encontrado
                inventario[i]=null;
                    for (int j = i; j <cantidadMascotas ; j++) {
                        // se recompone los arrays bien despues de haber borrado la mascota
                        inventario[j]=inventario[j+1];
                    }
                cantidadMascotas --;
                return;
           }
           System.out.println("la mascota con nombre " +nombre+ " no se encuentra");
       }
    }

    public void mostrarInventario() {
        System.out.println("EL inventario de la tienda : ");
        for (int i = 0; i < cantidadMascotas; i++) {
            System.out.println(" nombre : " +inventario[i].getNombre());
            System.out.println(" edad : " +inventario[i].getEdad());
            System.out.println(" edad : " +inventario[i].getTipoAnimal());
        }
    }
}
