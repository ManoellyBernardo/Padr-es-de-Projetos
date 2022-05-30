package facade;

import subSistema1.Crm.CrmService;
import subSistema2.Cep.CepAPI;

public class Facade {
	
public void migrarCliente (String nome, String Cep) {
	String cidade = CepAPI.getInstancia().recuperarCidade(Cep);
	String estado = CepAPI.getInstancia().recuperarEstado(Cep);
	
	CrmService.gravarCliente(nome, Cep, cidade, estado);
}

}
