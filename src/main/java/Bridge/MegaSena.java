package Bridge;

public class MegaSena extends Jogo{
    @Override
    public Float calculaPremio() {
        return (this.getValorPremiado() * (this.getPontos().percentualDoPremio()));
    }
}
