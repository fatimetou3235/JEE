package sn.Isi.repository.ram;

import sn.Isi.domain.Categorie;
import sn.Isi.repository.CategorieRepository;
import sn.Isi.service.DatabaseConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ListBasedCategorieRepository implements CategorieRepository {
    
    public List<Categorie> PrintAllClasse(){
        DatabaseConn databaseConn = new DatabaseConn();
        Statement st;
        final Connection conx;
        conx=databaseConn.getConnection();
         List<Categorie> lClasses= new ArrayList<Categorie>();
        String sql="select * from classe";
        try {
            st=conx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Categorie cl = new Categorie();
                cl.setId(rs.getInt("id"));
                cl.setLibelle(rs.getString("libelle"));
                lClasses.add(cl); 
            }
        } catch (Exception ex) {
            System.out.println("Erreur de requette");
        }
        
        return lClasses;
    }

    public Categorie[] getAll() {
        // TODO Auto-generated method stub
        return null;
    }
}
