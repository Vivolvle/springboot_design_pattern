package com.vivolvle.abstract_factory.core;

/**
 * @author weilz
 * @date 2019/8/2
 */
public class CarService extends AbstractService {
    @Override
    public Integer getType() {
        return ModuleType.Car.getType();
    }

    @Override
    public void run() {
        System.out.println("the car is driving on the road");
    }
}
