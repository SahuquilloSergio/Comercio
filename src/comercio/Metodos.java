package comercio;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Metodos {
 
    static String numVenta, refProducto, refPrecio, nombre;
    static float precio, cantidad;
     
       public static void recorrer(Ventas listaVentas[], Producto listaProductos[], Precio listaPrecios[], Ticket listaTickets[]){
           String numeroVenta, referenciaProducto, referenciaPrecio, nombre;
           float precio, cantidad;
           for(int i=0; i<listaVentas.length; i++){
               numeroVenta=listaVentas[i].getNumVent();
               listaTickets[i].setNumVenta(numeroVenta);
               referenciaProducto=listaVentas[i].getRefPro();
               cantidad=listaVentas[i].getCant();
               for(int j=0; j<listaProductos.length; j++){
                   if(referenciaProducto.equals(listaProductos[j].getRefPro())){
                       nombre=listaProductos[j].getNomPro();
                       referenciaPrecio=listaProductos[j].getRefPre();
                       listaTickets[i].setNombre(nombre);
                       for(int k=0; k<listaPrecios.length; k++){
                           if(referenciaPrecio.equals(listaPrecios[k].getRefPre())){
                               precio = listaPrecios[k].getPrecio();
                               listaTickets[i].setPrecioTotal(precio*cantidad);
                           }
                       }
                   }
               }
           }
       }
              
              public static void nombrePrecio(Ventas array_ventas[], Producto array_productos[], Precio array_precios[]){
        
        numVenta=JOptionPane.showInputDialog("inserte número venta:");
        
        for(int i=0;i<array_ventas.length;i++){
            if(numVenta.equals(array_ventas[i].getNumVent())){
                refProducto=array_ventas[i].getRefPro();
                for(int u=0;u<array_productos.length;u++){
                     if(refProducto.equals(array_productos[u].getRefPro())){
                        nombre=array_productos[u].getNomPro();
                        refPrecio=array_productos[u].getRefPre();
                        for(int x=0;x<array_precios.length;x++){
                            if(refPrecio.equals(array_precios[x].getRefPre())){
                                precio=array_precios[x].getPrecio();
                            }
                        }
                    }
                }
            }
        }
               
           }
       }





   


            

    
    

