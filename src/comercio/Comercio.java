package comercio;

import java.util.Arrays;

public class Comercio {

    public static void main(String[] args) {
        Ventas[] listaVentas ={new Ventas("1", "rpro1",7), new Ventas("2", "rpro2", 9), new Ventas("3", "rpro3", 4)};
        Producto[] listaProductos ={new Producto("rpro3", "uvas", "rpre1"), new Producto("rpro1", "peras", "rpre3"), new Producto("rpro2", "patatas","rpre2" )};
        Precio[] listaPrecios = {new Precio("rpre2", 2), new Precio("rpre1", 5), new Precio("rpre3", 7)};
        Ticket[] listaTickets = new Ticket[3];
        
        for(int i =0; i<listaTickets.length; i++){
            listaTickets[i] = new Ticket();
        }
        
        Metodos.recorrer(listaVentas, listaProductos, listaPrecios, listaTickets);
        Metodos.nombrePrecio(listaVentas, listaProductos, listaPrecios);
        System.out.println("Numero venta: "+Metodos.numVenta+", Nombre: "+Metodos.nombre+", Precio: "+Metodos.precio);
    
    }
    
}
