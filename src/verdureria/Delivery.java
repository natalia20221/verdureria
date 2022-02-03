package verdureria;

public class Delivery {
	private Cliente cliente;
	private Repartidor repartidor;
	private Venta venta;
	private int costoTotal;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Repartidor getRepartidor() {
		return repartidor;
	}
	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public int getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(int costoTotal) {
		this.costoTotal = costoTotal;
	}
	public Delivery(Cliente cliente, Repartidor repartidor, Venta venta, int costoTotal) {
		super();
		this.cliente = cliente;
		this.repartidor = repartidor;
		this.venta = venta;
		this.costoTotal = costoTotal;
	}
	
	

}
