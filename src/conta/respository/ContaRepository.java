package conta.respository;

import conta.model.Conta;

public interface ContaRepository {

	/*Criando o CRUD é o acrônimo para Create (criar), 
	 * Read (ler), Update (atualizar) e Delete (apagar) da Conta
	 */
	
	public void procurarPorNumero (int numero);
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar (Conta conta);
	public void deletar (int numero);
	
	// metodos bancarios
	public void sacar (int numero, float valor);
	public void depositar (int numero, float valor);
	public void transferir (int numeroOrigem, int numeroDestino, float valor);
	
}
