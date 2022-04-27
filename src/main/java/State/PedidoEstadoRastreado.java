package State;

public class PedidoEstadoRastreado implements PedidoStatus{

    private PedidoEstadoRastreado() {};
    private static PedidoEstadoRastreado instance = new PedidoEstadoRastreado();
    public static PedidoEstadoRastreado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido foi rastreado";
    }

    @Override
    public String enviado(Pedido pedido) {
        return "Pedido enviado";
    }

    @Override
    public String coletado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido coletado";
    }

    @Override
    public String emTransito(Pedido pedido) {
        return "Pedido em trânsito";
    }

    @Override
    public String cancelado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido cancelado";
    }

    @Override
    public String extraviado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido extraviado";
    }

    @Override
    public String entregue(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRastreado.getInstance());
        return "Pedido entregue";
    }
}
