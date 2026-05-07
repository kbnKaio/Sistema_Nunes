/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Kbn_Clientes;
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
public class DaoKbnClientes extends DaoKbnAbstract {

    @Override
    public void insert(Object object) {
        Kbn_Clientes kbn_Clientes = (Kbn_Clientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_kaio_nunes";
            user = "kaio_Nunes";
            password = "kaio_Nunes";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into kbn_Clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, kbn_Clientes.getKbnIdClientes());
            pst.setString(2, kbn_Clientes.getKbnNome());
            pst.setString(3, kbn_Clientes.getKbnCpf());
            pst.setString(4, kbn_Clientes.getKbnEmail());
            pst.setString(5, kbn_Clientes.getKbnTelefone());
            pst.setString(6, kbn_Clientes.getKbnCep());
            pst.setString(7, kbn_Clientes.getKbnEndereco());
            pst.setString(8, kbn_Clientes.getKbnNumero());
            pst.setString(9, kbn_Clientes.getKbnBairro());
            pst.setString(10, kbn_Clientes.getKbnCidade());
            pst.setString(11, kbn_Clientes.getKbnEstado());
            pst.setDate(12, null);
            pst.setString(13, kbn_Clientes.getKbnSexo());
            pst.setDate(14,null);
            pst.setString(15, kbn_Clientes.getKbnAtivo());

            pst.executeUpdate();
            cnt.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoKbnClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoKbnClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delet(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object listALL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
