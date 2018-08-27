package guru.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleDemoBean){
            LifeCycleDemoBean lifeCycleDemoBean = (LifeCycleDemoBean)bean;
            lifeCycleDemoBean.customBeforeInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleDemoBean){
            LifeCycleDemoBean lifeCycleDemoBean = (LifeCycleDemoBean)bean;
            lifeCycleDemoBean.customAfterInit();
        }
        return bean;
    }
}
