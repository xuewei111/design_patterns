package com.xuewei.command;

public class TVOnCommand implements Command{
    private TVReceiver tvReceiver;

    // 构造器
    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        tvReceiver.on();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        tvReceiver.off();
    }

}
