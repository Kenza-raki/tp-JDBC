/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.proejet.service;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.proejet.beans.Developpeur;
import ma.proejet.connection.Connection;
import ma.proejet.dao.IDao;

/**
 *
 * @author HP
 */
public class DeveloppeurService implements IDao<Developpeur>{

    @Override
    public boolean create(Developpeur o) {
       try {
    String req = "insert into developpeur (nom, prenom) values (?, ?)";
           com.mysql.jdbc.Connection connection = ma.proejet.connection.Connection.getConnection(); // Obtain a valid JDBC connection from your custom Connection class

    PreparedStatement ps; 
           ps = connection.prepareStatement(req);

    ps.setString(1, o.getNom());
    ps.setDouble(2, o.getSalaire()); // Assuming that prenom is a String, use setString instead of setDouble for non-numeric values

    if (ps.executeUpdate() == 1) {
        return true;
    }
} catch (SQLException ex) {
    Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
}

return false;
    }

    

    @Override
    public boolean update(Developpeur o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    @Override
    public boolean delete(Developpeur o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Developpeur findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Developpeur> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
