package Bridge;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MegaSenaTest {
    @Test
    void deveRetornarMetadaDoValorDoPremio(){
        MegaSena jogo = new MegaSena();
        Sextoplo sextoplo = new Sextoplo();
        jogo.setValorPremiado(1000f);
        jogo.setPontos(sextoplo);
        Assert.assertEquals(500f,jogo.calculaPremio(),0.1f);
    }

}