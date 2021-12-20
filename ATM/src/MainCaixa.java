import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

public class MainCaixa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
		int opcaoInicial = -1;
		int selecionarOpcao = -1;
		Caixa caixa = new Caixa();
		Menus menu = new Menus();
		Verificacoes verificar = new Verificacoes();
		Servico servico = new Servico();

//		dados do primeiro cadastro
		Conta conta = new Conta();
		conta.setPrimeiroNome("Deyky");
		conta.setSenha("1234");
		conta.setSaldoDaConta(15000);
		listaDeContas.add(conta);

		Conta conta2 = new Conta();
		conta2.setPrimeiroNome("Mikael");
		conta2.setSenha("1234");
		conta2.setSaldoDaConta(2);
		listaDeContas.add(conta2);
		System.out.println(listaDeContas.get(0).getPrimeiroNome());
		System.out.println(listaDeContas.get(1).getPrimeiroNome());

		while (opcaoInicial != 2) {
			opcaoInicial = menu.menuDeEspera(input);
			if (opcaoInicial == 1) {
				while (selecionarOpcao != 3) {
					selecionarOpcao = menu.menuPrincipal(input);
					if (selecionarOpcao == 1) {
						servico.abrirConta(input, listaDeContas);
					} else if (selecionarOpcao == 2) {
						caixa.RealizarOperacao(input, listaDeContas, menu, verificar, servico);
					}
					servico.mostrarListaDeContas(listaDeContas);
				}

			} else if (opcaoInicial == 2) {
				System.out.println("Desligando Maquina...");
			} else {
				System.out.println("Opcao Invalida Tente Novamente!\n");
			}

		}

		System.out.println("Fim Da Sessão..");
		input.close();
	}
}
