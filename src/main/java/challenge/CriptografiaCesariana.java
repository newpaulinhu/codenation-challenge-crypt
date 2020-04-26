package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
    	return decifrar(texto, Acao.AVANCAR_LETRAS);
    }

    @Override
    public String descriptografar(String texto) {
    	return decifrar(texto, Acao.VOLTAR_LETRAS);
    }
    
    private String decifrar(String texto, Acao acao) {
    	
    	ValidacoesCriptografia.validar(texto);
    	
    	StringBuffer decifrado = new StringBuffer();
		
    	texto.toLowerCase().chars().mapToObj(i -> (char)i).forEach(c -> { 
			decifrado.append(new Caractere(c).getCaractere(acao));
		});
    	
		return decifrado.toString();
    }
    
    
}
