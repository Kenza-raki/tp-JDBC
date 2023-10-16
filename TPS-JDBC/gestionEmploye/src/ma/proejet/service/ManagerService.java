/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.proejet.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.proejet.beans.Manager;
import ma.proejet.dao.IDao;

/**
 *
 * @author HP
 */
public class ManagerService implements IDao<Manager>{

    @Override
    public boolean create(Manager o) {
       try {
    String req = "insert into manager (nom, prenom) values (?, ?)";
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
    public boolean update(Manager o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Manager o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Manager findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Manager> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
