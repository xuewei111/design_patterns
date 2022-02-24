package com.xuewei.template.improve;

public class PureSoyaMilk extends SoyaMilk{
    /**
     * //空实现
     */
    @Override
    protected void addCondiments() {

    }


    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
