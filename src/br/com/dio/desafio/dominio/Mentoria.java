package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Mentoria extends Conteudo {

    private String data;

    public Mentoria() {
    }

    public String getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
