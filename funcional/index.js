const fs = require('fs');

const calcularMedia = (n1, n2, n3) => (n1 + n2 + n3) / 3;

const determinarSituacao = (media, frequencia) => {
    if (frequencia < 75) return 'Reprovado por falta';
    if (media >= 6.0) return 'Aprovado';
    return 'Reprovado por nota';
}

const processarDados = (caminhoArquivo) => {
    try {
        const dadosBrutos = fs.readFileSync(caminhoArquivo, 'utf-8');

        const relatoriaFinal = dadosBrutos
            .trim()
            .split('\n')
            .map(linha => linha.split(';'))
            .filter(colunas => colunas.length === 6)
            .map(colunas => {
                const nomes = colunas[0].trim();
                const matricula = parseInt(colunas[1].trim(), 10);
                const n1 = parseFloat(colunas[2].trim());
                const n2 = parseFloat(colunas[3].trim());
                const n3 = parseFloat(colunas[4].trim());
                const frequencia = parseInt(colunas[5].trim(), 10);

                const media = calcularMedia(n1, n2, n3);
                const situacao = determinarSituacao(media, frequencia);
                return `Nome: ${nomes}, Matrícula: ${matricula}, Média: ${media.toFixed(2)}, Frequência: ${frequencia}, Situação: ${situacao}`;
            }).join('\n');

            console.log("Relatório de Alunos:");
            console.log(relatoriaFinal);
        
}catch (error) {
        console.error('Erro ao processar o arquivo:', error.message);
}
};

processarDados('../alunos.txt');