package com.xuewei.state;

public class ClientTest {

    public static void main(String[] args) {

        // 创建活动对象,奖品有一个奖品
        RaffleActivity raffleActivity = new RaffleActivity(1);


        // 连续抽奖
        for (int i = 0; i < 30; i++) {
            System.out.println("----------第" + (i+1) + "次抽奖-----------");
            // 参加抽奖,第一步点击扣除积分
            raffleActivity.debuctMoney();

            // 第二🙅‍抽奖
            raffleActivity.raffle();
        }
    }
}
