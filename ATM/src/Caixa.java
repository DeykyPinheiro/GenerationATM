import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {

//	TODO
//	private Conta conta;
//	private Conta origen;
//	private Conta destino;
//	addiconal classe operacoes, e colocar todas operacoes dentro dela
//	classe de menus
//	adicionar uma classe de verificacoes
//	classe com avisos
	
	public void abrirConta(Scanner input, Conta conta, ArrayList<Conta> listaDeContas) {
		System.out.print("Digite seu nome: ");
		conta.setNome(input.next());
		System.out.println("Cria um senha: ");
		conta.setSenha(input.next());
//		System.out.println("nome digitado ==> " + conta.getNome());
//		System.out.println("Digite Dia De Nascimento: ");
//		conta.setDiaDeNascimento(input.nextInt());
//		System.out.println("Digite O Mes Do Nascimento: ");
//		conta.setMesDeNascimento(input.nextInt());
//		System.out.println("Digite O Ano De Nascimento: ");
//		conta.setAnoDeNascimento(input.nextInt());
//		TODO realizar verificacaoes
		listaDeContas.add(conta);
	}
	
	public void login(Scanner input, ArrayList<Conta> listaDeContas) {
		int id;
		String senha = new String();
		String test = new String();
		
		System.out.println("Digite o Id Da Conta: ");
		id = input.nextInt();
		System.out.println("digite sua senha: ");
		senha = input.next().toString();
		
		test = listaDeContas.get(id).getSenha();
		if (senha.equals(test)) {
			System.out.println("senha igual, menu autenticado");
		}
		
		
		
	}
	
	public void saldoDaConta(Conta conta) {
		System.out.println("saldo: " + conta.getSaldoDaConta());
	}

	public void saque(Conta conta, double valorSaque) {
//		TODO fazer as vericacoes para saque
		System.out.println("valor sacado");
		conta.setSaldoDaConta(conta.getSaldoDaConta() - valorSaque);

	}

	public void deposito(Conta conta, double valorDeposito) {
//		TODO verificacoes se posso deposito
		System.out.println("valor depoistado");
		conta.setSaldoDaConta(conta.getSaldoDaConta() + valorDeposito);
	}

	public void transferencia(Conta origen, Conta destino, double valorTranferido) {
//		TODO verificacoes
		System.out.println("tranferencia relizada");
		origen.setSaldoDaConta(origen.getSaldoDaConta() - valorTranferido);
		destino.setSaldoDaConta(destino.getSaldoDaConta() + valorTranferido);
	}

}
