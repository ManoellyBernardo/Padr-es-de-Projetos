package subSistema2.Cep;

public class CepAPI {
	
	private static CepAPI instancia = new CepAPI();
	
	private  CepAPI (){
		super();
	}
	
	public static CepAPI getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade (String cep) {
		return "Recife";
	}
	
	public String recuperarEstado (String cep) {
		return "Pernambuco";
	}
}
