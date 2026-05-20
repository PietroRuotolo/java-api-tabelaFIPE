package fiap.com.fipeapi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class DataConverter implements IDataConverter{

    ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> List<T> convertAll(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json,
                    mapper.getTypeFactory()
                            .constructCollectionType(List.class, tClass));
        } catch (JsonProcessingException e) {
            System.out.println("Não foi possível converter...");
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T convert(String json, Class<T> tClass) {
        try{
            return mapper.readValue(json, tClass);
        }catch (JsonProcessingException e){
            System.out.println("Não foi possível converter...");
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
}
