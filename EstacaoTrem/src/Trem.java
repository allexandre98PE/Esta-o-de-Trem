public class Trem extends Thread {

	String nome_trem;
	boolean direcao;
	Estacao estacao;

	public Trem(String nome_trem, Estacao estacao, boolean direcao) {
		super();
		this.nome_trem = nome_trem;
		this.estacao = estacao;
		this.direcao = direcao;
	}

	public void run()
	{
		estacao.controle(nome_trem, direcao);
	}
}
