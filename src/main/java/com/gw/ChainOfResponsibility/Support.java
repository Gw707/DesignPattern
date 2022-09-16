package com.gw.ChainOfResponsibility;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 关键代码
     * support方法:能解决就解决，不能解决看后面还有没有人可以传
     */
    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next != null){
            next.support(trouble);
        }else{
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble){
        System.out.println(trouble.toString() + " is resolved by " + this.name);
    }

    protected void fail(Trouble trouble){
        System.out.println("can't resolve " + trouble.toString());
    }

}
