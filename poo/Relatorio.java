package poo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Relatorio {
    private List<Aluno> alunos;

    public Relatorio() {
        alunos = new ArrayList<>();
    }

    public void lerAlunosDoArquivo(String nomeArquivo) {
        try (Scanner scanner = new Scanner(new File(nomeArquivo))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(";");
                if (partes.length == 6) {
                    String nome = partes[0].trim();
                    int matricula = Integer.parseInt(partes[1].trim());
                    double nota1 = Double.parseDouble(partes[2].trim());
                    double nota2 = Double.parseDouble(partes[3].trim());
                    double nota3 = Double.parseDouble(partes[4].trim());
                    int frequencia = Integer.parseInt(partes[5].trim());
                    Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3, frequencia);
                    alunos.add(aluno);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + nomeArquivo);
        }
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Frequência: " + aluno.getFrequencia() + "%");
            System.out.println("Situação: " + aluno.determinarSituacao());
        }
        System.out.println("Fim do relatório\n");
    }
}
