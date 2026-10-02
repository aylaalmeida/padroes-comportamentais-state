package padroescomportamentais.state;

public class Livro {

    private String titulo;
    private LivroEstado estado;

    public Livro() {
        this.estado = LivroEstadoDisponivel.getInstance();
    }

    public void setEstado(LivroEstado estado) {
        this.estado = estado;
    }

    public boolean reservar() {
        return estado.reservar(this);
    }

    public boolean emprestar() {
        return estado.emprestar(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean atrasar() {
        return estado.atrasar(this);
    }

    public boolean perder() {
        return estado.perder(this);
    }

    public boolean disponibilizar() {
        return estado.disponibilizar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LivroEstado getEstado() {
        return estado;
    }

}