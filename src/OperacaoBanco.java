import java.util.Scanner;

public class OperacaoBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Vinícius Oliveira Santana";
        String tipoConta = "Conta Corrente";
        double saldoConta = 4500;
        double valorRecebe;
        double valorEnvia;
        int operacao = 0;
        String escolhaoperacao =("""
                **OPERAÇÕES**
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                Digite a opção desejada:
                """);


        String saudacaoBanco = ("""
                *****************************************
                Dados iniciais do cliente:
                
                Nome:         %s
                Tipo Conta:   %s
                Saldo inicial R$ %.2f
                
                *****************************************
                """).formatted(nome, tipoConta, saldoConta);
        System.out.println(saudacaoBanco);

        while ( operacao != 4){
            System.out.println(escolhaoperacao);
            operacao = leitura.nextInt();
            if (operacao == 1){
                System.out.println("Seu Saldo em conta é R$" +saldoConta);
                System.out.println("Deseja realizar outra operação?");
            }else if (operacao == 2){
                System.out.println("Qual é o valor a receber?");
                valorRecebe = leitura.nextDouble();
                saldoConta += valorRecebe;
                System.out.println("Valor Recebido! Seu Saldo Atual agora é de R$"+saldoConta);
                System.out.println("Deseja realizar outra operação?");
            }else if (operacao == 3){
                System.out.println("Qual valor deseja Enviar?");
                valorEnvia = leitura.nextDouble();
                if (valorEnvia > saldoConta){
                    System.out.println("Valor excede o saldo em conta, seu saldo é de R$"+saldoConta);
                    System.out.println("Deseja realizar outra operação?");
                }else {
                    saldoConta -= valorEnvia;
                    System.out.println("Valor enviado! Seu Saldo Atual agora é de R$"+saldoConta);
                    System.out.println("Deseja realizar outra operação?");
                }
            }else if(operacao == 4){
                System.out.println("Sessão encerrada! Obrigado Pela preferência!");
            } else {
                System.out.println("Opção Invalida! Deseja realizar outra operação?");
            }
        }
    }
}
