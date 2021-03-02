package sn.Babs.repository.jdbc;

import sn.Babs.domain.Classe;
import sn.Babs.repository.ClasseRepository;

public class JdbcBasedClasseRepository implements ClasseRepository {

    public Classe[] getAll() {
        return new Classe[0];
    }
    
}