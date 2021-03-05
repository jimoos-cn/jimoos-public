package cn.jimoos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Portal APP
 *
 * @author keepcleargas
 */
@SpringBootApplication(scanBasePackages = {"cn.jimoos"})
public class PortalApp {
    public static void main(String[] args) {
        SpringApplication.run(PortalApp.class, args);
    }
}
