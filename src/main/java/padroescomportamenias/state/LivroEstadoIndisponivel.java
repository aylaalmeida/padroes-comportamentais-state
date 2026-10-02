package padroescomportamentais.state;

public class LivroEstadoIndisponivel extends LivroEstado {

    private LivroEstadoIndisponivel() {};
    private static LivroEstadoIndisponivel instance = new LivroEstadoIndisponivel();

    public static LivroEstadoIndisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Indisponível";
    }

    public boolean disponibilizar(Livro livro) {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        return true;
    }

}