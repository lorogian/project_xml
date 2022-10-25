package it.fi.bruni;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
       
        ObjectMapper objectMapper = new ObjectMapper();
        Classe car = objectMapper.readValue(new File("target/car.json"), Classe.class);
        System.out.println(car);
        
    }
}
