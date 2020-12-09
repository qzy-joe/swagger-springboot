package com.qzy.springboot.config;

/**
 * @描述
 * @创建人 joy_qiu
 * @创建时间 2020-12-07-16:27
 * @修改人和其它信息
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment) {
        //设置swagger要显示的环境
        //Profiles of = Profiles.of("dev");
        //判断当前处于何种环境
        // 通过 enable() 接收此参数判断是否要显示
        //boolean b = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())
                .groupName("接口")
                .enable(true)//配置是否启用Swagger，如果是false，在浏览器将无法访问
                //// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .select()
                //只扫描controller下的包
                .apis(RequestHandlerSelectors.basePackage("com.qzy.springboot"))
                .build();
    }

    /**
     * 配置多个分组
     * @return
     */
/*    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group2");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group3");
    }*/

    private ApiInfo apiInfo() {
        Contact contact = new Contact("fninging", "", "fninging@126.com");
        return new ApiInfo(
                "Api 文档题目",
                "Api 文档描述",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
