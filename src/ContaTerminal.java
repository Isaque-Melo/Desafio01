public class ContaTerminal {
    int numero;
    String agencia;
    double saldo;
    String nome;

    public ContaTerminal(int numero, String agencia, double saldo, String nome) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nome = nome;
    }
    public void CriandoConta(){
        System.out.println();
        System.out.println("Digite o numero da agencia:");
        this.agencia = System.console().readLine();
        System.out.println("Digite o nome do banco:");
        this.nome = System.console().readLine();
        System.out.println("Digite seu nome:");
        this.nome = System.console().readLine();
        System.out.println("Digite o saldo inicial:");
        this.saldo = Double.parseDouble(System.console().readLine());
    }
    public void Apresentacao(){
        System.out.println("Bem vindo ao banco "+this.nome);
        System.out.println("Agencia: "+this.agencia);
        System.out.println("Nome: "+this.nome);
        System.out.println("Saldo: "+this.saldo);
    }

}





