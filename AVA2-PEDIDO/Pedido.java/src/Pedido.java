import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private String status;
    private List<Item> itens;

    public Pedido(int numero, Date data, String status) {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double precoPedido() {
        double total = 0;
        for (Item item : itens) {
            total += item.calculaPreco();
        }
        return total;
    }

    public void avaliarStatus() {
        if (precoPedido() > 0) {
            this.status = "Concluído";
        } else {
            this.status = "Vazio";
        }
    }

    public int getNumero() { return numero; }
    public Date getData() { return data; }
    public String getStatus() { return status; }
}