package poo;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private int frequencia;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, int frequencia) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.frequencia = frequencia;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String determinarSituacao() {
        double media = calcularMedia();
        if (frequencia < 75) {
            return "Reprovado por falta";
        } else if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado por nota";
        }
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getFrequencia() {
        return frequencia;
    }
}
