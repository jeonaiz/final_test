package kg.megacom.finally_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("kg.megacom.finally_test.microservices")
public class FinallyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinallyTestApplication.class, args);
    }

}
