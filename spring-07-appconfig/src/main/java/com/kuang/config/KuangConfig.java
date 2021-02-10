package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*这个也会被spring容器托管，注册到容器中，因为它本来就是一个@Component
* @Configuration代表这是一个配置类，就和我们之前看的beans.xml
* */
@Configuration
@ComponentScan("com.kuang.pojo")
@Import(KuangConfig2.class)
public class KuangConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //方法名就相当于bean标签中的id
    //方法返回值相当于bean标签中的class
    @Bean
    public User getUser() {
        return new User();  //就是返回要注入到bean的对象
    }
}
