package Bridge;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class QuinaTest {
    @Test
    void deveRetornar40PorcentoDoValorDoPremio(){
        Quina jogo = new Quina();
        Sextoplo sextoplo = new Sextoplo();
        jogo.setValorPremiado(1000f);
        jogo.setPontos(sextoplo);
        Assert.assertEquals(400f,jogo.calculaPremio(),0.1f);
    }

    @Test
    void deveRetornar24PorcentoDoValorDoPremio(){
        Quina jogo = new Quina();
        Quintupla quintupla = new Quintupla();
        jogo.setValorPremiado(1000f);
        jogo.setPontos(quintupla);
        Assert.assertEquals(240f,jogo.calculaPremio(),0.1f);
    }

    @Test
    void deveRetornar8PorcentoDoValorDoPremio(){
        Quina jogo = new Quina();
        Quadra quadra = new Quadra();
        jogo.setValorPremiado(1000f);
        jogo.setPontos(quadra);
        Assert.assertEquals(80f,jogo.calculaPremio(),0.1f);
    }

}