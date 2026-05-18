package fiap.com.fipeapi.main;

import fiap.com.fipeapi.model.Brands;
import fiap.com.fipeapi.service.ApiConsume;
import fiap.com.fipeapi.service.DataConverter;
import fiap.com.fipeapi.service.FipeService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Main {

    private Scanner scanner = new Scanner(System.in);
    private final String ADDRESS = "https://parallelum.com.br/fipe/api/v1/%s/marcas";
    private final FipeService service;
    private ApiConsume apiConsume = new ApiConsume();
    private DataConverter converter = new DataConverter();
    ///marcas/%s/modelos/%s/anos/%s/";

    public Main(FipeService service){
        this.service = service;
    }

    public void menu(){
        System.out.println("\nSEJA BEM VINDO AO CONSULTOR DA TABELA FIPE");
        System.out.println("------------------------------------------");
        System.out.println("Escolha o tipo de veículo:" +
                "\nCarros" +
                "\nMotos" +
                "\nCaminhões");
        String type = scanner.nextLine().toLowerCase();
        if(type.contains("car")){
            type = "carros";
        }else if(type.contains("mo")){
            type = "motos";
        }else{
            type = "caminhoes";
        }

        String json = apiConsume.getData(ADDRESS.formatted(type));
        List<Brands> brands = converter.convert(json, Brands.class);

        System.out.println(brands);
    }
}
