package fiap.com.fipeapi.service;

public class UrlGetter {

    private static final String BASE_URL = "https://parallelum.com.br/fipe/api/v1";
    private static final String ADDRESS_TYPE = BASE_URL + "/%s/marcas";
    private static final String ADDRESS_BRAND = BASE_URL + "/%s/marcas/%s/modelos";
    private static final String ADDRESS_MODEL = BASE_URL + "/%s/marcas/%s/modelos/%s/anos";
    private static final String ADDRESS_YEAR = BASE_URL + "/%s/marcas/%s/modelos/%s/anos/%s/";

    public String getURL(String type){
        return String.format(ADDRESS_TYPE, type);
    }

    public String getURl(String type, String brandCode){
        return String.format(ADDRESS_BRAND, type, brandCode);
    }

    public String getURl(String type, String brandCode, String modelCode){
        return String.format(ADDRESS_MODEL, type, brandCode, modelCode);
    }

    public String getURL(String type, String brandCode, String modelCode, String yearCode){
        return String.format(ADDRESS_YEAR, type, brandCode, modelCode, yearCode);
    }
}
