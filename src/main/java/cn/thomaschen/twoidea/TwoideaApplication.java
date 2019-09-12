package cn.thomaschen.twoidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwoideaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoideaApplication.class, args);
        System.out.println("启动成功！");
    }

}
