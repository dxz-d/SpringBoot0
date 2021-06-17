package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/17 16:20
 */
@Configuration
public class Swagger2Config {
    @Bean
    public Docket productApi() {
        // 文档类型，不用理会，就是用SWAGGER_2
        return new Docket(DocumentationType.SWAGGER_2)
                // 接口文档信息设置，抽取到apiInfo()进行设置
                .apiInfo(apiInfo()).select()
                // Controller的扫描规则：对所有Controller生成接口文档
                .apis(RequestHandlerSelectors.any()).build();
    }

    /**
     * 接口文档信息设置
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("华信视景科技公司文档")
                .contact(new Contact("diaoxiuze", "http://localhost:5678/swagger-ui.html", "1205760997@qq.com"))
                .description("测试swagger2文档")
                .version("1.0")
                .build();
    }
}
