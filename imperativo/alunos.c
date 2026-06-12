#include "alunos.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void processarAlunos(Aluno *alunos) {

    alunos->media = (alunos->nota1 + alunos->nota2 + alunos->nota3) / 3.0;

    if (alunos->frequencia < 75) {
        strcpy(alunos->situacao, "Reprovado por Frequência");
    } else if (alunos->media >= 6.0) {
        strcpy(alunos->situacao, "Aprovado");
    } else {
        strcpy(alunos->situacao, "Reprovado por Nota");
    }

}