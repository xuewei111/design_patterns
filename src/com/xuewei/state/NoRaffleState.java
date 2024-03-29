package com.xuewei.state;

public class NoRaffleState extends State{

    /**
     * 初始化时传入活动引用,扣除积分后修改其状态
     */
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 当前状态可以扣除积分, 扣除后,将状态设置成可以抽奖状态
     */
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分,可以抽奖了!");
        activity.setState(activity.getCanRaffleState());
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣除了积分才可以抽奖！");
        return false;
    }

    /**
     * 当前状态不能发奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品！");
    }
}
