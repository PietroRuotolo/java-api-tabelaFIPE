package fiap.com.fipeapi.model;

import fiap.com.fipeapi.service.IDataPrinter;

import java.util.Comparator;
import java.util.List;

public record BrandResponse(List<Brand> brands) implements IDataPrinter {
    @Override
    public void printData(){
        System.out.println("CÓDIGO                   NOME");
        brands.stream().sorted(Comparator.comparing(Brand::name))
                .forEach(b -> System.out.printf("%s----------------------%s\n", b.code(), b.name()));;
    }
}
