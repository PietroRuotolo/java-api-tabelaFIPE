package fiap.com.fipeapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Brands(
        @JsonAlias("codigo")
        String code,
        @JsonAlias("nome")
        String name){

    @Override
    public String toString() {
        return "%nMarca: %s%nCódigo: %s%n".formatted(name, code);
    }
}
