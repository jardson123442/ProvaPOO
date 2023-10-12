package conta;

public class Corrente {
    private int num;
    private String nome;
    private double saldo;
    private double limite;
    private boolean contaEspecial;

    
    public Corrente(int num, String nome, double saldo, double limite, boolean contaEspecial) {
        this.num = num;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.contaEspecial = contaEspecial;
    }

     public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void tipoConta(boolean contaEspecial){
        if (contaEspecial == true){
            System.out.println("Conta especial!");
        } else {
            System.out.println("A conta não é especial!");
        }
    }
    public void sacar(double saque){
        if (saldo < saque){
            System.out.println("Voce não tem saldo suficiente para o saque");
        } else {
            saldo = saldo - saque;
        }
    }

    public void depositar(double deposito){
        this.saldo = saldo + deposito;
        System.out.println("Agora você tem " + getSaldo() + " de saldo");
    }

    public void saldo(){
        System.out.println("O saldo é de " + getSaldo() + ".");
    }

    public void limiteConta(double limite){
        if (limite < 0){
            System.out.println("Você esta usando a cheque especial!");
        } else {
            System.out.println("Você ainda tem limite!");
        }
    }


   
}
