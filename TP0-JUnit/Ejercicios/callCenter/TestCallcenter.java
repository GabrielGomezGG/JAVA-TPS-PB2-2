package callCenter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestCallcenter {

	Callcenter callcenter;
	
	String[] nombres = new String[]{"Matias", "Lorenzo","Jorge","Luis","Fede"};
	String[] apellidos = new String[]{"Lopez","Perez","Diaz","Gomez", "Dominges"};
	String[] numerosCelular = new String[]{"+5412332112", "+5443232311","+5432112332","+5465445665","+5487667867",};
	String[] emails = new String[]{"Matias", "Lorenzo","Jorge","Luis","Fede"};
	String[] direcciones = new String[]{"Matias", "Lorenzo","Jorge","Luis","Fede"};
	Integer[] codigosPostales =  new Integer[]{1234, 9324,7554,5433,1321};
	String[] localidades =  new String[]{"La Matanza", "Quilmes","Capital","3 De Febrero","Monte Negro"};
	Provincias[] provincias =  new Provincias[]{Provincias.BUENOS_AIRES, Provincias.CORDOBA,Provincias.MISICIONES,Provincias.SANTIAGO_DEL_ESTERO, Provincias.CHUBUT};
	
	@Before
	public void before(){
		callcenter = new Callcenter("Oeste Cable Color");
		
		
	}
	@Test
	void testRealizarNuevaLlamada() {
		assertEquals(false, callcenter.realizarNuevaLlamada());
	}

}
