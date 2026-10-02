package padroescomportamentais.state;

public class LivroEstadoEmprestado extends LivroEstado {

    private LivroEstadoEmprestado() {};
    private static LivroEstadoEmprestado instance = new LivroEstadoEmprestado();

    public static LivroEstadoEmprestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Emprestado";
    }

    public boolean devolver(Livro livro) {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        return true;
    }

    public boolean atrasar(Livro livro) {
        livro.setEstado(LivroEstadoAtrasado.getInstance());
        return true;
    }

    public boolean perder(Livro livro) {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        return true;
    }

}