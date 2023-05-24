/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anibal
 */
public class CandidatoDao {

    //Registrar Candidato
    public static void salvar(Candidato candidato) throws Exception {

        Connection cn = Conexao.conectar();
        PreparedStatement ps = null;
        String sql = "INSERT INTO candidato(id, nome , bi, historico)"
                + "VALUES(?, ?, ?, ?);";

        try {

            ResultSet result = null;
            ps = cn.prepareStatement(sql);
            ps.setInt(1, candidato.getId());
            ps.setString(2, candidato.getNome());
            ps.setString(3, candidato.getBi());
            ps.setString(4, candidato.getHistorico());

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

    public List<Candidato> read() throws Exception {

Connection cn = Conexao.conectar();
        PreparedStatement ps = null;
        ResultSet result = null;

        String sql = "SELECT id, nome, bi, historico from candidato;";
        List<Candidato> listaCandidatos = null;

        try {

            ps = cn.prepareStatement(sql);
            result = ps.executeQuery();

            while (result.next()) {
                if ( listaCandidatos== null) {
                    listaCandidatos = new ArrayList<Candidato>();
                }
                Candidato can = new Candidato();
                can.setId(result.getInt("id"));
                can.setNome(result.getString("nome"));
                can.setBi(result.getString("bi"));
                 can.setHistorico(result.getString("historico"));
               
                listaCandidatos.add(can);
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
        return  listaCandidatos;


    }
    
       public static Candidato obter(int id) throws  Exception {

        Connection cn = Conexao.conectar();
        PreparedStatement ps = null;
        ResultSet result = null;
        String sql = "SELECT * FROM candidato WHERE id =?";

        try {

            ps = cn.prepareStatement(sql);

            ps.setInt(1, id);
            result = ps.executeQuery();

            if (result.next()) {
                Candidato can = new Candidato();
                can.setId(result.getInt("id"));
                can.setNome(result.getString("nome"));
                can.setBi(result.getString("bi"));
                can.setHistorico(result.getString("historico"));
          
                return can;
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
