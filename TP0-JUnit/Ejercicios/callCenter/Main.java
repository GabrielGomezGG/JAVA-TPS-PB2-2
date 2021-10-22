package callCenter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Callcenter call = new Callcenter("EOA");
		call.setContacto(new Contacto("titi","EAD","1133306569","emal","catan",1233,"mata",Provincias.BUENOS_AIRES));
		if(call.realizarNuevaLlamada()) {
			System.out.println("Se realizo la llamada");
		}else {
			System.out.println("La lista de contactos esta vacia");
		}
		
	}

}
