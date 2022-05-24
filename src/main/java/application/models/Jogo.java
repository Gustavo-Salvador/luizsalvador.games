package application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name="jogos")
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    @ManyToMany(mappedBy = "id_genero")
    private Genero genero;
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public void setJogos(Set<Jogo> jogos) {
        this.jogos = jogos;
    }

    @ManyToMany
    @JoinTable(
        name = "jogos_possuem_plataforma",
        joinColumns = @JoinColumn(name = "jogos_id"),
        inverseJoinColumns = @JoinColumn(name = "plataformas_id")
    )

    private Set<Jogo> jogos = new HashSet<>();
    
    public Set<Jogo> getJogos() {
        return jogos;
    }
    public Genero getGenero() {
        return genero;
    }
    

}