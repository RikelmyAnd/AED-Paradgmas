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

Tópico 2 - Escolha das linguagens:

As linguagens foram escolhidas seguindo três critérios principais: a sugestão do roteiro da atividade, a bagagem de conhecinemtno prévio e a facilidade configuração e ampla documentação na internet. Aliando esses critérios às características técnicas necessárias para cada paradigma, definiu-se:

Imperativa (C): Escolhida por ser a linguagem base do paradigma imperativo, permitindo um controle explícito e passo a passo do fluxo de execução e a manipulação direta da memória.

Orientada a objeto (Java): Adotada por sua forte tipagem e rigoroso encapsulamento, sendo ideal para representar a classe Aluno como um objeto que detém seus propios dados e comportamentos.

Funcional (JavaScript): Utilizada devido aos seus métodos nativos de manipulação de arrays (como map e filter), permitindo criar um fluxo de dados imutável e declarativo, sem necessitar de laços de repetição tradicionais.

Declarativa/Lógica (Prolog): Escolhida por ser a referencia clássica em programação lógica, focando na declaração de fatos e regras de inferência.

Tópico 3 - Comparação de Legibilidade:

Ao comparar as quatro implementações, a linguagem com maior Legibilidade foi o Prolog, utilizada na etapa declarativa. Enquanto na versão imperativa em C, era exigido uma massiva quantidade de detalhes sintáticos (como ponteiros, uso de & e formatação rígifa no fscanf) e a versão em Java demanda a leitura de multiplos arquivos e classes estruturadas, o Prolog dispensa quase toda essa complexidade.
 A organização do código lógico se assemelha, a uma estrutura de parágrafos de texto convencial. A mesma permite a utilização de nomes claros, tantos nas variavéis como nas regras escritas no código, com a utilização de termos proximos da linguagem humana, como "write" para a impressão dos dados, "is" para a atribuição de valores a uma variavél. Isso torna extremamente fácil entender o fluxo do programa: basta ler os fatos (quem são os alunos) e as regras (o que define a aprovação). Essa clareza facilita não apenas a visualição geral do sistema, mas também a localização imediata de onde cada regra de negócio foi implementada, definindo o Prolog como o código mais limpo para leitura.

Tópico 4 - Comparação de facilidade de escrita

 A linguagem que apresentou a maior facilidade de implementação também foi a Prolog, por motivos similares aos que a tornam mais legivél. A escrita em Prolog assemelha-se a uma conversa lógica com a maquína: o programador apenas informa os dados (fatos), o que cada dado representa no sistema, e as condições de verdade (regras), não sendo necessario a utilização de funções como no JavaScript, ou uma descrição passo a passo do que o programa deve fazer.
O código em Prolog fica consideravelmente mais curto. Após se entender a lógica de "fatos e regras", a escrita se torna direta e quase automática. Em contrapartida, escrever em C requer lidar com uma sintaxe mais rigida e complexa (como o uso de ponteiros e endereços de memória & no fscanf), enquanto o Java exige uma escrita com muito mais código e analises. No Prolog não existe a necessidade de criar estruturas auxiliares complexas como classes e instâncias (Java) ou structs (C), pois os dados foram declarados e manipulados diretamente na base de conhecimento lógico. Além disso o Prolog dispensou totalmente a importação de bibliotecas externas para funcionar, diferente do Java (que necessita de importar bibliotecas de FILE e SCANNER) e do C (que necessita de <stidio.h> e <string.h>), sendo necessaria apenas a declaração lógica do que o sistema deve fazer.
No quesito de manipulação do arquivo exerno .txt, a linguagem JavaScript (Funcional) foi a que exigiu o menor esforço da escrita, permitindo a leitura e quebra do texto do arquivo em poucas linhas utilizando métodos nativos como .split e .map. Contudo, a versão em Prolog contornou essa complexidade, dispensando a leitura do arquivo externo (por se tratar de uma linguagem lógica), incorporando os dados dos alunos diretamente como fatos no corpo do código, tornando a implementação ainda mais rápida e simples de escrever, apenas sendo necessario a passagem dos dados, que apesar de tomar um tempo, pela quantidade reduzida de dados, não pesou tanto.