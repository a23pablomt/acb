package com.example;

import java.io.Serializable;

@SuppressWarnings("hiding")
public interface Comparable<Equipo> extends Serializable {
    public int compareTo(Equipo equipo);

    @Override  
    public boolean equals(Object obj){
        return this.nombre.equals(((Equipo)obj).getNombre());
    }
}
