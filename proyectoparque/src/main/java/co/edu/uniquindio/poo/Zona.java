package co.edu.uniquindio.poo;

public class Zona {
    
        private final String nombre;
        private final Material material;
        private final FiguraGeometrica figuraGeometrica;

        public String getNombre() {
            return nombre;
        }
    
        public Material getMaterial() {
            return material;
        }
    
        public FiguraGeometrica getFiguraGeometrica() {
            return figuraGeometrica;
        }

        public Zona(String nombre, Material material, FiguraGeometrica figuraGeometrica) {
            this.nombre = nombre;
            this.material = material;
            this.figuraGeometrica = figuraGeometrica;
        }
}