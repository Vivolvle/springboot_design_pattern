package com.vivolvle.abstract_factory.core;

/**
 * @author weilz
 * @date 2019/8/2
 */
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
