import java.util.ArrayList;

public class Pedido{
    
    private String nombre;
    private double total;
    private boolean listo;
    private ArrayList<Articulo> articulo;

    public Pedido( String nombre){
        this.nombre = nombre;
        this.total = 0.0;
        this.listo = false;
        this.articulo = new ArrayList<Articulo>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getTotal(){
        return this.total;
    }

    public boolean getListo(){
        return this.listo;
    }

    public ArrayList<Articulo> getArticulo(){
        return this.articulo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTotal(double total){
        this.total = total; 
    }

    public void setListo(boolean listo){
        this.listo = listo;
    }

    public void setArticulo(ArrayList<Articulo> articulo ){
        this.articulo = articulo;
    }
    public String toString(){
        return "Elementos del articulo"+ "\n"+
               "Nombre:" + articulo.get(0).getNombre() +"\n"+
               "Precio:"+ articulo.get(0).getPrecio()+"\n";
               
    }
}