programa
{
    funcao inicio()
    {
        // Declaração de variáveis comuns
        cadeia nomeFundo
        real taxaCDB, tetoRegulatorio
        logico operacaoRiscosa

        // Inicialização do teto regulatório padrão do mercado (%)
        tetoRegulatorio = 13.0
        operacaoRiscosa = falso

        // Entrada de dados interativa
        escreva("=== SISTEMA DE AUDITORIA: ANÁLISE DE CDB ===\n\n")
        
        escreva("Digite o nome do fundo de investimento: ")
        leia(nomeFundo)

        escreva("Digite a taxa de juros oferecida pelo CDB (%): ")
        leia(taxaCDB)

        escreva("\n----------------------------------------------------\n")
        escreva("RELATÓRIO PRELIMINAR:\n")
        escreva("Fundo Analisado: ", nomeFundo, "\n")
        escreva("Taxa Oferecida: ", taxaCDB, "%\n")
        escreva("Teto Regulatório Permitido: ", tetoRegulatorio, "%\n\n")

        // Estrutura Condicional Composta (Se / Senão)
        se (taxaCDB > tetoRegulatorio) 
        {
            escreva("[ALERTA CRÍTICO] A taxa do CDB está acima do teto regulatório!\n")
            escreva("Motivo: Captação agressiva para atrair liquidez de forma artificial.\n")
            operacaoRiscosa = verdadeiro
        } 
        senao 
        {
            escreva("[REGULAR] A taxa do CDB está dentro dos limites prudenciais.\n")
            operacaoRiscosa = falso
        }

        // Parecer final com base na variável lógica de risco
        escreva("\n----------------------------------------------------\n")
        se (operacaoRiscosa) 
        {
            escreva("Parecer do Auditor: Ativo bloqueado para novas emissões.\n")
        } 
        senao 
        {
            escreva("Parecer do Auditor: Ativo liberado para comercialização.\n")
        }
    }
}