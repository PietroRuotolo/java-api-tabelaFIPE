package fiap.com.fipeapi.main;
import fiap.com.fipeapi.model.*;
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

        while (vehicleType.isEmpty()){
            vehicleType = typeGetter.getType(scanner.nextLine().toLowerCase());
        }

        String json1 = apiConsume.getData(urlGetter.getURL(vehicleType));
        List<Brand> brands = converter.convertAll(json1, Brand.class);
        BrandResponse brandData = new BrandResponse(brands);
        brandData.printData();

        System.out.print("\nSelecione a marca do veículo [INSIRA O CÓDIGO]: ");
        String brandInput = scanner.nextLine();

        String json2 = apiConsume.getData(urlGetter.getURl(vehicleType,brandInput));
        ModelResponse modelResponse = converter.convert(json2, ModelResponse.class);
        modelResponse.printData();

        System.out.print("\nSelecione o modelo do veículo [INSIRA O CÓDIGO]:  ");
        String modelInput = scanner.nextLine();

        String json3 = apiConsume.getData(urlGetter.getURl(vehicleType, brandInput, modelInput));
        List<VehicleYear> years = converter.convertAll(json3, VehicleYear.class);
        System.out.println(years);

    }
}
