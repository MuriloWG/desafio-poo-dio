package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }




    public void inscreverBootcamp(Bootcamp bootcamp) {
       this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir() {
        Conteudo conteudo = this.conteudosInscritos.iterator().next();
        this.conteudosInscritos.remove(conteudo);
        this.conteudosConcluidos.add(conteudo);
    }
    public void calcularTotalXp() {
        this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome != null ? nome.equals(dev.nome) : dev.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }

}
