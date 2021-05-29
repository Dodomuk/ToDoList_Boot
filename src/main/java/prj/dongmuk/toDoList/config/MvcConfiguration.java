package prj.dongmuk.toDoList.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//개발자가 직접 제어가 불가능한 외부 라이브러리 또는 설정을 위한 클래스를 bean 등록할 때 사용
//번외) Component: 개발자가 직접 개발한 클래스를 bean 등록할때 활용
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry){
        registry.addResourceHandler("/**")
                .addResourceLocations("file:src/main/resources/templates/","file:src/main/resources/static/");
    }
}
