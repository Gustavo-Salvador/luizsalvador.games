package application.models; //definição do pacote, conjunto de arquivos que podem ser acessados entre si, como uma espécie de pasta

import javax.persistence.Entity; //importação da anotação de entidade, para criação de entidades
import javax.persistence.GeneratedValue; //importação da anotação GeneratedValue para gerar valores
import javax.persistence.GenerationType; //importação da classe GenerationType para definir o padrão dos valores gerados
import javax.persistence.Id; //importação da anotação id para criação de uma chave primária
import javax.persistence.Table; //importação da anotação table para criação de tabelas
import javax.persistence.OneToMany; //importação da anotação OneToMany para relacionar tabelas de um pra muitos

import java.util.Set; //importação da classe Set para definição de tipos
import java.util.HashSet; //importação da classe HashSet para criação e manipulação de HashSets

@Entity //anotação para criação de uma entidade

@Table(name="generos") //anotação para definição do tipo da entidade para tabela com o nome generos

public class Genero { //criação da classe genero, entidade do tipo tabela
    @Id //anotação para criação da chave primária 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //anotação para definir automaticamente o valor da chave primária
    private int id; //criação do atributo privado id do tipo int, chave primária da tabela generos, com valor gerado automaticamente
    private String nome; //criação do atributo privado nome do tipo String, campo da tabela generos
    
    public int getId() { //criação do método getId com retorno
        return id; //retorna o respectivo id da classe
    } //fechamento do método
    public void setId(int id) { //criação do método setId sem retorno, com a necessidade do argumento id do tipo inteiro
        this.id = id; //define o respectivo id da classe para o valor fonecido
    } //fechamento do método
    public String getNome() { //criação do método getNome com retorno
        return nome; //retorna o respectivo nome da classe
    } //fechamento do método
    public void setNome(String nome) { //criação do método setNome sem retorno, com a necessidade do argumento nome do tipo String
        this.nome = nome; //define o respectivo nome da classe para o valor fonecido
    } //fechamento do método

    @OneToMany(mappedBy = "genero") //anotação para criação da relação um para muitos com o nome de gener
    private Set<Jogo> jogos = new HashSet<>(); //criação do atributo privado jogos do tipo HashSet, campo relacionado a outra tabela com a relação um para muitos 

    public Set<Jogo> getJogos() { //criação do método getJogos com retorno
        return jogos; //retorna o respectivo jogos da classe
    } //fechamento do método
    public void setJogos(Set<Jogo> jogos) { //criação do método setJogos sem retorno, com a necessidade do argumento Jogos do tipo Set<Jogo>
        this.jogos = jogos; //define o respectivo jogos da classe para o valor fonecido
    } //fechamento do método

} //fechamento da classe Genero