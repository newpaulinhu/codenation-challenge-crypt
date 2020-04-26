package challenge;

/**
 * Classe para representar um Caractere, contendo 
 * @author Paulo Porto
 *
 */
public class Caractere {

	private static final String alfabeto = "abcdefghijklmnopqrstuvwxyz";

	private char caractere;
	
	public Caractere(char caractere) {
		this.caractere = caractere;
	}

	/**
     * Busca o proximo/anterior caractere de acordo com a quantidades de casa e direção
     * @param c - Caractere
     * @param acao - Ação a ser realizada ( disponivel no enum {@link Acao}})
     * @return
     */
    public char getCaractere(Acao acao) {
    	if(!Character.isLetter(caractere)) {
    		return caractere;
    	}
    	return Acao.AVANCAR_LETRAS == acao? getCaractereAnterior() : getProximoCaractere();
	}
    
    /**
     * busca o caractere anterior Associada a ação {@value challenge.Acao.VOLTAR_LETRAS}}
     * @return Caractere anterior de acordo com 3 casas
     */
    public char getCaractereAnterior() {
    	int charAtual = alfabeto.indexOf(caractere) + 3;
    	return alfabeto.charAt(charAtual > 25 ? 25 - charAtual :  charAtual);
    }
    

    /**
     * busca o proximo caractere - Associada a ação {@value challenge.Acao.VOLTAR_LETRAS}}
     * @return Proximo caractere de acordo com 3 casas
     */
    public char getProximoCaractere() {
    	int charAtual = alfabeto.indexOf(caractere) - 3;
    	return alfabeto.charAt(charAtual < 0 ? charAtual * -1  :  charAtual);
    }
}
