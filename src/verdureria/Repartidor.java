package verdureria;

public class Repartidor {
	private String nombre;
	private String rut;
	private int cantidadDelivery;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getCantidadDelivery() {
		return cantidadDelivery;
	}
	public void setCantidadDelivery(int cantidadDelivery) {
		this.cantidadDelivery = cantidadDelivery;
	}
	public Repartidor(String nombre, String rut, int cantidadDelivery) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.cantidadDelivery = cantidadDelivery;
	}
	
	
	

}
