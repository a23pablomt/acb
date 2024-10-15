package com.example;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class ClasificacionDAO implements DAO<Clasificacion, String> {
    
    public static final String DEFAULT_PATH = "src/main/resources/LigaACB.dat";

    final Path path = new File(DEFAULT_PATH).toPath();

    

    @Override
    public Clasificacion get(String id) {
        return null;
    }

    @Override
    public List<Clasificacion> getAll() {
        return null;
    }

    public boolean save(Clasificacion clasificacion) {
        EquipoFileDAO equipoFileDAO = new EquipoFileDAO(path + clasificacion.getCompeticion() + ".dat");
        clasificacion.getEquipos().forEach(equipoFileDAO::save);
        return true;
    }

    @Override
    public boolean delete(Clasificacion obx) {
        return false;
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public void update(Clasificacion obx) {
        
    }
    
}
