package aula9;

public class Aluno {
	private String nome;
	private String sobrenome;
	private int ra;
	private double media;
	private boolean aprovado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	@Override
	public String toString() {
		return "Aluno [getNome()=" + getNome() + ", getSobrenome()="
				+ getSobrenome() + ", getRa()=" + getRa() + ", getMedia()="
				+ getMedia() + ", isAprovado()=" + isAprovado() + "]";
	}
	
	

}
