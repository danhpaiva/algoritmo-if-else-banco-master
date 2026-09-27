import java.util.Scanner;

public class AuditoriaBancoMaster {
    public static void main(String[] args) {
        // Declaração do Scanner para leitura de dados via teclado
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis comuns
        String nomeFundo;
        double taxaCDB;
        double tetoRegulatorio = 13.0; // Teto regulatório padrão do mercado (%)
        boolean operacaoRiscosa = false;

        // Entrada de dados interativa
        System.out.println("=== SISTEMA DE AUDITORIA: ANÁLISE DE CDB ===\n");

        System.out.print("Digite o nome do fundo de investimento: ");
        nomeFundo = scanner.nextLine();

        System.out.print("Digite a taxa de juros oferecida pelo CDB (%): ");
        taxaCDB = scanner.nextDouble();

        System.out.println("\n----------------------------------------------------");
        System.out.println("RELATÓRIO PRELIMINAR:");
        System.out.println("Fundo Analisado: " + nomeFundo);
        System.out.println("Taxa Oferecida: " + taxaCDB + "%");
        System.out.println("Teto Regulatório Permitido: " + tetoRegulatorio + "%\n");

        // Estrutura Condicional Composta (if / else)
        if (taxaCDB > tetoRegulatorio) {
            System.out.println("[ALERTA CRÍTICO] A taxa do CDB está acima do teto regulatório!");
            System.out.println("Motivo: Captação agressiva para atrair liquidez de forma artificial.");
            operacaoRiscosa = true;
        } else {
            System.out.println("[REGULAR] A taxa do CDB está dentro dos limites prudenciais.");
            operacaoRiscosa = false;
        }

        // Parecer final com base na variável lógica de risco
        System.out.println("\n----------------------------------------------------");
        if (operacaoRiscosa) {
            System.out.println("Parecer do Auditor: Ativo bloqueado para novas emissões.");
        } else {
            System.out.println("Parecer do Auditor: Ativo liberado para comercialização.");
        }

        // Fechamento do scanner para evitar vazamento de recursos
        scanner.close();
    }
}