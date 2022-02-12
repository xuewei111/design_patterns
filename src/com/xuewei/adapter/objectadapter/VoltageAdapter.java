package com.xuewei.adapter.objectadapter;

public class VoltageAdapter extends Voltage220v implements IVoltage5V {

    private Voltage220v voltage220v;

    public VoltageAdapter(Voltage220v voltage220v){
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(null != voltage220v) {
            int src = voltage220v.output220V();//获取220V 电压
            System.out.println("使用对象适配器，进行适配~~");
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }

        return dst;
    }

}
