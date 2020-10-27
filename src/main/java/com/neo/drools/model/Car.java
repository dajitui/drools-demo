package com.neo.drools.model;

import lombok.Data;

/**
 * @author M
 */
@Data
public class Car {

    public Car(){
        this.lastPrice = 100;
    }

    /**
     * 满多少件
     */
    private Integer piece;

    /**
     * 满多少钱
     */
    private Integer price;

    /**
     * 用户有多少积分
     */
    private Integer score;

    /**
     * 最终价格
     */
    private Integer lastPrice;


}
