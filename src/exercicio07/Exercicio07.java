package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo("Siena", 4, 50, 5);
		Veiculo veiculo2 = new Veiculo("Uno", 4, 50, 10);

		veiculo1.abastecer(20);
		veiculo2.abastecer(20);

		veiculo1.exibirAutonomia();
		veiculo2.exibirAutonomia();

	}

}
