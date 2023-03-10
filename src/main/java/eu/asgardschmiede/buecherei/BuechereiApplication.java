package eu.asgardschmiede.buecherei;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Transactional
public class BuechereiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BuechereiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
