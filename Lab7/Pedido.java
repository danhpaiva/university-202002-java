package usapedidos;

import java.util.Collection;
import java.util.List;

 public class Pedido {

 private FormaPagamento pagamento;
 private Cliente cliente;
 private Collection<Item> itens;

 public double getTotal() {
    double total = 0;
    for(Item item: itens ) {
        total += item.getProduto().getValor() * item.getQuantidade();
    }         
    return total;
 }

 public double getComDesconto() {
    if (getPagamento().getDescricao().equals("a vista")) {
        return getTotal() - (0.2 * getTotal());
    } else if (getTotal() > 500) {
        return getTotal() - (0.15 * getTotal());
    } else if (getTotal() > 300) {
        return getTotal() - (0.1 * getTotal());
    }
    return getTotal();
 }

    public FormaPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Item> getItens() {
        return itens;
    }

      public void setItens(Collection<Item> itens) {
        this.itens = itens;
    }

}
