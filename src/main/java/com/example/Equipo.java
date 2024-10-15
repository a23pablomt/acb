package com.example;

/**
 * Equipo
 */
public class Equipo {

    private String nombre;
    private String ciudad;
    private String estadio;
    private int victorias;
    private int derrotas;
    private int empates;
    private int partidosJugados;
    private int puntosAFavor;
    private int puntosEnContra;
    private int diferenciaDePuntos;

    public Equipo(String nombre, String ciudad, String estadio, int victorias, int derrotas, int empates, int puntosAFavor, int puntosEnContra) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.partidosJugados = victorias + derrotas + empates;
        this.puntosAFavor = puntosAFavor;
        this.puntosEnContra = puntosEnContra;
        this.diferenciaDePuntos = puntosAFavor - puntosEnContra;
    }

    public int getPuntos(){
        return puntosAFavor * 2 + empates;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getDiferenciaDePuntos() {
        return diferenciaDePuntos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getPuntosAFavor() {
        return puntosAFavor;
    }  

    public int getPuntosEnContra() {
        return puntosEnContra;
    }
}