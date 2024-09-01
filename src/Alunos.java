public class Alunos {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Alunos(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }
    public String ImcFormato() {
        return String.format("%.2f", calcularImc());
    }

    public void mostrarAluno() {
        System.out.println("Aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("--------------------------------------------");
        if (calcularImc() < 18.5) {
            System.out.println("O IMC de " +getNome()+" está abaixo do normal, IMC: "+ImcFormato());
        }else if (calcularImc() >= 18.6 && calcularImc() <= 24.9){
            System.out.println("O IMC de " +getNome()+" está normal, IMC: "+ImcFormato());
        }else if(calcularImc() >= 25){
            System.out.println("O IMC de " +getNome()+" está acima do normal, IMC: "+ImcFormato());
        }
        System.out.println("--------------------------------------------");

        if(idade < 18){
            System.out.println(getNome()+" - Ganhou o desconto na mensalidade");
        }else{
            System.out.println(getNome()+" - Não ganha o desconto de mensalidade");
        }
        System.out.println("--------------------------------------------");
    }

}
