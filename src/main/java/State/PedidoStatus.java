package State;

public interface PedidoStatus {

    String getEstado();

    String enviado(Pedido pedido);

    String coletado(Pedido pedido);

    String emTransito(Pedido pedido);

    String cancelado(Pedido pedido);

    String extraviado(Pedido pedido);

    String entregue(Pedido pedido);
}
