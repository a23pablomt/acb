package com.example;

import java.io.Serializable;

@SuppressWarnings("hiding")
public interface Comparable<Equipo> extends Serializable {
    public int compareTo(Equipo equipo);
}
