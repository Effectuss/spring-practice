package edu.panov.spring.rest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Корневой контекст Spring (Bean'ы уровня сервисов, базы данных и т. д.)
     * В данном случае он не нужен, поэтому возвращаем null
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // Если появится конфиг уровня root (например, для Security), его можно добавить сюда
    }

    /**
     * Контекст для сервлета (Spring MVC, контроллеры, представления и т. д.)
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MainConfig.class};
    }

    /**
     * Маппинг DispatcherServlet на корень ("/")
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
