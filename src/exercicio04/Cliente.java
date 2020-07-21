package exercicio04;

public class Cliente extends Pessoa {

    private String cpf;

    public Cliente(String nome, int idade, String cidadeDeNascimento, String cpf) {
        super(nome, idade, cidadeDeNascimento);
        this.cpf = cpf;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Dados do Cliente:"
        		+ "CPF:"+this.cpf
        		+ "");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
