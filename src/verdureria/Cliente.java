package verdureria;

public class Cliente {
	private String nombre;
	private String rut;
	private String mail;
	private String direccion;
	private String comuna;
	
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public Cliente(String nombre, String rut, String mail, String direccion, String comuna) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.mail = mail;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	
}
