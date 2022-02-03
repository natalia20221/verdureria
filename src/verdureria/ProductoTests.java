package verdureria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.Assert;

class ProductoTests {
	

	@Test
	void test1() {
		Provedor provedor1 = new Provedor("la vega","frutas");
		
		Producto frutilla = new Producto("frutillas",2000000, provedor1, 50);
		
		assertEquals("frutillas", frutilla.getNombre());
	}
	
	@Test
	void test2() {
		Provedor provedor1 = new Provedor("la vega","frutas");
		
		Producto frutilla = new Producto("frutillas",2000000, provedor1, 50);
		
		assertEquals(50, frutilla.getPrecioVentaUnitario());
	}

}
