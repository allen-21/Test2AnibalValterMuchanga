/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Model.Candidato;
import Model.Voto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anibal
 */
public class VotoDao {
     public static void salvar(Voto voto)throws Exception {

        Connection cn = Conexao.conectar();
        PreparedStatement ps = null;
        String sql = "INSERT INTO voto (id, idMunicipio, idCandidato, Datavoto, isValid, isBranco)"
                + "VALUES(?,?,?,?,?,?);";

        try {

            ResultSet result = null;
            ps = cn.prepareStatement(sql);
          ps.setInt(1, voto.getId());
          ps.setInt(2, voto.getIdMunicipio().getId());
          ps.setInt(3, voto.getIdCandidato().getId());
            java.sql.Timestamp data = new java.sql.Timestamp(voto.getData().getTime());
            ps.setTimestamp(4, data);
            ps.setBoolean(5, voto.isIsValid());
            ps.setBoolean(6, voto.isIsBranco());
        
          

            ps.execute();
        } finally {

            if (ps != null && !ps.isClosed()) {
                ps.close();
            }

            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
        }
    }
     
       public static Candidato obterVotos() throws  Exception {

        Connection cn = Conexao.conectar();
        PreparedStatement ps = null;
        ResultSet result = null;
        String sql =  "SELECT COUNT(*) AS total FROM voto";;

        try {

            ps = cn.prepareStatement(sql);

            
            result = ps.executeQuery();

            if (result.next()) {
                Voto vot = new Voto();
                 int total = result.getInt("total");
               
          
                
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
        }
        return null;
    }
}
