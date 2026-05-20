package fiap.com.fipeapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record VehicleModel(
        @JsonAlias("codigo")
        Integer code,
        @JsonAlias("nome")
        String name) {

    @Override
    public String toString() {
        return "%nModelo: %s%nCódigo: %s%n".formatted(name, code);
    }
}
