package poo;

public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.lerAlunosDoArquivo("alunos.txt");
        relatorio.gerarRelatorio();
    }
}