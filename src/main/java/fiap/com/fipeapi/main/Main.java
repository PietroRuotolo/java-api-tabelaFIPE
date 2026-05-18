package fiap.com.fipeapi.main;
import fiap.com.fipeapi.model.Brand;
import fiap.com.fipeapi.service.ApiConsume;
import fiap.com.fipeapi.service.DataConverter;
import fiap.com.fipeapi.service.FipeService;
import fiap.com.fipeapi.service.TypeGetter;
import fiap.com.fipeapi.service.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Main {

    private Scanner scanner = new Scanner(System.in);
    private final FipeService service;
    private ApiConsume apiConsume = new ApiConsume();
    private DataConverter converter = new DataConverter();
    private TypeGetter typeGetter = new TypeGetter();
    private UrlGetter urlGetter = new UrlGetter();

    public Main(FipeService service){this.service = service;}

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

        while (vehicleType.isEmpty()){
            vehicleType = typeGetter.getType(scanner.nextLine().toLowerCase());
        }

        String json1 = apiConsume.getData(urlGetter.getURL(vehicleType));
        List<Brand> brands = converter.convert(json1, Brand.class);
        System.out.println(brands);

        System.out.print("\nSelecione a marca do carro [INSIRA O CÓDIGO]: ");
        String brandInput = scanner.nextLine().toLowerCase();

//        String json2 = apiConsume.getData(ADDRESS.formatted())
    }
}
