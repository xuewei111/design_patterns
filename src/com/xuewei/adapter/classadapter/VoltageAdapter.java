package com.xuewei.adapter.classadapter;

public class VoltageAdapter extends Voltage220v implements IVoltage5V{

    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = super.output220V();
        //转成 5v
        int dstV = srcV / 44 ;
        return dstV;
    }

}
