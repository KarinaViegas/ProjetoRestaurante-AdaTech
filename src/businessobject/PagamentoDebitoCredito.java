package businessobject;

import java.math.BigDecimal;

public class PagamentoDebitoCredito implements MetodoPagamento{


    private boolean statusPagamento;
    private String infoPagamento;

    public PagamentoDebitoCredito() {}

    @Override
    public MetodoPagamento pagar(BigDecimal valorTotal, BigDecimal valorPago) {
        BigDecimal valorRestante = valorTotal.subtract(valorPago);
        if(valorRestante.compareTo(BigDecimal.ZERO) == 0){
            this.statusPagamento = true;
            this.infoPagamento = "Pagamento realizado com sucesso";
        }else{
            statusPagamento = false;
            infoPagamento = "Pagamento não processado, o valor pago é diferente do valor total da conta. \nO valor total da conta foi R$"+valorTotal;
        }
        return this;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getInfoPagamento() {
        return infoPagamento;
    }

    public void setInfoPagamento(String infoPagamento) {
        this.infoPagamento = infoPagamento;
    }
}
