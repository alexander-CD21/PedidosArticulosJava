import java.util.ArrayList;

public class TestOrders {
    
    public static void main(String args[]){
    
    // items del menu 
    Articulo articulo1 = new Articulo("moka",3.5);
    Articulo articulo2 = new Articulo("latte",4.0);
    Articulo articulo3 = new Articulo("cafe de goteo",10.0);
    Articulo articulo4 = new Articulo("capuchino",10.0);
 
    // lista de pedidos
    Pedido pedido1 = new Pedido("Cinduri");
    Pedido pedido2 = new Pedido("Jimmy");    
    Pedido pedido3 = new Pedido("Noah");
    Pedido pedido4 = new Pedido("Sam");
    

    //simulacion de aplicaciones 
    //agregamos el articulo3 a pedido1
    pedido1.getArticulo().add(articulo3);
    //modificamos total a pedido1
    pedido1.setTotal( pedido1.getTotal() + articulo3.getPrecio() );
    //agregamos el articulo1 a pedidos 2  
    pedido2.getArticulo().add( articulo1);
    //modificamos el total de pedido2 
    pedido2.setTotal(pedido2.getTotal() + articulo1.getPrecio());
    //modificamos el estado de listo para pedido2
    pedido2.setListo(true);
    //agregando articulo4 a pedido3
    pedido3.getArticulo().add(articulo4);
    //agregando cuenta a 
    pedido3.setTotal(pedido3.getTotal()+ articulo4.getPrecio());
    //agregando articulo2 a pedido 4
    pedido4.getArticulo().add(articulo2);
    //agregando su cuenta de pedido4 
    pedido4.setTotal(pedido4.getTotal()+articulo2.getPrecio()*2);
    //pedido de cinduri esta listo 
    pedido1.setListo(true);
    //visualizacion de los pedidos 
    //mostrar pedido1 
    System.out.println("nombre: " + pedido1.getNombre());
    System.out.println("Total: " + pedido1.getTotal());
    System.out.println("Listo: " + pedido1.getListo());
    System.out.println("-------------------------------");
    //mostrar pedido 2
    System.out.println("nombre: " + pedido2.getNombre());
    System.out.println("Total: " + pedido2.getTotal());
    System.out.println("Listo: " + pedido2.getListo());
    System.out.println("-----------------------------------");
    //mostrar pedido3
    System.out.println("nombre: " + pedido3.getNombre());
    System.out.println("Total: " + pedido3.getTotal());
    System.out.println("-----------------------------------");
    //Mostrar pedido4 
    System.out.println("nombre: " + pedido4.getNombre());
    System.out.println("Total: " + pedido4.getTotal());
    System.out.println("-----------------------------------");
    //mostrar el arreglo 
    System.out.println(pedido2.toString());
    }
}