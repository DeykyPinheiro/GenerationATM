
public class Pessoa {

	private String primeiroNome = new String();
	private String ultimoNome = new String();
	private int diaDeNascimento;
	private int mesDeNascimento;
	private int anoDeNascimento;
	private String telefone = new String();

	public Pessoa() {
		this.primeiroNome = "Vazio";
		this.ultimoNome = "Vazio";
		this.diaDeNascimento = 0;
		this.mesDeNascimento = 0;
		this.anoDeNascimento = 0;
		this.telefone = "000000000";
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
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
