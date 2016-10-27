package com.ipsos.savascilve.ptapp.Model;

/**
 * Created by savas.cilve on 26.10.2016.
 */

public class Individual {

    private String FamCode;
    private int IndCode;
    private String IndName;


    public String getFamCode() { return FamCode; }
    public void setFamCode(String famCode) { FamCode = famCode; }

    public int getIndCode() { return IndCode; }
    public void setIndCode(int indCode) { IndCode = indCode; }

    public String getIndName() { return IndName; }
    public void setIndName(String indName) { IndName = indName; }
}