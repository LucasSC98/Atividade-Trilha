import java.util.Scanner;

public class Banco {
    private String agencia;
    private String numeroConta;
    private double saldo;
    private Clientes clientes;


    public Banco(String agencia, Clientes clientes, double saldo, String numeroConta) {
        this.agencia = agencia;
        this.clientes = clientes;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    Scanner sc = new Scanner(System.in);


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numeroConta;
    }

    public void setNumero(String numero) {
        this.numeroConta = numero;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        System.out.print("Saldo que deseja depositar R$: ");
        double saldoDeposito = sc.nextInt();
        System.out.println("Você depositou R$: " + saldoDeposito);
        saldo = saldo + saldoDeposito;
        System.out.println("Saldo atual R$: " + saldo);
    }
    public void sacarSaldo(){
        System.out.print("Quanto deseja sacar: ");
        double valor = sc.nextDouble();
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Você sacou R$: " + valor + " da sua conta bancaria");
            saldo = saldo - valor;
            System.out.println("Saldo atual R$: " + saldo);
        }
    }
    public void exibirConta() {
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Numero: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }

    public void saldoDisponivel() {
        System.out.println("Saldo disponivel R$: " + saldo);
    }

    public void EscolherOpcao() {
        Integer opcao = 0;
        while (opcao != 4) {
            System.out.println("-------------------------------------------------------");
            System.out.println(" 1 - Para depositar \n 2 - Para Sacar \n 3 - Para Verificar Saldo \n 4 - Sair da conta");
            System.out.print("     Digite a opção: ");
            opcao = sc.nextInt();
            System.out.println("-------------------------------------------------------");
            if (opcao == 1) {
                setSaldo();
            } else if (opcao == 2) {
                sacarSaldo();
            } else if (opcao == 3) {
                saldoDisponivel();
            } else if (opcao == 4) {
                System.out.println("Você escolheu sair");
            } else {
                System.out.println("Opço invalida");
            }
        }
    }
}