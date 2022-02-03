package verdureria;

public class Producto {
	private String nombre;
	private int stock;
	private Provedor provedor;
	private int precioVentaUnitario;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getstock() {
		return stock;
	}
	public void setstock(int stock) {
		this.stock = stock;
	}
	public Provedor getProvedor() {
		return provedor;
	}
	public void setProvedor(Provedor provedor) {
		this.provedor = provedor;
	}
	public int getPrecioVentaUnitario() {
		return precioVentaUnitario;
	}
	public void setPrecioVentaUnitario(int precioVentaUnitario) {
		this.precioVentaUnitario = precioVentaUnitario;
	}
	public Producto(String nombre, int stock,Provedor provedor, int precioVentaUnitario) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.provedor = provedor;
		this.precioVentaUnitario = precioVentaUnitario;
	}
	
	

}
