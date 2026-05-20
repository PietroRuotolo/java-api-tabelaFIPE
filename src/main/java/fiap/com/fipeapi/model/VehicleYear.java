package fiap.com.fipeapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record VehicleYear(
        @JsonAlias("codigo")
        String code,
        @JsonAlias("nome")
        String name) {

    @Override
    public String toString() {
        return "%nAno: %s%nCódigo: %s%n".formatted(name, code);
    }
}
