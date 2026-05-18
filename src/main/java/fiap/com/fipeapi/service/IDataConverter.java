package fiap.com.fipeapi.service;

import java.util.List;

public interface IDataConverter {

    public <T> List<T> convert(String json, Class<T> tClass);
}
