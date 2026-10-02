package padroescomportamentais.state;

public abstract class LivroEstado {

    public abstract String getEstado();

    public boolean reservar(Livro livro) {
        return false;
    }

    public boolean emprestar(Livro livro) {
        return false;
    }

    public boolean devolver(Livro livro) {
        return false;
    }

    public boolean atrasar(Livro livro) {
        return false;
    }

    public boolean perder(Livro livro) {
        return false;
    }

    public boolean disponibilizar(Livro livro) {
        return false;
    }

}