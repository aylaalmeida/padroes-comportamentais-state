package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro();
    }

    // Livro disponível

    @Test
    public void deveReservarLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertTrue(livro.reservar());
        assertEquals(LivroEstadoReservado.getInstance(), livro.getEstado());
    }

    @Test
    public void deveEmprestarLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertTrue(livro.emprestar());
        assertEquals(LivroEstadoEmprestado.getInstance(), livro.getEstado());
    }

    @Test
    public void naoDeveDevolverLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertFalse(livro.devolver());
    }

    @Test
    public void naoDeveAtrasarLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertFalse(livro.atrasar());
    }

    @Test
    public void devePerderLivroDisponivel() {
        livro.setEstado(LivroEstadoDisponivel.getInstance());
        assertTrue(livro.perder());
        assertEquals(LivroEstadoPerdido.getInstance(), livro.getEstado());
    }

    // Livro reservado

    @Test
    public void naoDeveReservarLivroReservado() {
        livro.setEstado(LivroEstadoReservado.getInstance());
        assertFalse(livro.reservar());
    }

    @Test
    public void deveEmprestarLivroReservado() {
        livro.setEstado(LivroEstadoReservado.getInstance());
        assertTrue(livro.emprestar());
        assertEquals(LivroEstadoEmprestado.getInstance(), livro.getEstado());
    }

    @Test
    public void naoDeveDevolverLivroReservado() {
        livro.setEstado(LivroEstadoReservado.getInstance());
        assertFalse(livro.devolver());
    }

    @Test
    public void naoDeveAtrasarLivroReservado() {
        livro.setEstado(LivroEstadoReservado.getInstance());
        assertFalse(livro.atrasar());
    }

    @Test
    public void devePerderLivroReservado() {
        livro.setEstado(LivroEstadoReservado.getInstance());
        assertTrue(livro.perder());
        assertEquals(LivroEstadoPerdido.getInstance(), livro.getEstado());
    }

    // Livro emprestado

    @Test
    public void naoDeveReservarLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.reservar());
    }

    @Test
    public void naoDeveEmprestarLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.emprestar());
    }

    @Test
    public void deveDevolverLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertTrue(livro.devolver());
        assertEquals(LivroEstadoDisponivel.getInstance(), livro.getEstado());
    }

    @Test
    public void deveAtrasarLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertTrue(livro.atrasar());
        assertEquals(LivroEstadoAtrasado.getInstance(), livro.getEstado());
    }

    @Test
    public void devePerderLivroEmprestado() {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertTrue(livro.perder());
        assertEquals(LivroEstadoPerdido.getInstance(), livro.getEstado());
    }

    // Livro atrasado

    @Test
    public void naoDeveReservarLivroAtrasado() {
        livro.setEstado(LivroEstadoAtrasado.getInstance());
        assertFalse(livro.reservar());
    }

    @Test
    public void naoDeveEmprestarLivroAtrasado() {
        livro.setEstado(LivroEstadoAtrasado.getInstance());
        assertFalse(livro.emprestar());
    }

    @Test
    public void deveDevolverLivroAtrasado() {
        livro.setEstado(LivroEstadoAtrasado.getInstance());
        assertTrue(livro.devolver());
        assertEquals(LivroEstadoDisponivel.getInstance(), livro.getEstado());
    }

    @Test
    public void naoDeveAtrasarLivroAtrasado() {
        livro.setEstado(LivroEstadoAtrasado.getInstance());
        assertFalse(livro.atrasar());
    }

    @Test
    public void devePerderLivroAtrasado() {
        livro.setEstado(LivroEstadoAtrasado.getInstance());
        assertTrue(livro.perder());
        assertEquals(LivroEstadoPerdido.getInstance(), livro.getEstado());
    }

    // Livro perdido

    @Test
    public void naoDeveReservarLivroPerdido() {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        assertFalse(livro.reservar());
    }

    @Test
    public void naoDeveEmprestarLivroPerdido() {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        assertFalse(livro.emprestar());
    }

    @Test
    public void naoDeveDevolverLivroPerdido() {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        assertFalse(livro.devolver());
    }

    @Test
    public void naoDeveAtrasarLivroPerdido() {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        assertFalse(livro.atrasar());
    }

    @Test
    public void naoDevePerderLivroPerdido() {
        livro.setEstado(LivroEstadoPerdido.getInstance());
        assertFalse(livro.perder());
    }

}