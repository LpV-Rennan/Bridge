package Bridge;

public abstract class Jogo {
    private Pontos pontos;
    private Float valorPremiado;

    public Pontos getPontos() {
        return pontos;
    }

    public void setPontos(Pontos pontos) {
        this.pontos = pontos;
    }

    public Float getValorPremiado() {
        return valorPremiado;
    }

    public void setValorPremiado(Float valorPremiado) {
        this.valorPremiado = valorPremiado;
    }

    public abstract Float calculaPremio();
}
