package clases_biblioteca;

public class libro {
	 private String titulo;
	    private String autor;
	    private String genero;
	    private String categoria;
	    private String codigo_libro;
	    private boolean estado;
	    private double precio_renta;
	    
	    public libro(String titulo, String autor, String genero, String codigo_libro, String categoria, boolean estado, double precio_renta) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.genero = genero;
	        this.codigo_libro = codigo_libro;
	        this.categoria = categoria;
	        this.estado = estado;
	        this.precio_renta = precio_renta;

	    }

	    // Getters y setters
	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public String getCodigolibro() {
	        return codigo_libro;
	    }

	    public void setCodigolibro(String codigo_libro) {
	        this.codigo_libro = codigo_libro;
	    }
	    
	    public String getcategoria() {
	        return categoria;
	    }

	    public void setcategoria(String categoria) {
	        this.categoria = categoria;
	    }
	    
	    public boolean getestado() {
	        return estado;
	    }

	    public void setestado(boolean estado) {
	        this.estado = estado;
	    }
	    
	    public double getprecio_renta() {
	        return precio_renta;
	    }

	    public void setprecio_rentao(double precio_renta) {
	        this.precio_renta = precio_renta;
	    }
	    
	    
}

