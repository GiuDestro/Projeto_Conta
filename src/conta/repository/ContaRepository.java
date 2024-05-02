package conta.repository;

import conta.model.Conta;

public interface ContaRepository {

	// Fazendo o CRUD (Create, Read, Update e Delete) da conta
	
	public void procurarNumero(int numero);
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void deletar(int numero);
	
	// métodos bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
