package dao;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: wangxindong
 * Date: 2017/3/15
 * Time: 21:46
 */
@Configuration
public class DataBaseConfiguration implements EnvironmentAware {

    private RelaxedPropertyResolver resolver;
    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        resolver = new RelaxedPropertyResolver(environment, "jdbc.");
    }
}
