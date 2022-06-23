import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter @Setter @Accessors(fluent = true)
public class Cliente {
    protected int id;
    protected String nome;
    protected Banco banco;
    protected List<Conta> contas;

    public Cliente() {
        Banco.clientes.add(this);
    }
    public Cliente(String nome) {
        this.nome = nome;
        Banco.clientes.add(this);
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
