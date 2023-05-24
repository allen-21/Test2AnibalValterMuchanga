package Controller;


import Model.Candidato;
import Model.Dao.CandidatoDao;
import Model.Dao.MunicipioDao;
import Model.Dao.VotoDao;
import Model.Municipio;
import Model.Voto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anibal
 */
public class Controller {
     public static String salvar(Candidato candidato){
        
        String resposta = null;
      
        try{
           
            CandidatoDao.salvar(candidato);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
     
     
     // Salvar Municipio
       public static String salvarMun(Municipio municipio){
        
        String resposta = null;
      
        try{
           
            MunicipioDao.salvar(municipio);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
       
            public static String salvarvoto(Voto voto){
        
        String resposta = null;
      
        try{
           
            VotoDao.salvar(voto);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
            
  
     
}
