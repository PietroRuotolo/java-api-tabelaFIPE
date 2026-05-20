package fiap.com.fipeapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fiap.com.fipeapi.service.IDataPrinter;

import java.util.Comparator;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelResponse(List<VehicleModel> modelos) implements IDataPrinter {
    @Override
    public void printData() {
        System.out.println("CÓDIGO                   MODELO");
        modelos.stream().sorted(Comparator.comparing(VehicleModel::name))
                .forEach(m -> System.out.printf("%d-------------------%s\n", m.code(), m.name()));
    }
}
