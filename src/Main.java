import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome do cliente");
        String cliente  = sc.next();
        Cliente cliente1 = new Cliente(cliente);
        ContaCorrente cc = new ContaCorrente(cliente1);
        ContaPoupanca cp = new ContaPoupanca(cliente1);

        double deposito = 0;
        double trasfere = 0;
        double saque = 0;
        System.out.printf("Deseja realizar uma operação?(s/n) ");
        char resposta = sc.next().charAt(0);
        if(resposta == 's'){
            System.out.println("Selecionae a opção desejada:");
            System.out.println("1 - para depósito / 2 - transferência / 3 - para saque / 9 - para encerrar.");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor para deposito: ");
                    deposito = sc.nextDouble();

                    break;
                case 2:
                    System.out.println("Digite o valor da transferencia: ");
                    trasfere = sc.nextDouble();
                    break;

                case 3:
                    System.out.println("Digite o valor do saque: ");
                    saque = sc.nextDouble();

                case 9:
                    System.out.println("Operação cancelada!!!");
            }

        }
        cc.depositar(deposito);
        cc.transferir(trasfere, cp);
        cc.sacar(saque);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
