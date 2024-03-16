package it.rizzoli.ifts_2024_03_15_cookideaspinoff_inserimentoricettedb;

import java.util.List;

public class Piatto {


    private Integer id;
    private Integer difficolta;
    private Integer tempo;
    private String nome_piatto;
    private String provenienza;
    private String portata;
    private String procedimento;
    private String image_url;
    private List<Ricettario> ricettario;

    public Piatto(Integer id, Integer difficolta, Integer tempo, String nome_piatto, String provenienza, String portata, String procedimento, String image_url, List<Ricettario> ricettario) {
        this.id = id;
        this.difficolta = difficolta;
        this.tempo = tempo;
        this.nome_piatto = nome_piatto;
        this.provenienza = provenienza;
        this.portata = portata;
        this.procedimento = procedimento;
        this.image_url = image_url;
        this.ricettario = ricettario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDifficolta() {
        return difficolta;
    }

    public void setDifficolta(Integer difficolta) {
        this.difficolta = difficolta;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public String getNome_piatto() {
        return nome_piatto;
    }

    public void setNome_piatto(String nome_piatto) {
        this.nome_piatto = nome_piatto;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    public String getPortata() {
        return portata;
    }

    public void setPortata(String portata) {
        this.portata = portata;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String image_url) {
        this.procedimento = procedimento;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

    public List<Ricettario> getRicettario() {
        return ricettario;
    }

    public void setRicettario(List<Ricettario> ricettario) {
        this.ricettario = ricettario;
    }
}
