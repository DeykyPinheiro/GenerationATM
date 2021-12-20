import java.util.ArrayList;
import java.util.Scanner;

public class Servico {

	public static final int USUARIOS_PREVIAMENTE_CADASTRADOS = 1;
//		TODO adicionar funcao para remover conta
//		TODO funcao para exibir lista de contas cadastradas
//		TODO escreve um menu para selecao de tipo de conta	
//		TODO falta selecao do tipo de conta
//		TODO realizar verificacaoes
//		TODO TRAZER O LOGIN PARA ESSE ARQUIVO

	public void abrirConta(Scanner input, ArrayList<Conta> listaDeContas) {
		Conta conta = new Conta();

		System.out.println("=========== Abertura de conta ==============");
		conta.setIdConta(listaDeContas.size());
		System.out.print("Digite Seu Primeiro Nome: ");
		conta.setPrimeiroNome(input.next());
		System.out.print("Digite Seu Ultimo Nome: ");
		conta.setUltimoNome(input.next());
		System.out.println("Cria Uma Senha Com 4 Digitos: ");
		conta.setSenha(input.next());
		System.out.println("Digite Dia De Nascimento: ");
		conta.setDiaDeNascimento(input.nextInt());
		System.out.println("Digite O Mes Do Nascimento: ");
		conta.setMesDeNascimento(input.nextInt());
		System.out.println("Digite O Ano De Nascimento: ");
		conta.setAnoDeNascimento(input.nextInt());
		System.out.println("Digite O Telefone: ");
		conta.setTelefone(input.next());
		System.out.println("Valor Do Deposito Inicial: ");
		conta.setSaldoDaConta(input.nextDouble());
		conta.setContaEstaAtiva(true);
		listaDeContas.add(conta);
	}

	public void mostrarListaDeContas(ArrayList<Conta> listaDeContas) {
		System.out.println("\nlista de contas");
		for (int i = 0; i < listaDeContas.size(); i++) {
			System.out.println(i + " - " + listaDeContas.get(i).getPrimeiroNome());
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

	public void transferencia(Scanner input, Conta origen, double valorTranferido, ArrayList<Conta> listaDeContas) {

		int id;
		Conta destino = new Conta();
		mostrarListaDeContas(listaDeContas);
		System.out.println("Digite o id da Conta de Destino");
		id = input.nextInt();
		destino = listaDeContas.get(id);
//		TODO verificacoes
		System.out.println("tranferencia relizada");
		origen.setSaldoDaConta(origen.getSaldoDaConta() - valorTranferido);
		origen.setExtrato(valorTranferido * -1);
		destino.setSaldoDaConta(destino.getSaldoDaConta() + valorTranferido);
		destino.setExtrato(valorTranferido);
	}

	public void mostraExtrato(Conta conta) {
		for (int i = 0; i < conta.getExtrato().size(); i++) {
			System.out.println(i + " - " + conta.getExtrato().get(i));
		}

	}

}
