package tech.x17.blog.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

/**
 * @author chent3
 * @date 2024/6/27
 */


@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(BlogApplication.class, args);

        TimeUnit.MINUTES.sleep(10);
    }

}
