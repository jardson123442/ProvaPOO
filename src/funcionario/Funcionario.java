package funcionario;


public class Funcionario extends Pessoa{
    private double salario;
    private boolean promocao;
    private String cargo;
    
    
    public Funcionario(String nome, int idade, String cor, double altura, boolean deficiente, double salario,
            boolean promocao, String cargo) {
        super(nome, idade, cor, altura, deficiente);
        this.salario = salario;
        this.promocao = promocao;
        this.cargo = cargo;
    }
    
    

    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    protected void promocao(boolean promocao){
        if (promocao == true) {
            salario = salario + salario*0.2;
        } else {
            System.out.println("Não conseguiu a promoção");
        }
    }
    

    protected void cargo(String cargo){
        if (cargo == "vendedor"){
            salario = salario + 1000;
        } if (cargo == "gerente") {
            salario = salario + salario*0.3;  
        } 
    }

    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public boolean isPromocao() {
        return promocao;
    }


    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    
}
