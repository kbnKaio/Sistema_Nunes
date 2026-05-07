/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Kbn_Fornecedores;
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
public class DaoKbnFornecedores extends DaoKbnAbstract {

    @Override
    public void insert(Object object) {
        Kbn_Fornecedores kbn_Fornecedores = (Kbn_Fornecedores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_kaio_nunes";
            user = "kaio_Nunes";
            password = "kaio_Nunes";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into kbn_Fornecedores values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, kbn_Fornecedores.getKbnIdFornecedor());
            pst.setString(2, kbn_Fornecedores.getKbnEmail());
            pst.setString(3, kbn_Fornecedores.getKbnCnpj());
            pst.setString(4, kbn_Fornecedores.getKbnTelefone());
            pst.setString(5, kbn_Fornecedores.getKbnCep());
            pst.setString(6, kbn_Fornecedores.getKbnEndeco());
            pst.setString(7, kbn_Fornecedores.getKbnNumero());
            pst.setString(8, kbn_Fornecedores.getKbnBairro());
            pst.setString(9, kbn_Fornecedores.getKbnCidade());
            pst.setString(10, kbn_Fornecedores.getKbnEstado());
            pst.setDate(11, null);
            pst.setString(12, kbn_Fornecedores.getKbnAtivo());
            pst.setString(12, kbn_Fornecedores.getKbnResponsavel());
            pst.setString(14, kbn_Fornecedores.getKbnWhatsapp());
            pst.setDouble(15, kbn_Fornecedores.getKbnDescontos());

            pst.executeUpdate();
            cnt.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoKbnFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoKbnFornecedores.class.getName()).log(Level.SEVERE, null, ex);
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
        return null;
    }

    @Override
    public Object listALL() {
        return null;
    }
}
