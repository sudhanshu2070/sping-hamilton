package com.example.lhf1.service;
import java.util.List;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.stereotype.Service;
import com.example.lhf1.dto.ErgastResponse;
import com.example.lhf1.dto.Race;

@Service
public class ErgastService {
    private final WebClient webClient;

    public ErgastService() {
        this.webClient = WebClient.create("http://ergast.com/api/f1");
    }

    public List<Race> get2020Races() {
        ErgastResponse response = webClient.get()
                .uri("/2020.json")
                .retrieve()
                .bodyToMono(ErgastResponse.class)
                .block();
        return response.getMrData().getRaceTable().getRaces();
    }

    public Race getRaceDetails(String round) {
        ErgastResponse response = webClient.get()
                .uri("/2020/{round}/results.json", round)
                .retrieve()
                .bodyToMono(ErgastResponse.class)
                .block();
        return response.getMrData().getRaceTable().getRaces().get(0);
    }
}
