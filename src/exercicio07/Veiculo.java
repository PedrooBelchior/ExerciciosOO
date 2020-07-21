package exercicio07;

public class Veiculo {
	private String nome;
	private int numeroDeRodas;
	private double capacidadeDoTanque;
	private double consumo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeRodas() {
		return numeroDeRodas;
	}

	public void setNumeroDeRodas(int numeroDeRodas) {
		this.numeroDeRodas = numeroDeRodas;
	}

	public double getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	public void setCapacidadeDoTanque(double capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public Veiculo(String nome, int numeroDeRodas, double capacidadeDoTanque, double consumo) {
		this.nome = nome;
		this.numeroDeRodas = numeroDeRodas;
		this.capacidadeDoTanque = capacidadeDoTanque;
		this.consumo = consumo;
	}

	public double abastecer(double qtdCombustivel) {
		return this.capacidadeDoTanque -= qtdCombustivel;
	}

	public void exibirAutonomia() {
		this.consumo = this.consumo * this.capacidadeDoTanque;
		System.out.println("Nome: " + this.nome + " Capacidade do Tanque(L): " + this.capacidadeDoTanque
				+ " Autonomia com combustível existente: " + this.consumo);
	}

}
