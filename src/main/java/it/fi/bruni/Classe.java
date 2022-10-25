package it.fi.bruni;

import java.util.ArrayList;
public class Classe {
    private int num ;
    private String sez;
   private String aula;
   ArrayList<Alunno> cars = new ArrayList<Alunno>();
   








public Classe(int num, String sez, String aula, ArrayList<Alunno> cars) {
    this.num = num;
    this.sez = sez;
    this.aula = aula;
    this.cars = cars;
}

public Classe() {
}

public int getNum() {
    return num;
}
public void setNum(int num) {
    this.num = num;
}
public String getSez() {
    return sez;
}
public void setSez(String sez) {
    this.sez = sez;
}
public String getAula() {
    return aula;
}
public void setAula(String aula) {
    this.aula = aula;
}
public ArrayList<Alunno> getCars() {
    return cars;
}
public void setCars(ArrayList<Alunno> cars) {
    this.cars = cars;
}

@Override
public String toString() {
    return "Classe [num=" + num + ", sez=" + sez + ", aula=" + aula + ", cars=" + cars + "]";
}

}
