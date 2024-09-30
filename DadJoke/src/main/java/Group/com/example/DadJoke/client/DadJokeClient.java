package Group.com.example.DadJoke.client;

import Group.com.example.DadJoke.model.DajokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {

    // GET https://iconhazdadjoke.com/
    @GetExchange("/")
    DajokeResponse random();

}
