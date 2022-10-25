package it.fi.bruni;

import java.sql.Date;

public class Alunno {
    private Date date;
    private String nome;
    private String cognome;

    public Alunno(Date date, String nome, String cognome) {
        this.date = date;
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public Alunno() {
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Alunno [date=" + date + ", nome=" + nome + ", cognome=" + cognome + "]";
    }
    
}
