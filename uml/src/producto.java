public class producto {
    public class Producto {
        private int idProducto;
        private String nombreProducto;
        private String descripcion;
        private float precio;
        private int stock;
        private String categoria;
    
        // Constructor
        public Producto(int idProducto, String nombreProducto, String descripcion, float precio, int stock, String categoria) {
            this.idProducto = idProducto;
            this.nombreProducto = nombreProducto;
            this.descripcion = descripcion;
            this.precio = precio;
            this.stock = stock;
            this.categoria = categoria;
        }
    
        // Getters y Setters
        public int getIdProducto() {
            return idProducto;
        }
    
        public void setIdProducto(int idProducto) {
            this.idProducto = idProducto;
        }
    
        public String getNombreProducto() {
            return nombreProducto;
        }
    
        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public float getPrecio() {
            return precio;
        }
    
        public void setPrecio(float precio) {
            this.precio = precio;
        }
    
        public int getStock() {
            return stock;
        }
    
        public void setStock(int stock) {
            this.stock = stock;
        }
    
        public String getCategoria() {
            return categoria;
        }
    
        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
    
        // Métodos adicionales
        public void actualizarStock(int cantidad) {
            this.stock += cantidad;
        }
    
        public String obtenerDetalles() {
            return "Producto: " + this.nombreProducto + ", Precio: $" + this.precio;
        }
    }
    

    
}
