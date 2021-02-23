package cn.jimoos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Api APP
 *
 * @author :keepcleargas
 * @date :2021-02-23 16:53.
 */
@SpringBootApplication(scanBasePackages = {"cn.jimoos"})
public class ApiApp {
    public static void main(String[] args) {
        SpringApplication.run(ApiApp.class, args);
    }
}
