package funcionario;

public class Pessoa {
    private String nome;
    private int idade;
    private String cor;
    private double altura;
    private boolean deficiente;

    public Pessoa(String nome, int idade, String cor, double altura, boolean deficiente) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.altura = altura;
        this.deficiente = deficiente;
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
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public boolean isDeficiente() {
        return deficiente;
    }
    public void setDeficiente(boolean deficiente) {
        this.deficiente = deficiente;
    }

    protected void falar(){
        System.out.println(getNome() + " esta falando!");
    }
    protected void andar(){
        System.out.println(getNome() + " esta andando!");   
    }
    
}
