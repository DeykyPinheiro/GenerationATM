import java.util.ArrayList;
import java.util.Scanner;

public class Verificacoes {

	public boolean login(Scanner input, ArrayList<Conta> listaDeContas, Menus menu, int id, String senha) {

		if (senha.equals(listaDeContas.get(id).getSenha())) {
			return (true);
		} else {
			return (false);
		}
	}
}
