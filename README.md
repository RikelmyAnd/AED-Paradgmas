Aluno: Rikelmy Andrade de Araújo

Relatório técnico comparando cada implementação.

Tópico 1 - Descrição do problema:

O problema trata da criação de um sistema que, através dos dados de um aluno, verifica se o mesmo será considerado aprovado ou reprovado, processando o critério que causou sua eventual reprovação e exibindo um relátorio completo de discentes fornecidos ao sistema. Os dados são fornecidos ao sistema através de um arquivo de texto (.txt), que é aberto e lido pelo programa de forma automática, para processamento das informações.
Os dados de entrada, consistem nas inforamções de 6 alunos com dados diversos, passadas ao sistema através de um arquivo chamado de alunos.txt, nos seguintes moldes: (Nome, Matricula, N1, N2, N3, Frequência), sendo N1, N2, e N3 as notas de cada etapa atribuídas a cada aluno. Abaixo, apresenta-se uma cópia das informações contidas no arquivo: 

Ana;2024001;8.0;7.5;9.0;85
Bruno;2024002;5.0;4.5;6.0;90
Carlos;2024003;9.0;8.5;9.5;60
Diana;2024004;7.0;7.0;7.0;75
Eduardo;2024005;6.5;7.5;6.0;80
Fernanda;2024006;10.0;9.5;10.0;100

Os critérios para a aprovação dos alunos são dois: uma média final maior ou igual a 6.0 e uma frequência maior ou igual a 75%. O aluno será reprovado caso não obtenha desempenho suficiente em algum dos dois requisitos, com a média sendo calculada da seguinte forma:

Media Final = (N1+N2+N3)/3

O formato esperado para saída é um relátorio exibindo os dados processados dos alunos, sua situação final (aprovado ou reprovado) e o respectivo motivo em caso de reprovação, conforme o molde abaixo:

Nome: Ana, Matrícula: 2024001, Média: 8,16, Frequência: 85%, Situação: Aprovado

