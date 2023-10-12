package funcionario;

public class App {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("marcus", 20, "Branco", 1.75, false, 1200, false, null);
        fun1.andar();
        fun1.falar();
        fun1.promocao(false);
        fun1.cargo("vendedor");
        System.out.println(fun1.getSalario());
    }
    
}
