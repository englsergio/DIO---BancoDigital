import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public abstract class Banco {
    private int id;
    private static String nome;
    @Setter(AccessLevel.NONE)
    public static List<Conta> contas = new ArrayList<>();
    @Setter(AccessLevel.NONE)
    public static List<Cliente> clientes = new ArrayList<>();

}
