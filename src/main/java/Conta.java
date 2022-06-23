import lombok.Getter;

//É uma classe abstrata, pois não faz sentido instancia-la
public abstract class Conta implements iConta {
    protected final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    @Getter
    protected Banco banco;
    @Getter
    protected int agencia;
    @Getter
    protected int numero;
    @Getter
    protected double saldo;
    @Getter
    protected Cliente cliente;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    protected Conta() {
        Banco.contas.add(this);
    }
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        Banco.contas.add(this);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("A Conta de origem não possui saldo suficiente para realizar esta transferência");
        }
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.nome));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    @Override
    public String toString() {
        return "Conta{" + "\n" +
                "cliente=" + cliente.nome + ",\n" +
                "agencia=" + agencia + ",\n" +
                "numero=" + numero + ",\n" +
                "saldo=" + saldo + ",\n" +
                '}';
    }
}
