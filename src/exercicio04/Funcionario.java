package exercicio04;

public class Funcionario extends Pessoa {

    private int matricula;

    public Funcionario(String nome, int idade, String cidadeDeNascimento, int matricula) {
        super(nome, idade, cidadeDeNascimento);
        this.matricula = matricula;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Informações do Funcionario:"
        		+ "Matrícula:"+this.matricula
        		+ "");
    }

    public int getNumeroMatricula() {
        return matricula;
    }

    public void setNumeroMatricula(int matricula) {
        this.matricula = matricula;
    }
}
