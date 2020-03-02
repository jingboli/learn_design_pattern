package behavioral_pattern.chain_of_responsibility_pattern.example.pattern;

/**
 * Sunny软件公司承接了某企业SCM(Supply Chain Management，供应链管理)系统的开发任务，
 * 其中包含一个采购审批子系统。该企业的采购审批是分级进行的，即根据采购金额的不同由不同层次的主管人员来审批，
 * 主任可以审批5万元以下（不包括5万元）的采购单，
 * 副董事长可以审批5万元至10万元（不包括10万元）的采购单，
 * 董事长可以审批10万元至50万元（不包括50万元）的采购单，
 * 50万元及以上的采购单就需要开董事会讨论决定
 */
public abstract class PurchaseRequestHandler {

    protected PurchaseRequestHandler successor;
    protected String name;

    public PurchaseRequestHandler(String name) {
        this.name = name;
    }


    public void setSuccessor(PurchaseRequestHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(PurchaseRequest request);
}
