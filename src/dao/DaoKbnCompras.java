/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Kbn_Compras;
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
public class DaoKbnCompras extends DaoKbnAbstract {

    /**
     *
     * @param object
     */
    @Override
    public void insert(Object object) {
        Kbn_Compras kbn_Compras = (Kbn_Compras) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_kaio_nunes";
            user = "kaio_Nunes";
            password = "kaio_Nunes";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into kbn_Compras values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.executeUpdate();
            pst.setInt(1, kbn_Compras.getKbnIdCompras());
            pst.setDate(2, null); //Kbn
            pst.setDouble(3, kbn_Compras.getKbnValorCompra());
            pst.setString(4, kbn_Compras.getKbnFormaDePagamento());
            pst.setString(5, kbn_Compras.getKbnStatus());
            pst.setString(6, kbn_Compras.getKbnDescricao());
            pst.setInt(7, kbn_Compras.getKbnIdFornecedor());
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoKbnCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoKbnCompras.class.getName()).log(Level.SEVERE, null, ex);
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
