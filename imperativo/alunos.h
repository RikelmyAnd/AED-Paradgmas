#ifndef ALUNOS_H
#define ALUNOS_H

typedef struct {
    char nome[50];
    int matricula;
    float nota1;
    float nota2;
    float nota3;
    int frequencia;
    float media;
    char situacao[30];
} Aluno;

void processarAlunos(Aluno *alunos);

#endif