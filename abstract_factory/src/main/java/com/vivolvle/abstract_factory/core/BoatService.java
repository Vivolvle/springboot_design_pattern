package com.vivolvle.abstract_factory.core;

/**
 * @author weilz
 * @date 2019/8/2
 */
public class BoatService extends AbstractService {
    @Override
    public Integer getType() {
        return ModuleType.Boat.getType();
    }

    @Override
    public void run() {
        System.out.println("the boat in the river");
    }
}
