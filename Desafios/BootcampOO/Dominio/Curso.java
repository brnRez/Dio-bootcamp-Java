package Desafios.BootcampOO.Dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", getCargaHoraria()=" + getCargaHoraria() + ", getTitulo()="
                + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
    }

    
}
