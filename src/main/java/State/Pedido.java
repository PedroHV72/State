package State;

public class Pedido {

    private String nome;

    private PedidoStatus status;

    public Pedido() {
        this.status = PedidoEstadoRastreado.getInstance();
    }

    public void setEstado(PedidoStatus status) {
        this.status = status;
    }

    String enviado(){
        return status.enviado(this);
    };

    String coletado(){
        return status.coletado(this);
    };

    String emTransito(){
        return status.emTransito(this);
    };

    String cancelado(){
        return status.cancelado(this);
    };

    String extraviado(){
        return status.extraviado(this);
    };

    String entregue(){
        return status.entregue(this);
    };

    public PedidoStatus getEstado() {
        return status;
    }
    public String getNomeEstado() {
        return status.getEstado();
    }

}