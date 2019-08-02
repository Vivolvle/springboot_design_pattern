package com.vivolvle.abstract_factory.service;

import com.vivolvle.abstract_factory.core.AbstractService;
import com.vivolvle.abstract_factory.factory.IocFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weilz
 * @date 2019/8/2
 */
@Service
public class TestService {

    private final IocFactory iocFactory;

    @Autowired
    public TestService(IocFactory iocFactory) {
        this.iocFactory = iocFactory;
    }

    public void iocFactoryMethod(Integer type){
        AbstractService service = iocFactory.getServiceByType(type);
        service.run();
    }


}
