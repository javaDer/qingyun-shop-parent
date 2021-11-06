package com.qingyun.shop.user.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 类名称：Swagger2Config<br>
 * 类描述：Swagger配置 <br>
 *
 * @author zhaofa
 * @date 创建时间：2019-09-22 13:41<br>
 * @version 1.0.0
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qingyun.shop.user.server.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description("微微一笑接口测试文档")
                .contact(new Contact("哈哈哈", "https://github.com.lenve", "1916008067@qq.com"))
                .version("v1.1.0")
                .title("API测试文档")
                .build();
    }

}
