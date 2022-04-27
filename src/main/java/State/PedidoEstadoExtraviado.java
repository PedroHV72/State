package State;

public class PedidoEstadoExtraviado implements PedidoStatus{

    private PedidoEstadoExtraviado() {};
    private static PedidoEstadoExtraviado instance = new PedidoEstadoExtraviado();
    public static PedidoEstadoExtraviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido extraviado";
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
        return "Pedido não entregue";
    }
}
