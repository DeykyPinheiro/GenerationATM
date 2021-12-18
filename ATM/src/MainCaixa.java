import java.util.ArrayList;
import java.util.Scanner;


public class MainCaixa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();

		int opcaoInicial = -1;
		int selecionarOpcao = 0;
		Caixa caixa = new Caixa();

		while (opcaoInicial != 2) {
			System.out.println("\n================ MENU DE ESPERA ================");
			System.out.println("Estado De Espera...");
			System.out.println("1 - Para Iniciar Sess�o");
			System.out.println("2 - Para sair");
			System.out.println("==============================================");
			System.out.print("Digite Uma opcao Valida: ");
			opcaoInicial = input.nextInt();
			System.out.println();

			if (opcaoInicial == 1) {
				Conta conta = new Conta();
				conta.setNome("Deyky");
				conta.setSenha("1234");
				listaDeContas.add(conta);

				System.out.println("Sessao Iniciada\n");
				while (selecionarOpcao != 3) {
					System.out.println("\n============ MENU PRINCIPAL ================");
					System.out.println("1 - Abrir Conta");
					System.out.println("2 - Fazer Login");
					System.out.println("3 - Volta Ao Menu De Espera");
					System.out.println("==============================================");
					System.out.print("Digite Uma opcao Valida: ");
					selecionarOpcao = input.nextInt();
					System.out.println();

					if (selecionarOpcao == 1) {
						System.out.println("Abertura de conta");
						caixa.abrirConta(input, conta, listaDeContas);
					} else if (selecionarOpcao == 2) {
						caixa.login(input, listaDeContas);
//						System.out.println("Digite Seu Login(Id Conta)");
						
						
					}
					
					
					System.out.println("\nlista de contas");
					for (int i = 0; i < listaDeContas.size(); i++) {
						System.out.println(i + " - " + listaDeContas.get(i).getNome());
					}

				}

			} else if (opcaoInicial == 2) {
				System.out.println("Desligando Maquina...");
			} else {
				System.out.println("Opcao Invalida Tente Novamente!\n");
			}

		}

		System.out.println("Fim Da Sess�o..");

		input.close();
	}
}