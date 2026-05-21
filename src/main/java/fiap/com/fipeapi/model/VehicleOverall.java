package fiap.com.fipeapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fiap.com.fipeapi.service.IDataPrinter;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VehicleOverall(
        @JsonAlias("Valor")
        String value,
        @JsonAlias("Marca")
        String brand,
        @JsonAlias("Modelo")
        String model,
        @JsonAlias("AnoModelo")
        Integer year,
        @JsonAlias("Combustivel")
        String fuel,
        @JsonAlias("CodigoFipe")
        String fipeCode) implements IDataPrinter {

    @Override
    public void printData() {
        System.out.println("INFORMAÇÕES GERAIS DO VEÍCULO:\n");
        System.out.printf("Marca: %s%nModelo: %s%nAno do Modelo: %s%nTipo de Combustível: %s%nValor na Tabela FIPE: %s%nCódigo na Tabela FIPE: %s",
                brand, model, year, fuel, value, fipeCode);
    }
}
