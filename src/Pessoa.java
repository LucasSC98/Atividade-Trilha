public class Pessoa {
    public String nome;
    public String dataNascimento;
    public Universidade universidade;

    public Pessoa(String nome, String dataNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }
    public String getNome() {
        return nome;
    }

    public String ondeTrabalha() {
        return universidade.getNome();
    }
    public String nascimento(){
        return dataNascimento;
    }

    public static void main(String[] args) {
        Universidade princeton = new Universidade("Princeton (Nova Jersey - EUA)");
        Universidade cambridge = new Universidade("Cambridge (Inglaterra)");

        Pessoa einstein = new Pessoa("Albert Einstein", "14/03/1879", princeton);
        Pessoa newton = new Pessoa("Isaac Newton", "04/01/1643", cambridge);

        System.out.println(einstein.getNome() + " (nasceu em " + einstein.nascimento() + " ) trabalhou como professor de física na universade:  " + einstein.ondeTrabalha());
        System.out.println(" ");
        System.out.println(newton.getNome() + " (nasceu em " + newton.nascimento() + " ) trabalhou como professor de matemática na universade:  " + newton.ondeTrabalha());
    }
}
