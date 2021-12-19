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
//	refatorar o codigo

	public void abrirConta(Scanner input, ArrayList<Conta> listaDeContas) {
		Conta conta = new Conta();
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
		int opcao = -1;

		System.out.println("Digite o Id Da Conta: ");
		id = input.nextInt();
		System.out.println("digite sua senha: ");
		senha = input.next().toString();

		test = listaDeContas.get(id).getSenha();
		if (senha.equals(test)) {
			System.out.println("senha igual, menu autenticado");
			System.out.println("\n============ MENU LOGIN ================");
			System.out.println("1 - Saldo Da Conta");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Transferencia");
			System.out.println("5 - Extrrato");
			System.out.println("6 - Sair da conta");
			System.out.println("==============================================");
			System.out.print("Digite Uma opcao Valida: ");
			System.out.println();

			while (opcao != 6) {
				opcao = input.nextInt();
				if (opcao == 1) {
					System.out.println("saldo da conta: " + listaDeContas.get(id).getSaldoDaConta());
				} else if (opcao == 2) {
					System.out.println("sacar dinheiro ");
					saque(listaDeContas.get(id), 2);
				} else if (opcao == 3) {
					System.out.println("depositar aquela graninha: ");
					deposito(listaDeContas.get(id), 100);
				} else if (opcao == 4) {
					System.out.println("tranferencia");
					int idDestino;

					System.out.println("Lista de contas");
					for (int i = 0; i < listaDeContas.size(); i++) {
						System.out.println(i + " - " + listaDeContas.get(i).getNome());
					}
					System.out.println("Digite o Id Correspondente: ");
					idDestino = input.nextInt();
					transferencia(listaDeContas.get(id), listaDeContas.get(idDestino), 2);
				} else if (opcao == 5) {
					System.out.println("Extrato");
					for(int i = 0; i < listaDeContas.get(id).getExtrato().size(); i++) {
						System.out.println(i + " " + listaDeContas.get(id).getExtrato().get(i));
					}
				} else {
					System.out.println("opcao invalida");
				}

			}

		} else {
//			TODO menu para voltar 
			System.out.println("erro tente novamente");
		}

	}

	public void saldoDaConta(Conta conta) {
		System.out.println("saldo: " + conta.getSaldoDaConta());
	}

	public void saque(Conta conta, double valorSaque) {
//		TODO fazer as vericacoes para saque
		System.out.println("valor sacado");
		conta.setExtrato((valorSaque * -1));
		conta.setSaldoDaConta(conta.getSaldoDaConta() - valorSaque);
	}

	public void deposito(Conta conta, double valorDeposito) {
//		TODO verificacoes se posso deposito
		System.out.println("valor depoistado");
		conta.setExtrato(valorDeposito);
		conta.setSaldoDaConta(conta.getSaldoDaConta() + valorDeposito);
	}

	public void transferencia(Conta origen, Conta destino, double valorTranferido) {
//		TODO verificacoes
		System.out.println("tranferencia relizada");
		origen.setSaldoDaConta(origen.getSaldoDaConta() - valorTranferido);
		origen.setExtrato(valorTranferido * -1);
		destino.setSaldoDaConta(destino.getSaldoDaConta() + valorTranferido);
		destino.setExtrato(valorTranferido);
	}

}
