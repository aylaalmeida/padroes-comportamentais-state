package padroescomportamentais.state;

public class LivroEstadoAtrasado extends LivroEstado {

    private LivroEstadoAtrasado() {};
    private static LivroEstadoAtrasado instance = new LivroEstadoAtrasado();

    public static LivroEstadoAtrasado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atrasado";
    }

    public boolean devolver(Livro livro) {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        return true;
    }

    public boolean perder(Livro livro) {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        return true;
    }

}