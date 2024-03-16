package it.rizzoli.ifts_2024_03_15_cookideaspinoff_inserimentoricettedb;

public class Ricettario {

    private Integer id;
    private Integer id_piatto;
    private Integer id_ingrediente;
    private float quantita_ingrediente;
    private Ingrediente ingrediente;

    private String nome_ingrediente;


    public Ricettario(float quantita_ingrediente, String nome_ingrediente) {
        this.quantita_ingrediente = quantita_ingrediente;
        this.nome_ingrediente = nome_ingrediente;
    }


    public float getQuantita_ingrediente() {
        return quantita_ingrediente;
    }


    public String getNome_ingrediente() {
        return nome_ingrediente;
    }
}
