import java.util.Scanner;

public class Menus {

	public int menuDeEspera(Scanner input) {
		int opcaoSelecionada;
		System.out.println("\n================ MENU DE ESPERA ================");
		System.out.println("Estado De Espera...");
		System.out.println("1 - Para Iniciar Sessão");
		System.out.println("2 - Para sair");
		System.out.println("==============================================");
		System.out.print("Digite Uma opcao Valida: ");
		opcaoSelecionada = input.nextInt();
		return (opcaoSelecionada);
	}

	public int menuPrincipal(Scanner input) {
		int opcaoSelecionada;

		System.out.println("\n============ MENU PRINCIPAL ================");
		System.out.println("1 - Abrir Conta");
		System.out.println("2 - Fazer Login");
		System.out.println("3 - Volta Ao Menu De Espera");
		System.out.println("==============================================");
		System.out.print("Digite Uma opcao Valida: ");
		opcaoSelecionada = input.nextInt();
		System.out.println();
		return (opcaoSelecionada);
	}

	public int menuLogin(Scanner input) {
		int opcaoSelecionada;

		System.out.println("\n============ MENU LOGIN ================");
		System.out.println("1 - Saldo Da Conta");
		System.out.println("2 - Saque");
		System.out.println("3 - Deposito");
		System.out.println("4 - Transferencia");
		System.out.println("5 - Extrrato");
		System.out.println("6 - Sair da conta");
		System.out.println("==============================================");
		System.out.print("Digite Uma opcao Valida: ");
		opcaoSelecionada = input.nextInt();
		System.out.println();
		return (opcaoSelecionada);
	}

}
