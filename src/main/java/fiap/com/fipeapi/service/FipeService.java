package fiap.com.fipeapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FipeService {
    @Value("${api.key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
