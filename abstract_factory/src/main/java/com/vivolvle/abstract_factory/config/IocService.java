package com.vivolvle.abstract_factory.config;

import com.vivolvle.abstract_factory.core.AbstractService;
import com.vivolvle.abstract_factory.core.AirPlaneService;
import com.vivolvle.abstract_factory.core.BoatService;
import com.vivolvle.abstract_factory.core.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weilz
 * @date 2019/8/2
 */
@Configuration
public class IocService {

    @Bean
    public AbstractService AirPlaneBean(){
        return new AirPlaneService();
    }

    @Bean
    public AbstractService CarBean(){
        return new CarService();
    }

    @Bean
    public AbstractService BoatBean(){
        return new BoatService();
    }
}
