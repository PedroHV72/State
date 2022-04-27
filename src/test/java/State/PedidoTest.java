package State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido enviado

    @Test
    public void deveRetornarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Pedido já foi enviado", pedido.enviado());
    }

    @Test
    public void naoDeveRetornarPedidoColetado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Pedido ainda não coletado", pedido.coletado());
    }

    @Test
    public void naoDeveRetornarPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Pedido não está em trânsito", pedido.emTransito());
    }

    @Test
    public void naoDeveRetornarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Pedido não cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoExtraviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido coletado

    @Test
    public void deveRetornarPedidoColetadoEnviado() {
        pedido.setEstado(PedidoEstadoColetado.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoColetado() {
        pedido.setEstado(PedidoEstadoColetado.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoEmTransito() {
        pedido.setEstado(PedidoEstadoColetado.getInstance());
        assertEquals("Pedido não está em trânsito", pedido.emTransito());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoCancelado() {
        pedido.setEstado(PedidoEstadoColetado.getInstance());
        assertEquals("Pedido não cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoExtraviado() {
        pedido.setEstado(PedidoEstadoColetado.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoEntregue() {
        pedido.setEstado(PedidoEstadoColetado.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido em trânsito

    @Test
    public void deveRetornarPedidoEmTransitoEnviado() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoEmTransitoColetado() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void naoDeveRetornarPedidoEmTransitoCancelado() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertEquals("Pedido não cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoEmTransitoExtraviado() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoEmTransitoEntregue() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido cancelado

    @Test
    public void deveRetornarPedidoCanceladoEnviado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoCanceladoColetado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoCanceladoEmTransito() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void deveRetornarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Pedido cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoCanceladoExtraviado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoCanceladoEntregue() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido extraviado

    @Test
    public void deveRetornarPedidoExtraviadoEnviado() {
        pedido.setEstado(PedidoEstadoExtraviado.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoExtraviadoColetado() {
        pedido.setEstado(PedidoEstadoExtraviado.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoExtraviadoEmTransito() {
        pedido.setEstado(PedidoEstadoExtraviado.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void deveRetornarPedidoExtraviadoCancelado() {
        pedido.setEstado(PedidoEstadoExtraviado.getInstance());
        assertEquals("Pedido cancelado", pedido.cancelado());
    }

    @Test
    public void deveRetornarPedidoExtraviado() {
        pedido.setEstado(PedidoEstadoExtraviado.getInstance());
        assertEquals("Pedido extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoExtraviadoEntregue() {
        pedido.setEstado(PedidoEstadoExtraviado.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido entregue

    @Test
    public void deveRetornarPedidoEntregueEnviado() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoEntregueColetado() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoEntregueEmTransito() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void naoDeveRetornarPedidoEntregueCancelado() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals("Pedido não cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoEntregueExtraviado() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void deveRetornarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals("Pedido entregue", pedido.entregue());
    }
}
