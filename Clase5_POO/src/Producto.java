
public class Producto {
	// Atributos
	public int idProducto;
	public String Descripcion;
	public double PrecioUnitario;
	
	// Metodos Atributos
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		PrecioUnitario = precioUnitario;
	};
	// Metodos 
	public void Leer_Cargar(int idProd, String desc, double PU) {
		this.idProducto= idProd;
		this.Descripcion=desc;
		this.PrecioUnitario=PU;
		}
}
