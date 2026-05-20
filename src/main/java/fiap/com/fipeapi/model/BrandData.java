package fiap.com.fipeapi.model;

import java.util.Comparator;
import java.util.List;

public record BrandData(List<Brand> brands) {
    public void printData(){
        System.out.println("CÓDIGO                   NOME");
        brands.stream().sorted(Comparator.comparing(Brand::code))
                .forEach(b -> System.out.printf("%s----------------------%s\n", b.code(), b.name()));;
    }
}
