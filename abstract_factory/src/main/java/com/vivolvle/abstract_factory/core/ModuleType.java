package com.vivolvle.abstract_factory.core;

import lombok.AllArgsConstructor;

/**
 * @author weilz
 * @date 2019/8/2
 */

@AllArgsConstructor
public enum ModuleType {
    AirPlain(1),
    Car(2),
    Boat(3);
    private Integer type;

    public Integer getType() {
        return type;
    }}
