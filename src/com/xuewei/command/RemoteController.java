package com.xuewei.command;

import java.util.List;

public class RemoteController {
    /**
     * 开 按钮的命令集合
     */
    private List<Command> onCommands;

    /**
     * 关 按钮的命令集合
     */
    private List<Command> offCommands;

    /**
     * 执行撤销的命令
     */
    private Command undoCommand;

    public RemoteController(){
        for (int i = 0; i < 5; i++) {
            onCommands.add(new NoCommand());

            offCommands.add(new NoCommand());
        }
    }

    /**
     * 给我们的按钮设置你需要的命令
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands.set(no,onCommand);

        offCommands.set(no,offCommand);
    }

    /**
     * 按下开按钮
     * @param no
     */
    public void onButtonWasPushed(int no){
        //找到你按下的开的按钮， 并调用对应方法
        onCommands.get(no).execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands.get(no);
    }

    /**
     * 按下关按钮
     * @param no
     */
    public void offButtonWasPushed(int no){
        // 找到你按下的关的按钮， 并调用对应方法
        offCommands.get(no).execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands.get(no);
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }


}
