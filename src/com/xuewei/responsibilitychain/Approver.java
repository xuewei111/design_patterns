package com.xuewei.responsibilitychain;

public abstract class Approver {
    /**
     * 下应该处理者
     */
    protected Approver approver;

    /**
     * 名字
     */
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 下一个处理者
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理审批请求的方法,得到一个请求,处理是子类完成,因此方法是抽象
     * @param purchaseRequest
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
