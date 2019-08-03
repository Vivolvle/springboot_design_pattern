package com.vivolvle.abstract_factory.factory;

import com.vivolvle.abstract_factory.core.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author weilz
 * @date 2019/8/2
 */
@Service
public class IocFactory {
    
    private final Map<Integer, AbstractService> serviceMap;
    
    @Autowired
    private IocFactory(List<AbstractService> list){
        serviceMap = list.stream().collect(Collectors.toMap(AbstractService::getType,v->v));
    }

    public AbstractService getServiceByType(Integer type){
        return serviceMap.get(type);
    }
    
}
