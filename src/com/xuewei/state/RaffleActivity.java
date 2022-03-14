package com.xuewei.state;

public class RaffleActivity {

    /**
     * state 表示活动当前的状态,是变化
     */
    State state = null;

    /**
     * 奖品数量
     */
    int count = 0;

    State noRaffleState =  new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);

    State dispenseState = new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣分,调用当前状态的debuctMoney
     */
    public void debuctMoney(){
        state.deductMoney();
    }

    public void raffle(){
        // 当前的状态是抽奖成功
        if(state.raffle()){
            // 领取奖品
            state.dispensePrize();
        }
    }


    public void setState(State state) {
        this.state = state;
    }

    // 每领取一次奖品, count--
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }
}
