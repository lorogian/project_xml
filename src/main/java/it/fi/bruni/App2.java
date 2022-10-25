package it.fi.bruni;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        
        
        File file = new File("Classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Classe value = xmlMapper.readValue(file, Classe.class);
        System.out.println(value);
        
    }
}
