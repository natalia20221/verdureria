package verdureria;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Provedor provedor1 = new Provedor("la vega","frutas");
		System.out.println("nombre del provedor: "+provedor1.getNombre());
		System.out.println("tipo producto: "+provedor1.getTipoProducto());
		
		Producto frutilla = new Producto("frutillas",2000000, provedor1, 50);
		System.out.println("nombre producto: "+frutilla.getNombre());
		System.out.println("stock disponible: "+frutilla.getstock());
		System.out.println("nombre provedor: "+frutilla.getProvedor().getNombre());
		System.out.println("precio unitario: "+frutilla.getPrecioVentaUnitario());
		
		Producto durazno = new Producto("durazno",2000000, provedor1, 50);
		System.out.println("nombre producto: "+durazno.getNombre());
		System.out.println("stock disponible: "+durazno.getstock());
		System.out.println("nombre provedor: "+durazno.getProvedor().getNombre());
		System.out.println("precio unitario: "+durazno.getPrecioVentaUnitario());
		
		Producto lechuga = new Producto("lechuga",2000000, provedor1, 50);
		System.out.println("nombre producto: "+lechuga.getNombre());
		System.out.println("stock disponible: "+lechuga.getstock());
		System.out.println("nombre provedor: "+lechuga.getProvedor().getNombre());
		System.out.println("precio unitario: "+lechuga.getPrecioVentaUnitario());
		
		Cliente cliente1 = new Cliente("marcelo vegas","16299002-2", "marcelovega@gmail.com","av parque 886","estacion central");
		System.out.println("nombre del cliente: "+cliente1.getNombre());
		System.out.println("rut del cliente: "+cliente1.getRut());
		System.out.println("correo cliente: "+cliente1.getMail());
		System.out.println("direccion cliente: "+cliente1.getDireccion());
		System.out.println("comuna ciente: "+cliente1.getComuna());
		
		Repartidor repartidor1 = new Repartidor("juan gonzalez","17334002-3",10);
		System.out.println("nombre del repartidor: "+repartidor1.getNombre());
		System.out.println("rut del repartidor: "+repartidor1.getRut());
		System.out.println("cantidad de delivery: "+repartidor1.getCantidadDelivery());
		
		ArrayList<VentaProducto> productos = new ArrayList <VentaProducto>();
		productos.add(new VentaProducto(frutilla, 5));
		productos.add(new VentaProducto(lechuga, 2));
		productos.add(new VentaProducto(durazno, 10));
		
		Venta venta1 = new Venta(4,cliente1, productos);
		
		 System.out.println("numero de venta: "+venta1.getNumVenta());
		 for(int i = 0; i<venta1.getProductos().size(); i++) {
			 System.out.println("item producto: "+venta1.getProductos().get(i).getProducto().getNombre()); 
		 }
			
	}

}
