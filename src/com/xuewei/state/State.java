package com.xuewei.state;

public abstract class State {

    /**
     * 扣除积分  -50
     */
    public abstract void deductMoney();

    /**
     *  是否抽中奖品
     * @return
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();
}
