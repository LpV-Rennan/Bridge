package Bridge;

public class Quina extends Jogo{
    @Override
    public Float calculaPremio() {
        return (this.getValorPremiado()*0.8f*this.getPontos().percentualDoPremio());
    }
}
