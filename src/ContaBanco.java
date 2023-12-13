import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Jaqueline Oliveira";
        String tipConta = "Corrente";
        double saldoInicial = 2500.000;
        int opção = 0;

        System.out.println("************************");
        System.out.println("\nNome da Conta: " + nome);
        System.out.println("Tipo da Conta: " + tipConta);
        System.out.println("Saldo: " + saldoInicial);
        System.out.println("\n************************");

        String menu = """
                **Digite sua opção**
                1 - Consultar Saldo
                2 - Transferir valor
                3 - Receber Valor
                4 - Sair             
                """;
        while (opção !=4) {
            System.out.println(menu);
            opção = leitura.nextInt();

            if (opção == 1) {
                System.out.println("Seu saldo atual é de: " + saldoInicial);

            }
            if (opção == 2) {
                double valorT = 0;
                System.out.println("Quanto você deseja trasnferir?");
                valorT = leitura.nextInt();
                saldoInicial -= valorT;
                System.out.println("Saldo transferido valor atual: " + saldoInicial);

            }
            if (opção == 3) {
                double valorR = 0;
                System.out.println("Digite o valor a ser recebido: ");
                valorR = leitura.nextInt();
                saldoInicial += valorR;
                System.out.println("Transferencia recebida seu saldo atual é " + saldoInicial);



            }





        }



    }
}
