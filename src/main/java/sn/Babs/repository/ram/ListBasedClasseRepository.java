package sn.Babs.repository.ram;

import sn.Babs.domain.Classe;
import sn.Babs.repository.ClasseRepository;
import sn.Babs.service.DatabaseConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ListBasedClasseRepository implements ClasseRepository {
    
    public List<Classe> PrintAllClasse(){
        DatabaseConn databaseConn = new DatabaseConn();
        Statement st;
        final Connection conx;
        conx=databaseConn.getConnection();
         List<Classe> lClasses= new ArrayList<Classe>();
        String sql="select * from classe";
        try {
            st=conx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Classe cl = new Classe();
                cl.setId(rs.getInt("id"));
                cl.setLibelle(rs.getString("libelle"));
                lClasses.add(cl); 
            }
        } catch (Exception ex) {
            System.out.println("Erreur de requette");
        }
        
        return lClasses;
    }

    public Classe[] getAll() {
        // TODO Auto-generated method stub
        return null;
    }
}