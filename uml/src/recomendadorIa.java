import java.util.List;

public class recomendadorIa {
    private int idRecomendador;
    private usuario usuario;
    private List<Producto> productosRecomendados;

    // Constructor
    public recomendadorIa(int idRecomendador, usuario usuario, List<Producto> productosRecomendados) {
        this.idRecomendador = idRecomendador;
        this.usuario = usuario;
        this.productosRecomendados = productosRecomendados;
    }

    // Métodos adicionales
    public List<producto> generarRecomendaciones(usuario usuario) {
        // Implementación de IA para generar recomendaciones (simplificada)
        return productosRecomendados;
    }

    public void mostrarRecomendaciones() {
        for (producto producto : productosRecomendados) {
            System.out.println(producto.obtenerDetalles());
        }
    }
}
