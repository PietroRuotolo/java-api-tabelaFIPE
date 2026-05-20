package fiap.com.fipeapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Brand(
        @JsonAlias("codigo")
        String code,
        @JsonAlias("nome")
        String name){
}
