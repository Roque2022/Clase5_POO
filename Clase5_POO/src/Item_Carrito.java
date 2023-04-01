
public class Item_Carrito {
	// Atributos
		public int idItem_Carrito;
		public double Item_total;
		public double Cantidad;
		
		// Metodos Atributos
		public int getIdItem_Carrito() {
			return idItem_Carrito;
		}
		public void setIdItem_Carrito(int idItem_Carrito) {
			this.idItem_Carrito = idItem_Carrito;
		}
		public double getItem_total() {
			return Item_total;
		}
		public void setItem_total(double item_total) {
			Item_total = item_total;
		}
		public double getCantidad() {
			
			return Cantidad;
		}
		public void setCantidad(double cantidad) {
			Cantidad = cantidad;
		}
		
		
		// Metodos
		
		public void Leer_Mostrar() {};
		public void Leer_Cargar(Producto obj, double cant) {
			this.idItem_Carrito= obj.idProducto;
			this.Cantidad=cant;
			this.Item_total=obj.PrecioUnitario * cant;
			}
}
