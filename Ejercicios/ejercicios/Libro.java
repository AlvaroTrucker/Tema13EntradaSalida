package ejercicios;

import java.io.Serializable;

public class Libro implements Serializable{
	//atributos
	private String isbn;
	private String codigo;
	private String titulo;
	private String grado;
	private String coleccion;
	private String fechaLanzamiento;
	private String paginas;
	private String interior;
	private String peso;
	private String tamano;
	private String precio;
	private String codigoBarras;
	private String imagen;
	
	/**
	 * @param isbn
	 * @param codigo
	 * @param titulo
	 * @param grado
	 * @param coleccion
	 * @param fechaLanzamiento
	 * @param paginas
	 * @param interior
	 * @param peso
	 * @param precio
	 * @param codigoBarras
	 * @param imagen
	 */
	public Libro(String isbn, String codigo, String titulo, String grado, String coleccion, String fechaLanzamiento,
			String paginas, String interior, String peso, String tamano, String precio, String codigoBarras, String imagen) {
		this.isbn = isbn;
		this.codigo = codigo;
		this.titulo = titulo;
		this.grado = grado;
		this.coleccion = coleccion;
		this.fechaLanzamiento = fechaLanzamiento;
		this.paginas = paginas;
		this.interior = interior;
		this.peso = peso;
		this.precio = precio;
		this.codigoBarras = codigoBarras;
		this.imagen = imagen;
		this.tamano = tamano;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getColeccion() {
		return coleccion;
	}

	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", codigo=" + codigo + ", titulo=" + titulo + ", grado=" + grado + ", coleccion="
				+ coleccion + ", fechaLanzamiento=" + fechaLanzamiento + ", paginas=" + paginas + ", interior="
				+ interior + ", peso=" + peso + ", tamano=" + tamano + ", precio=" + precio + ", codigoBarras="
				+ codigoBarras + ", imagen=" + imagen + "]";
	}

	
}
