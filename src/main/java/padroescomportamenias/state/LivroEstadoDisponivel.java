package padroescomportamentais.state;

public class LivroEstadoDisponivel extends LivroEstado {

    private LivroEstadoDisponivel() {};
    private static LivroEstadoDisponivel instance = new LivroEstadoDisponivel();

    public static LivroEstadoDisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Disponível";
    }

    public boolean reservar(Livro livro) {
        livro.setEstado(LivroEstadoReservado.getInstance());
        return true;
    }

    public boolean emprestar(Livro livro) {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        return true;
    }

    public boolean perder(Livro livro) {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        return true;
    }

}