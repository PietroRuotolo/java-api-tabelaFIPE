package fiap.com.fipeapi.main;

import fiap.com.fipeapi.model.Brands;
import fiap.com.fipeapi.service.ApiConsume;
import fiap.com.fipeapi.service.DataConverter;
import fiap.com.fipeapi.service.FipeService;
import fiap.com.fipeapi.service.TypeGetter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class Main {

    private Scanner scanner = new Scanner(System.in);
    private final String ADDRESS_TYPE = "https://parallelum.com.br/fipe/api/v1/%s/marcas";
    private final String ADDRESS_BRAND = "https://parallelum.com.br/fipe/api/v1/%s/marcas/%s/modelos";
    private final String ADDRESS_YEAR = "https://parallelum.com.br/fipe/api/v1/%s/marcas/%s/modelos/%s/anos/%s/";
    private final FipeService service;
    private ApiConsume apiConsume = new ApiConsume();
    private DataConverter converter = new DataConverter();
    private TypeGetter typeGetter = new TypeGetter();

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

        String vehicleType = "";
        while (vehicleType == ""){
            vehicleType = typeGetter.getType(scanner.nextLine().toLowerCase());
        }

        String json1 = apiConsume.getData(ADDRESS_TYPE.formatted(vehicleType));
        List<Brands> brands = converter.convert(json1, Brands.class);
        System.out.println(brands);

        System.out.print("\nSelecione a marca do carro [INSIRA O CÓDIGO]: ");
        String brandInput = scanner.nextLine().toLowerCase();

//        String json2 = apiConsume.getData(ADDRESS.formatted())
    }
}
