package State;

public class PedidoEstadoEmTransito implements PedidoStatus{

    private PedidoEstadoEmTransito() {};
    private static PedidoEstadoEmTransito instance = new PedidoEstadoEmTransito();
    public static PedidoEstadoEmTransito getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido está em trânsito";
    }

    @Override
    public String enviado(Pedido pedido) {
        return "Pedido foi enviado";
    }

    @Override
    public String coletado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido foi coletado";
    }

    @Override
    public String emTransito(Pedido pedido) {
        return "Pedido está em trânsito";
    }

    @Override
    public String cancelado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido não cancelado";
    }

    @Override
    public String extraviado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido não extraviado";
    }

    @Override
    public String entregue(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido não entregue";
    }
}
