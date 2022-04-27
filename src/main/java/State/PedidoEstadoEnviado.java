package State;

public class PedidoEstadoEnviado implements PedidoStatus{

    private PedidoEstadoEnviado() {};
    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido foi rastreado";
    }

    @Override
    public String enviado(Pedido pedido) {
        return "Pedido já foi enviado";
    }

    @Override
    public String coletado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido ainda não coletado";
    }

    @Override
    public String emTransito(Pedido pedido) {
        return "Pedido não está em trânsito";
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
