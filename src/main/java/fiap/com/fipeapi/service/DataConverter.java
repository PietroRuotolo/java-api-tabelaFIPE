package fiap.com.fipeapi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class DataConverter implements IDataConverter{

    ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> List<T> convert(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json,
                    mapper.getTypeFactory()
                            .constructCollectionType(List.class, tClass));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
