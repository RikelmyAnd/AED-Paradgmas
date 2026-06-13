Aluno: Rikelmy Andrade de Araújo

Relatório técnico comparando cada implementação.

Tópico 1 - Descrição do problema:

    O problema trata da criação de um sistema que, através dos dados de um aluno, verifica se o mesmo será considerado aprovado ou reprovado, processando o critério que causou sua eventual reprovação e exibindo um relátorio completo de discentes fornecidos ao sistema. Os dados são fornecidos ao sistema através de um arquivo de texto (.txt), que é aberto e lido pelo programa de forma automática, para processamento das informações.
    Os dados de entrada, consistem nas inforamções de 6 alunos com dados diversos, passadas ao sistema através de um arquivo chamado de alunos.txt, nos seguintes moldes: (Nome, Matricula, Nota1, Nota2, Nota3, Frequência), sendo Nota1, Nota2, e Nota3 as notas de cada etapa atribuídas a cada aluno. Abaixo, apresenta-se uma cópia das informações contidas no arquivo: 

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

Tópico 5 - Comparação de confiabilidade

    A versão que demonstroy ser a mais aparenta mais segura contra falhas estruturais foi a Java (Orientada a Objeto). Essa confiabilidade vem do rigor do paradigma e por ela ser a mais fortemente tipada.
    O Java possui tipagem estática e forte, que significa que todos os dados e operações são validados na fase de compilação. Enquanto em Prolog (Declarativa/Lógica) e no JavaScript (Funcional) os dados são maipulados sem verificação de tipos, podendo assumir múltiplos tipos e os erros muitas das vezes só estouram em tempo de execução, em Java o compilador bloqueia a execução do programa caso alguma regra de tipo seja violada. 
    O rigor do Java força o tratamento de exceçoes de forma explicita (através de blocos try-catch). Durante a leitura do arquivo de texto, se algum dado estiver ausente ou com formato incorreto, a linguagem permite capturar esse erro e tratá-lo antes da gravação dos dados na classe, evitando que o programa sofra uma interrupção abrupta (crash).
    O java também elimina a manipulaçõa manual de endereços de memória, protegendo o programa contra graves erros de ponteiros, algo extremamente perigoso e comum na versão imperativa em C. Além disso, o encapsulamento (utilização de modificadores de acesso como private e public), impede que parâmetros críticos sejam alterados indevidamente por outras partes do código.
    Java também ganha na facilidade de manutenção e testes, por ser modular: cada classe possui sua função delimitada e pode ser testada isoladamente.Erros de sintaxe ou lógica aparecem claramente durante a escrita do código, indicando a exata classe ou método onde existe erro. Enquanto no JavaScript(Funcional) ou no C (Imperativa), manipulações erradas em fluxos de dados ou ponteiros podem passar desapercebidos pelo código, tornando o rastreio de erros mais difícil.

Tópico 6 - Comparação sobre nomes, escopo e tempo de vida

    Em todas as implementações, foram utilizados nomes padronizados para representar a entidade principal e seus atributos: 'Aluno' (ou 'aluno' no Prolog) para a estrutura principal; 'nome' e 'matricula' como identificadores; 'nota1', 'nota2', 'nota3' e 'frequencia' como dados de entrada; e 'média' e situação como variáveis de estado e classificação.

    A forma como os nomes são vistos e sobrevivem varia em cada paradigma:
    
    Na versão imperativa (C): A 'struct Aluno' e a função 'processarAluno' possuem escopo global (visíveis em todo o arquivo median importação do '.h'). Já o vetor 'alunos[50]' e variáveis de iteração ('int total', 'int i') possuem escopo local, restritos à função 'main'. Os atributos só são visíveis e acessados através de operador de ponto ('.') ou seta ('->') usando ponteiros. Os dados do vetor de alunos nascem na memória no momento em que a função 'main' é inciada e preenchidos durante o laço do fscanf. Eles deixam de existir automaticamente assim que o programa atinge o 'return 0' e a função main é encerrada.
    Na versão orientada a objeto (Java): Os atributos ('nome', 'nota1', etc.) possuem escopo de classe e visibilidade 'private' (encapsulamento), sendo visíveis apenas dentro da própria classe 'Aluno'. Para o mundo externo, apenas os métodos getters (ex: 'getNome()') têm visibilidade 'public'. Os objetos são criados explicitamente no momento da instrução 'new Aluno(...)', sendo alocados dinamicamente na memória (Heap). Eles deixam de existir quando a execução termina ou quando perdem a referência (saindo da lista do Relatório), momento em que o Garbage Collector (Coletor de Lixo) do Java passa a destruí-los para liberar memória.
    Na versão funcional (JavaScript): As funções puras ('calcularMedia', 'determinarSituacao') possuem escopo de módulo/global. Porém, as variáveis contendo os dados do arquivo ('const nome', 'const n1') possuem um escopo estrito de bloco dentro do método '.map()'. A imutabilidade afeta o tempo de vida. As variáveis de dados nascem apenas para aquela iteração específica da leitura da linha e "morrem" imediatamente após a função mapear a linha para o texto final. Os dados originais lidos não são retidos em variáveis globais após o término do processamento.
    Na versão declarativa (Prolog): Os predicados (Fatos 'aluno/6' e Regras como 'aprovado/1') têm escopo global, compondo a base de conhecimento estática. No entanto, as Variáveis (como 'Nome', 'Media', iniciadas com letra maiúscula) possuem escopo de cláusula, ou seja, são estritamente locais e só são visíveis dentro da regra onde foram escritas. Os dados primários (Fatos) são criados junto com a compilação do código base. Já os dados calculados dinamicamente (como o valor da 'Media' ou a lista do 'findall') nascem apenas no exato momento em que uma consulta ('?- consultarAprovados.') é executada no terminal, e deixam de existir assim que a resposta é impressa na tela.

Tópico 7 - Comparação sobre tipos de dados

    A forma como os dados foram modelados e tratados evidenciou diversas diferenças técnicas entre os paradigmas. Abaixo é detalhado como cada linguagem lidou de acordo com o fluxo de informações:

    Tipagem estática ou dinâmica e Erros de tipo:

    Nas versões em C (Imperativa) e Java (Orientada a Objetos), a tipagem é estritamente estática. É necessário declarar explicitamente e de forma prévia se a 'nota1' é float/double ou se a 'matrícula' é int. Garantindo uma maior segurança: tentar inserir um texto onde se espera um número gera um erro imediato em tempo de compilação, impedindo a execução. Nas versões em JavaScript (Funcional) e Prolog (Declarativa), a tipagem é dinâmica. Os tipos são inferidos durante a execução. Em JavaScript, uma operação matemática inválida não quebra o compilador, mas pode gerar um erro silencioso do tipo NaN (Not a Number) em tempo de execução.

    Tipos primitivos e Strings:

    A linguagem C demonstrou ser a mais primitiva em relação a manipulação de textos. Não existe um tipo primitivo "String", exigindo o uso de vetores de caracteres ('char nome[50]') e funções externas como 'strcpy()' para realizar operações com palavras. Em Java e JavaScript, as strings são tratadas de forma nativa (no Java como um Objeto e no JS como primitivo), possuindo métodos embutidos que facilitaram a limpeza dos dados (ex: '.trim()'). No Prolog, em vez de strings tradicionais, utilizou-se o conceito de Átomos (ex: ana, carlos). Os nomes funcionam como constantes lógicas irreduzíveis dentro da base de conhecimento, o que é muito mais eficiente para o motor de inferência do que manipular cadeias de texto convencionais.

    Listas, vetores, estruturas e objetos:

    Para agrupar os dados de um aluno, a versão em C utilizou uma struct e limitou o armazenamento a um vetor estático de tamanho fixo (Aluno alunos[50]). Em Java, utilizamos de Objetos instanciados a partir de uma Classe, armazenados em uma estrutura dinâmica (ArrayList<Aluno>), capaz de crescer conforme a necessidade. Na versão JavaScript (Funcional), o foco deslocou-se dos objetos para as Listas (Arrays). Em vez de instanciar objetos Aluno, o texto do arquivo foi transformado diretamente em um Array multidimensional e manipulado puramente através de métodos ('.map', '.filter'). No Prolog, as listas foram utilizadas dinamicamente nos predicados de consulta ('findall' e 'setof'), agrupando as variáveis lógicas que satisfaziam a regra de aprovação em uma estrutura [H|T] nativa da linguagem, sem a necessidade de criar laços de repetição para preenchê-las.

    Conversões de tipo:

    A necessidade de converter dados lidos do arquivo .txt variou bastante. Em C, a conversão ocorreu de forma embutida e mascarada pela formatação do fscanf (usando %d e %f). Em Java e JavaScript, como a leitura inicial do arquivo retorna um bloco de texto puro, houve a necessidade de realizar conversão explícita das strings para números através de funções dedicadas, como 'Double.parseDouble()' e 'Integer.parseInt()' no Java, e 'parseFloat(') e 'parseInt()' no JavaScript. No Prolog, como os dados foram declarados como fatos estáticos, nenhuma conversão de tipo foi necessária.

Tópico 8 - Comparação entre os Paradigmas

    A versão imperativa em C organiza a solução como uma sequência rígida de comandos passo a passo. O foco do paradigma está em ditar "como fazer". O código explicita minuciosamente o fluxo de controle: como abrir o arquivo, como um laço de repetição (while) deve iterar sobre cada linha, e como atualizar o estado das variáveis a cada passo. Os dados (structs) e as funções que os manipulam operam como entidades separadas.
    A versão em Java organiza a solução agrupando dados (atributos) e comportamentos (métodos) em unidades coesas chamadas de Objetos. O problema é modelado com foco no "quem faz". A classe Aluno torna-se uma entidade autossuficiente que contém suas próprias notas e "sabe" calcular a sua própria média. A solução avança através da interação entre esses objetos e classes de gerenciamento (como a classe Relatorio).
    A versão em JavaScript (Funcional) organiza a solução não por passos ou objetos, mas como uma esteira de manipulação contínua de dados. O foco está na aplicação de funções puras e na imutabilidade. Em vez de usar laços de repetição manuais, os dados brutos do arquivo entram no fluxo e passam por métodos de alta ordem (.split(), .map(), .filter()), sendo transformados gradativamente até saírem do outro lado como o texto formatado do relatório, sem alterar o estado de variáveis externas.
    A versão em Prolog organiza a solução através de uma Base de Conhecimento, separando a lógica de negócios do controle de fluxo. O programa declara "o que é verdade" (através dos Fatos estáticos com os dados dos alunos) e "quais são as condições" (através das Regras lógicas de aprovação e reprovação). É o motor de inferência da própria linguagem que decide como buscar as soluções quando uma consulta é realizada, sem que o programador precise escrever o passo a passo.
    A versão Declarativa/Lógica (Prolog) é a mais proxima da forma humana de descrever o problema. Pois ela foca em descrever o problema, onde como na linguagem humana descrevemos as regras de negócios com foco nos requisitos. Raramente damos instruções de alocação de memoria, e criação de laços de interação (conforme o paradigima imperativo).
    A versão Imperativa (C) é a mais prixima da forma como a maquina executa os passos. A arquitetura de processamento dos computadores funciona buscando instruções sequenciais, lidando com endereços de memória, efetuando cálculos na CPU e movendo ponteiros. A linguagem C é a que mais se aproxima dessa operação mecânica de baixo nível, exigindo o controle manual de alocação de dados e ciclos de iteração rigorosos.
    Embora a Orientação a Objetos (Java) fosse ideal caso o sistema precisasse crescer muito (como adicionar professores, turmas e disciplinas financeiras), para o escopo isolado deste problema (receber um .txt, processar fórmulas matemáticas e emitir um relatório), a versão Funcional (JavaScript) demonstrou ser a mais adequada. Como o objetivo é essencialmente ler dados de um lado e formatá-los de outro sem precisar manter estados complexos na memória a longo prazo, o paradigma funcional oferece a solução mais elegante, rápida e segura com a abordagem de pipeline de transformação de strings e cálculos puros.

Tópico 9 - Conclusão

    A implementação do sistema de notas através de quatro abordagens distintas evidenciou que não existe uma linguagem ou paradigma perfeito o melhor que os outros, mas sim que eisrem ferramentas mais adequadas para contextos e problemas específicos. O Paradigma Imperativo (C) é a escolha ideal quando o foco é a performance extrema e o controle direto sobre o hardware e a memória. O Paradigma Orientado a Objetos (Java) destaca-se na engenharia de software corporativa. Sua forte tipagem, com rigoroso encapsulamento e a modularidade baseada em classes o transformam na opção mais segura e escalável. O Paradigma Funcional (JavaScript) provou ser extremamente eficiente e limpo para o processamento em massa e transformação de dados (pipelines). É a melhor escolha para cenários assíncronos ou situações onde a entrada precisa ser filtrada e mapeada para uma saída de forma imutável. Por fim, o Paradigma Lógico (Prolog) demonstrou uma grande capacidade de abstração e resolução de problemas baseados em regras e inferência. Ele se mostra a ferramenta mais adequada para sistemas especialistas, inteligência artificial e validação de regras de negócios, onde declarar "o que é verdade" é muito mais importante e legível do que programar "como a máquina deve calcular".