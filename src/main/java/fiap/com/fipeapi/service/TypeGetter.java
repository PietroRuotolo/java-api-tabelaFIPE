package fiap.com.fipeapi.service;

import fiap.com.fipeapi.model.Brands;

public class TypeGetter {
    public String getType(String typeInput){
        String vehicleType = "";
        if(typeInput.contains("car")){
            vehicleType = "carros";
        }else if (typeInput.contains("mo")){
            vehicleType = "motos";
        }else if(typeInput.contains("cam")){
            vehicleType = "caminhoes";
        }else{
            System.out.println("Tipo de Veículo inválido\nTente novamente!");
        }
        return vehicleType;
    }
}
