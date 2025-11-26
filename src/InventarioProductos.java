import java.util.ArrayList;

public class InventarioProductos {
    private ArrayList<Producto> productos;
    public InventarioProductos(){
        this.productos= new ArrayList<>();
    }
    private void cargarDatos(){
        productos.add(new Producto(10,"RouterA500","ROUTER",4,60.0f));
        productos.add(new Producto(7,"Switch5p","SWITCH",12,13.0f));
        productos.add(new Producto(3,"Expansor Wifi","EXPANSOR",44,5.0f));
        productos.add(new Producto(15,"RouterPro13","ROUTER",5,42.0f));
        productos.add(new Producto(20,"Expansor usb","EXPANSOR",10,55.0f));

    }
    public boolean agregarProducto(Producto p){
        if()
    }
}
