package it.rizzoli.ifts_2024_03_15_cookideaspinoff_inserimentoricettedb;

public class Ingrediente {

    private Integer id;
    private String nome_ingrediente;
    private String categoria_ingrediente;

    public Ingrediente(Integer id, String nome_ingrediente, String categoria_ingrediente) {
        this.id = id;
        this.nome_ingrediente = nome_ingrediente;
        this.categoria_ingrediente = categoria_ingrediente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_ingrediente() {
        return nome_ingrediente;
    }

    public void setNome_ingrediente(String nome_ingrediente) {
        this.nome_ingrediente = nome_ingrediente;
    }

    public String getCategoria_ingrediente() {
        return categoria_ingrediente;
    }

    public void setCategoria_ingrediente(String categoria_ingrediente) {
        this.categoria_ingrediente = categoria_ingrediente;
    }
}
