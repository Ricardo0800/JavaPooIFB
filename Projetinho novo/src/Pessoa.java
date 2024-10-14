public class Pessoa {
    private String nome;
    private double peso;
    private int idade;
    private double altura;
    public String getNome() {
        return nome;
    }
    public void setNome(String nomePessoa) {
        this.nome = nomePessoa;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idadePessoa) {
        this.idade = idadePessoa;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double alturaPessoa) {
        this.altura = alturaPessoa;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double pesoPessoa) {
        this.peso = pesoPessoa;
    }
    
}
