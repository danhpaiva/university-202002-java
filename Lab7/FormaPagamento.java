package usapedidos;

public class FormaPagamento {
    String forma;
    FormaPagamento(String forma) {
        this.forma = forma;
    }

    String getDescricao() {
        return forma;
    }
    
}
