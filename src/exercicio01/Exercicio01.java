package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		QualquerClasse pessoa1 = new QualquerClasse();
		QualquerClasse pessoa2 = new QualquerClasse();
		QualquerClasse pessoa3 = new QualquerClasse();

		pessoa1.setNome("Luiz");
		pessoa2.setIdade(20);
		pessoa3.setProfissao("Caminhoneiro");

		pessoa1.correr();
	}
}
