/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Kbn_Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u08016696180
 */
public class DaoKbnVenda extends DaoKbnAbstract {

    /**
     *
     * @param object
     */
    @Override
    public void insert(Object object) {
        Kbn_Venda kbn_Venda = (Kbn_Venda) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_kaio_nunes";
            user = "kaio_Nunes";
            password = "kaio_Nunes";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into kbn_Venda values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.executeUpdate();
            pst.setInt(1, kbn_Venda.getKbnIdVenda());
            pst.setInt(2, kbn_Venda.getKbnIdCliente()); //Kbn
            pst.setInt(3, kbn_Venda.getKbnIdAnimal());
            pst.setDouble(4, kbn_Venda.getKbnValorTotal());
            pst.setDate(5, null);
            pst.setString(6, kbn_Venda.getKbnFormaPagamento());
            pst.setString(7, kbn_Venda.getKbnStatus());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoKbnVenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoKbnVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
    }

    @Override
    public void delet(Object object) {

    }

    @Override
    public Object list(int id) {

        return null;
    }

    @Override
    public Object listALL() {
        return null;
    }

}
