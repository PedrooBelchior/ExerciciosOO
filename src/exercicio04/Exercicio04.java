package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {
        Cliente cli = new Cliente("Pedro", 23, "São Paulo", "111.111.111-11");
        
        cli.exibirDados();
        
        Funcionario func = new Funcionario("Gutem", 24, "São Paulo", 166534);
        
        func.exibirDados();
    }
}
