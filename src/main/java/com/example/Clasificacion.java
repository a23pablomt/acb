package com.example;

import java.io.Serializable;
import java.util.Set;

public class Clasificacion implements Serializable {
    private Set<Equipo> equipos;
    private String competicion;

    public boolean addEquipo(Equipo equipo) {
        return equipos.add(equipo);
    }

    public boolean removeEquipo(Equipo equipo) {
        return equipos.remove(equipo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(competicion);
        sb.append("\n");
        for (Equipo equipo : equipos) {
            sb.append(equipo.toString()+ " "+ equipo.getDiferenciaDePuntos());
            sb.append("\n");
        }
        return sb.toString();
    }
}
