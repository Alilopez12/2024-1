package co.edu.uniquindio.poo;
public enum Material {
    
    ARENA(10000),
     GRAMA_SINTETICA(20000), 
     GRAMA_NATURAL(20000), 
     ASFALTO(40000);
    
    private final int precio;

    Material(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
}

