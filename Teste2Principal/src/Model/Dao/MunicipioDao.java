/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Model.Candidato;
import Model.Municipio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anibal
 */
public class MunicipioDao {
    
    public static void salvar(Municipio municipio) throws Exception {
        
        Connection cn = Conexao.conectar();
        PreparedStatement ps = null;
        String sql = "INSERT INTO municipio(id, nome, provincia, descricao, quantRecenseados, Candidato1, Candidato2, Candidato3)"
                + "VALUES(?,?,?,?,?,?,?,?);";
        
        try {
            
            ResultSet result = null;
            ps = cn.prepareStatement(sql);
            ps.setInt(1, municipio.getId());
            ps.setString(2, municipio.getNome());
            ps.setString(3, municipio.getProvincia());
            ps.setString(4, municipio.getDescricao());
            ps.setInt(5, municipio.getQuantRecenseados());
            ps.setInt(6, municipio.getCandidato1().getId());
            ps.setInt(7, municipio.getCandidato2().getId());
            ps.setInt(8, municipio.getCandidato3().getId());
            
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
    
    public List<Municipio> read() throws Exception {
        
        Connection cn = Conexao.conectar();
        PreparedStatement ps = null;
        ResultSet result = null;
        
        String sql = "SELECT id, nome, provincia, descricao, quantRecenseados, Candidato1, Candidato2, Candidato3 from municipio;";
        List<Municipio> listaMunicipio = null;
        
        try {
            
            ps = cn.prepareStatement(sql);
            result = ps.executeQuery();
            
            while (result.next()) {
                if (listaMunicipio == null) {
                    listaMunicipio = new ArrayList<Municipio>();
                }
                Municipio mun = new Municipio();
                mun.setId(result.getInt("id"));
                mun.setNome(result.getString("nome"));
                mun.setProvincia(result.getString("provincia"));
                mun.setDescricao(result.getString("descricao"));
                mun.setQuantRecenseados(result.getInt("quantRecenseados"));
                mun.setCandidato1(CandidatoDao.obter(result.getInt("Candidato1")));
                mun.setCandidato2(CandidatoDao.obter(result.getInt("Candidato2")));
                mun.setCandidato3(CandidatoDao.obter(result.getInt("Candidato3")));
                
                listaMunicipio.add(mun);
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
        return listaMunicipio;
        
    }
    
}
