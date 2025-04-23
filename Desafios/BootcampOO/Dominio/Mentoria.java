package Desafios.BootcampOO.Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getData()=" + getData()
                + ", getDescricao()=" + getDescricao() + "]";
    }

    


}
