#include "alunos.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    FILE *file = fopen("../alunos.txt", "r");
    if (file == NULL) {
        perror("Erro ao abrir o arquivo");
        return 1;
    }

    Aluno alunos[50];
    int total = 0;

    while (fscanf(file, "%[^;];%d;%f;%f;%f;%d\n", 
                  alunos[total].nome, 
                  &alunos[total].matricula, 
                  &alunos[total].nota1, 
                  &alunos[total].nota2, 
                  &alunos[total].nota3, 
                  &alunos[total].frequencia) == 6) {
        processarAlunos(&alunos[total]);
        total++;
    }

    printf("Relatório de Alunos:\n");
    for (int i = 0; i < total; i++) {
        printf("Nome: %s, Matrícula: %d, Média: %.2f, Situação: %s\n", 
               alunos[i].nome, 
               alunos[i].matricula, 
               alunos[i].media, 
               alunos[i].situacao);
    }
    printf("Total de alunos processados: %d\n", total);
    printf("Fim do relatório.\n");

    fclose(file);
    return 0;
}