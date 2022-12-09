package tn.devops;

import com.example.devopsproject.DevOpsProjectApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class app implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(app.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}