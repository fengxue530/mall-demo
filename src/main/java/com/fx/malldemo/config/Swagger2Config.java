package com.fx.malldemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @auther: mabaofeng
 * @date: 2019/8/28 16:22
 * @description:
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //当前包下的controller 生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.fx.malldemo.controller"))
                //带有 api 注解的类 生成接口文档
               /* .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))*/
                //带有 ApiOperation 注解的 方法 生成文档
            /*    .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))*/
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SwaggerUI演示")
                .description("mall-tiny")
                .contact("macro")
                .version("1.0")
                .build();
    }
}
