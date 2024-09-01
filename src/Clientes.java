public class Clientes {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Clientes(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarCliente(){
        System.out.println("Nome do titular: " + nome+ "\nCPF: " + cpf + "\nData de nascimento: " + dataNascimento);
    }
}
