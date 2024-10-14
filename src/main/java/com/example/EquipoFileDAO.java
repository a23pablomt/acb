package com.example;

import java.nio.file.Path;
import java.util.List;

public class EquipoFileDAO implements DAO<Equipo, String> {
    
    final Path path = null;

        @Override
        public Equipo get(String id) {
            return null;
        }
    
        @Override
        public List<Equipo> getAll() {
            return null;
        }
    
        @Override
        public boolean save(Equipo obxecto) {
            return false;
        }
    
        @Override
        public boolean delete(Equipo obx) {
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
        public void update(Equipo obx) {
            
        }
    
}
