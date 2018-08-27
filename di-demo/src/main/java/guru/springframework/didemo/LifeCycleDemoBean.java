package guru.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName called : " +name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory called : "+beanFactory);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext called : "+applicationContext);
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("@postConstruct called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("@preDestroy called");
    }

    public void customBeforeInit(){
        System.out.println("customBeforeInit() Called");
    }

    public void customAfterInit(){
        System.out.println("customAfterInit Called");
    }
}
