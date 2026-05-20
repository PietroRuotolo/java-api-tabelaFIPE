package fiap.com.fipeapi.service;

import java.util.List;

public interface IDataConverter {

    <T> List<T> convertAll(String json, Class<T> tClass);

    <T> T convert(String json, Class<T> tClass);
}
