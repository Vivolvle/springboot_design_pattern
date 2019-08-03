package com.vivolvle.abstract_factory.core;

import org.springframework.stereotype.Service;

/**
 * @author weilz
 * @date 2019/8/2
 */
@Service
public class AirPlaneService extends AbstractService {
    @Override
    public Integer getType() {
        return ModuleType.AirPlain.getType();
    }

    @Override
    public void run() {
        System.out.println("the plane is Flying in the sky");
    }
}
