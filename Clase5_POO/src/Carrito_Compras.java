
public class Carrito_Compras {
	// Atributos
	public int idCarrito_Compras;
	public String fecha_Compras;
	public double Total;
	
	// Metodos Atributos
	
    public int getIdCarrito_Compras() {
		return idCarrito_Compras;
	}



	public void setIdCarrito_Compras(int idCarrito_Compras) {
		this.idCarrito_Compras = idCarrito_Compras;
	}



	public String getFecha_Compras() {
		return fecha_Compras;
	}



	public void setFecha_Compras(String fecha_Compras) {
		this.fecha_Compras = fecha_Compras;
	}



	public double getTotal() {
		return Total;
	}



	public void setTotal(double total) {
		Total = total;
	}

	//Metodos
	
	public double precio(Item_Carrito obj) {
		return this.Total+=obj.Item_total;
	};
}
