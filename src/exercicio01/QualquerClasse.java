package exercicio01;

public class QualquerClasse {
	
		private String nome;
		private int idade;
		private String profissao;

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}

		public void correr() {
			System.out.println("Correndo");
		}

		public void respirar() {
			System.out.println("Respirando");
		}

}
