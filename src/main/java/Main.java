public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("João");
        Cliente c2 = new Cliente("Rafael");
        Cliente c3 = new Cliente("Pedro");
        Conta cc0 = new ContaCorrente(c1);
        Conta cc1 = new ContaCorrente(c1);
        Conta cc2 = new ContaCorrente(c2);
        Conta cp = new ContaPoupanca(c3);

        cc0.depositar(1000);
        cc1.depositar(2000);
        cc2.depositar(3000);
        cp.depositar(4000);

        cc0.getCliente();
    }
}
