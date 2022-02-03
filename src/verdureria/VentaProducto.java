package verdureria;

public class VentaProducto {
	private Producto producto;
	private int cantidad;
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public VentaProducto(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		
	}
	
	public int getTotal() {
		return this.producto.getPrecioVentaUnitario() * this.cantidad;
		
	}
	

}
