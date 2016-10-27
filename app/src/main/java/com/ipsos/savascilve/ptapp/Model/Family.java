package com.ipsos.savascilve.ptapp.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by zencifil on 11/10/2016.
 */

public class Family {

    private String FamCode;
    private String FamName;
    private Date RegDate;
    private String Sehir;
    private String Ilce;
    private String Mahalle;
    private String Cadde;
    private String Sokak;
    private String DaireNo;
    private String Binaadi;
    private String Semt;
    private String EvTel;
    private int FamActive;
    private String FldCode;
    private int VisitDate;
    private int Avp;
    private int Sp;
    private int Alkol;
    private int Harcama;
    private int Bebek;
    private int EkAlkol;
    private List<Individual> Individuals;

    public Family(String famCode, String famName, String sehir, String ilce, String mahalle, String cadde, String sokak, String daireNo) {
        FamCode = famCode;
        FamName = famName;
        Sehir = sehir;
        Ilce = ilce;
        Mahalle = mahalle;
        Cadde = cadde;
        Sokak = sokak;
        DaireNo = daireNo;
    }

    public String getFamCode() {
        return FamCode;
    }
    public void setFamCode(String famCode) {
        FamCode = famCode;
    }

    public String getFamName() {
        return FamName;
    }
    public void setFamName(String famName) {
        FamName = famName;
    }

    public Date getRegDate() {
        return RegDate;
    }
    public void setRegDate(Date regDate) {
        RegDate = regDate;
    }

    public String getSehir() { return Sehir; }
    public void setSehir(String sehir) { Sehir = sehir; }

    public String getIlce() {
        return Ilce;
    }
    public void setIlce(String ilce) {
        Ilce = ilce;
    }

    public String getMahalle() {
        return Mahalle;
    }
    public void setMahalle(String mahalle) {
        Mahalle = mahalle;
    }

    public String getCadde() {
        return Cadde;
    }
    public void setCadde(String cadde) {
        Cadde = cadde;
    }

    public String getSokak() {
        return Sokak;
    }
    public void setSokak(String sokak) {
        Sokak = sokak;
    }

    public String getDaireNo() {
        return DaireNo;
    }
    public void setDaireNo(String daireNo) {
        DaireNo = daireNo;
    }

    public String getBinaadi() {
        return Binaadi;
    }
    public void setBinaadi(String binaadi) {
        Binaadi = binaadi;
    }

    public String getSemt() {
        return Semt;
    }
    public void setSemt(String semt) {
        Semt = semt;
    }

    public String getEvTel() {
        return EvTel;
    }
    public void setEvTel(String evTel) {
        EvTel = evTel;
    }

    public int getFamActive() {
        return FamActive;
    }
    public void setFamActive(int famActive) {
        FamActive = famActive;
    }

    public String getFldCode() {
        return FldCode;
    }
    public void setFldCode(String fldCode) {
        FldCode = fldCode;
    }

    public int getVisitDate() {
        return VisitDate;
    }
    public void setVisitDate(int visitDate) {
        VisitDate = visitDate;
    }

    public int getAvp() {
        return Avp;
    }
    public void setAvp(int avp) {
        Avp = avp;
    }

    public int getSp() {
        return Sp;
    }
    public void setSp(int sp) {
        Sp = sp;
    }

    public int getAlkol() {
        return Alkol;
    }
    public void setAlkol(int alkol) {
        Alkol = alkol;
    }

    public int getHarcama() {
        return Harcama;
    }
    public void setHarcama(int harcama) {
        Harcama = harcama;
    }

    public int getBebek() {
        return Bebek;
    }
    public void setBebek(int bebek) {
        Bebek = bebek;
    }

    public int getEkAlkol() {
        return EkAlkol;
    }
    public void setEkAlkol(int ekAlkol) {
        EkAlkol = ekAlkol;
    }

    public String getAddress() {
        return Mahalle + Cadde + " Cad. " + Sokak + " Sok. No: " + DaireNo + " " + Ilce + " " + Sehir;
    }

    public List<Individual> getIndividuals() { return Individuals; }
    public void setIndividuals(List<Individual> individuals) { Individuals = individuals; }
}
