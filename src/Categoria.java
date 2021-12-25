public class Categoria {
    private int nivel;
    private Premio puntos;

    public Categoria(int nivel, Premio puntos) {
        this.nivel = nivel;
        this.puntos = puntos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Premio getPuntos() {
        return puntos;
    }

    public void setPuntos(Premio puntos) {
        this.puntos = puntos;
    }
}
