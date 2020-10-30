package usapedidos;

import java.util.ArrayList;
import java.util.List;

public class UsaPedidos {
    public static void main(String[] args) {
        //inicialização do pedido
        List<Item> itens = new ArrayList<Item>();
        Produto p1 = new Produto("Camiseta Casual Class", 40);
        Produto p2 = new Produto("Caneca Java", 20);
        itens.add(new Item(p1, 10));
        itens.add(new Item(p2, 15));
        Cliente cliente = new Cliente("Carlos da Silva");
        FormaPagamento fp = new FormaPagamento("a prazo");

        Pedido ped = new Pedido();
        ped.setItens(itens);
        ped.setCliente(cliente);
        ped.setPagamento(fp);

        System.out.println("Valor do pedido com desconto:" + ped.getComDesconto());
    }
    
}
