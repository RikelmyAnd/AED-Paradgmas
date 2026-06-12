aluno(ana,2024001,8.0,7.5,9.0,85).
aluno(bruno,2024002,5.0,4.5,6.0,90).
aluno(carlos,2024003,9.0,8.5,9.5,60).
aluno(diana,2024004,7.0,7.0,7.0,75).
aluno(eduardo,2024005,6.5,7.5,6.0,80).
aluno(fernanda,2024006,10.0,9.5,10.0,100).

frequencia(Nome, Frequencia) :-
    aluno(Nome, _, _, _, _, Frequencia).

media(Nome, Media) :-
    aluno(Nome, _, Nota1, Nota2, Nota3, _),
    Media is (Nota1 + Nota2 + Nota3) / 3.

aprovado(Nome) :-
    media(Nome, Media),
    Media >= 6.0,
    frequencia(Nome, Frequencia),
    Frequencia >= 75.

reprovado(Nome) :-
    media(Nome, Media),
    (Media < 6.0).

reprovado(Nome) :-
    frequencia(Nome, Frequencia),
    Frequencia < 75.

consultarAprovados :-
    findall(Nome, aprovado(Nome), ListaAprovados),
    write('Alunos aprovados: '), write(ListaAprovados), nl.

consultarReprovados :-
    setof(Nome, reprovado(Nome), ListaReprovados),
    write('Alunos reprovados: '), write(ListaReprovados), nl.