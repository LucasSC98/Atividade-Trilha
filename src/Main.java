public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Lucas Custódio", "123.456.777-88", "04/07//1998");
        Banco contaBanco = new Banco("Agencia 001", cliente1, 1400.0, "166322-4");

        contaBanco.exibirConta();
        cliente1.mostrarCliente();
        contaBanco.EscolherOpcao();
        cliente1.mostrarCliente();
    }
}