package it.fi.bruni;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class App 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        System.out.println( "Hello World!" );
        ArrayList <Alunno> cars = new ArrayList<Alunno>();
        Classe s = new Classe(5,"BIA","04-TC", cars);
        
        Alunno a1 = new Alunno(new Date(21,9,2044),"lorenzo","bruni");
        Alunno a2 = new Alunno(new Date(21,8,2044),"Leonardo","sus");
        Alunno a3 = new Alunno(new Date(22,9,2044),"Mario","sas");
        Alunno a4 = new Alunno(new Date(21,9,2033),"Davide","amuus");

        cars.add(a1);
        cars.add(a2);
        cars.add(a3);
        cars.add(a4);

    
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File("Classe.xml"), s);
           
        
        
    }
}
