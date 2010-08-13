package uk.co.sromo.blister;

/**
 * Created by IntelliJ IDEA.
 * User: daniel
 * Date: 10-Aug-2010
 * Time: 21:39:35
 * To change this template use File | Settings | File Templates.
 */
public class BPNull extends BPItem {

    public final static BPNull Instance = new BPNull();
    private BPNull() {};


    @Override
    public String toString() {
        return "NULL";
    }
    
    @Override
    public Type getType() {
        return Type.Null;
    }

    @Override
    public void accept(BPVisitor visitor) {
        visitor.visit(this);
    }
}
