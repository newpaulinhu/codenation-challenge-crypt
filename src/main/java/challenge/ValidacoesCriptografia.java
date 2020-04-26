package challenge;

public class ValidacoesCriptografia {

	public static void validar(String texto) {
		if(texto == null) {
    		throw new NullPointerException("Texto não pode ser Nulo");
    	}
    	
    	if(texto.trim().equals("") ) {
    		throw new IllegalArgumentException("Texto não pode ser vazio");
    	}
	}
}
