package com.xuewei.builder.improve;

public class Client {

    public static void main(String[] args) {
        // 盖普通的房子
        CommonHouse commonHouse = new CommonHouse();

        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        // 完成盖房子,返回产品(普通房子)
        House house = houseDirector.constructHouse();

        System.out.println("--------------------------");

        // 高楼
        HighBuilding highBuilding = new HighBuilding();
        // 重置建筑群(通知?)
        houseDirector.setHouseBuilder(highBuilding);
        // 盖高楼
        House house1 = houseDirector.constructHouse();

    }
}
