package fiap.com.fipeapi.model;

import java.util.List;

public record ModelResponse(List<VehicleModel> modelos, List<VehicleYear> anos) {
}
