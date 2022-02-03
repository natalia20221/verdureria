package verdureria;

import java.util.ArrayList;

public class Venta {
	
	private int numVenta;
	private Cliente cliente;
	
	private ArrayList<VentaProducto> productos;

	public int getNumVenta() {
		return numVenta;
	}

	public void setNumVenta(int numVenta) {
		this.numVenta = numVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<VentaProducto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<VentaProducto> productos) {
		this.productos = productos;
	}

	public Venta(int numVenta, Cliente cliente, ArrayList<VentaProducto> productos) {
		super();
		this.numVenta = numVenta;
		this.cliente = cliente;
		this.productos = productos;
	}
	
	

}
