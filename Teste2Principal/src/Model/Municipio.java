/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anibal
 */
public class Municipio {

    private int id;
    private String nome;
    private String provincia;
    private String descricao;
    private int quantRecenseados;
    private Candidato Candidato1;
    private Candidato Candidato2;
    private Candidato Candidato3;

    public Municipio() {
    }

    public Municipio(int id, String nome, String provincia, String descricao, int quantRecenseados, Candidato Candidato1, Candidato Candidato2, Candidato Candidato3) {
        this.id = id;
        this.nome = nome;
        this.provincia = provincia;
        this.descricao = descricao;
        this.quantRecenseados = quantRecenseados;
        this.Candidato1 = Candidato1;
        this.Candidato2 = Candidato2;
        this.Candidato3 = Candidato3;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantRecenseados() {
        return quantRecenseados;
    }

    public void setQuantRecenseados(int quantRecenseados) {
        this.quantRecenseados = quantRecenseados;
    }

    public Candidato getCandidato1() {
        return Candidato1;
    }

    public void setCandidato1(Candidato Candidato1) {
        this.Candidato1 = Candidato1;
    }

    public Candidato getCandidato2() {
        return Candidato2;
    }

    public void setCandidato2(Candidato Candidato2) {
        this.Candidato2 = Candidato2;
    }

    public Candidato getCandidato3() {
        return Candidato3;
    }

    public void setCandidato3(Candidato Candidato3) {
        this.Candidato3 = Candidato3;
    }

    @Override
    public String toString() {
        return getNome();

    }

    

  
    

}
