
public class Pessoa {

	private String nome = new String();
	private int diaDeNascimento;
	private int mesDeNascimento;
	private int anoDeNascimento;
	private String telefone = new String();

	public Pessoa() {
		this.nome = "Vazio";
		this.diaDeNascimento = 0;
		this.mesDeNascimento = 0;
		this.anoDeNascimento = 0;
		this.telefone = "000000000";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiaDeNascimento() {
		return diaDeNascimento;
	}

	public void setDiaDeNascimento(int diaDeNascimento) {
		this.diaDeNascimento = diaDeNascimento;
	}

	public int getMesDeNascimento() {
		return mesDeNascimento;
	}

	public void setMesDeNascimento(int mesDeNascimento) {
		this.mesDeNascimento = mesDeNascimento;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}