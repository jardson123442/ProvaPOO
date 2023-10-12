package conta;
public class App {
    public static void main(String[] args) throws Exception {
        Corrente conta1 = new Corrente(1,"Marcos", 500, 1000, false);
        conta1.saldo();
        conta1.tipoConta(false);
        conta1.sacar(499);
        conta1.depositar(100);
        conta1.getLimite();
        conta1.limiteConta(-1);
    

    }
}
