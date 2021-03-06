package Bridge;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MegaSenaTest {
    @Test
    void deveRetornarMetadeDoValorDoPremio(){
        MegaSena jogo = new MegaSena();
        Sextoplo sextoplo = new Sextoplo();
        jogo.setValorPremiado(1000f);
        jogo.setPontos(sextoplo);
        Assert.assertEquals(500f,jogo.calculaPremio(),0.1f);
    }

    @Test
    void deveRetornar30PorcentoDoValorDoPremio(){
        MegaSena jogo = new MegaSena();
        Quintupla quintupla = new Quintupla();
        jogo.setValorPremiado(1000f);
        jogo.setPontos(quintupla);
        Assert.assertEquals(300f,jogo.calculaPremio(),0.1f);
    }

    @Test
    void deveRetornar10PorcentoDoValorDoPremio(){
        MegaSena jogo = new MegaSena();
        Quadra quadra = new Quadra();
        jogo.setValorPremiado(1000f);
        jogo.setPontos(quadra);
        Assert.assertEquals(100f,jogo.calculaPremio(),0.1f);
    }

}