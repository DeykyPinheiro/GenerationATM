import java.util.ArrayList;

import java.util.Scanner;

public class Caixa {

//	TODO
//	addiconal classe Servicos, e colocar todas operacoes dentro dela
//	classe de menus
//	adicionar uma classe de verificacoes
//	classe com avisos
//	refatorar o codigo

//	public void abrirConta(Scanner input, ArrayList<Conta> listaDeContas) {
//		Conta conta = new Conta();
//		System.out.print("Digite seu nome: ");
//		conta.setNome(input.next());
//		System.out.println("Cria um senha: ");
//		conta.setSenha(input.next());
////		System.out.println("nome digitado ==> " + conta.getNome());
////		System.out.println("Digite Dia De Nascimento: ");
////		conta.setDiaDeNascimento(input.nextInt());
////		System.out.println("Digite O Mes Do Nascimento: ");
////		conta.setMesDeNascimento(input.nextInt());
////		System.out.println("Digite O Ano De Nascimento: ");
////		conta.setAnoDeNascimento(input.nextInt());
////		TODO realizar verificacaoes
//		listaDeContas.add(conta);
//	}

	public void RealizarOperacao(Scanner input, ArrayList<Conta> listaDeContas, Menus menu, Verificacoes verificar,
			Servico servico) {
		
		int id;
		String senha = new String();
		Conta conta = new Conta();
		int opcao = -1;

		System.out.println("Digite o Id Da Conta: ");
		id = input.nextInt();
		System.out.println("digite sua senha: ");
		senha = input.next().toString();
		conta = listaDeContas.get(id);

		if (verificar.login(input, listaDeContas, menu, id, senha)) {
			while(opcao != 6) {
				opcao = menu.menuLogin(input);
				operacoes(input, opcao, servico, conta, listaDeContas);
			}
		} else {
			
			System.out.println("Login Incoreto");
		}

	}

	public void operacoes(Scanner input, int opcao, Servico servico, Conta conta, ArrayList<Conta> listaDeContas) {
		

		switch (opcao) {
		case 1:
			servico.saldoDaConta(conta);
			break;
		case 2:
//			TODO valor hard 2, mudar depois
			servico.saque(conta, 2);
			break;
		case 3:
//			TODO valor hard 2, mudar depois
			servico.deposito(conta, 10);
			break;
		case 4:
//			TODO valor hard 100, mudar depois
			servico.transferencia(input, conta, 100, listaDeContas);
			break;
		case 5:
			System.out.println("Extrato");
			servico.mostraExtrato(conta);
			break;
		case 6:
//			sair das opcoes
			System.out.println("Retornando ao menu");
			break;
		default:
			System.out.println("Erro!\nDigite Uma Opcao Valida");

		}

	}

}
