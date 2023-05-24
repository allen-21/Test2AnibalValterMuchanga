/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author anibal
 */
public class Voto {
    
    private int id;
    private Municipio idMunicipio;
     private Candidato idCandidato;
     private Date data;
     private boolean isValid;
     private boolean isBranco;
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }
     
     


    public Date getData() {
        return data;
    }
    

    public String getDataString(){
        SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
        return fd.format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public boolean isIsBranco() {
        return isBranco;
    }

    public void setIsBranco(boolean isBranco) {
        this.isBranco = isBranco;
    }
     
     
     
    
    
}
