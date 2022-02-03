package verdureria;

public class Provedor {
	private String nombre;
	private String tipoProducto;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Provedor(String nombre, String tipoProducto) {
		super();
		this.nombre = nombre;
		this.tipoProducto = tipoProducto;
	}
	

}

