package org.fmz.concurrency;

public class MicroBlogNode implements SimpleMicroBologNode{
    private final String ident;

    public MicroBlogNode(String ident_){
        ident = ident_;
    }

    public String getIdent(){
        return ident;
    }

    public synchronized void propagateUpdate(Update upd_, MicroBlogNode backup_){
        System.out.println(ident + ": recvd: " + upd_.getUpdateText() + " ; backup: " + backup_.getIdent());
        backup_.confirmUpdate(this, upd_);
    }

    public synchronized confirmUpdate(MicroBlogNode other_, Update update_){
        System.out.println(ident + ": recvd confirm: " + update_.getUpdateText() + " from " + other_.getIdent());
    }
}
