package uk.co.sromo.blister.objects;

import uk.co.sromo.blister.BPItem;

/**
 * Created by IntelliJ IDEA.
 * User: daniel
 * Date: 10-Aug-2010
 * Time: 21:43:27
 * To change this template use File | Settings | File Templates.
 */
public class BPDate implements BPItem {
    
    private final byte[] data;

    public BPDate(byte[] data) {
        //To change body of created methods use File | Settings | File Templates.
        this.data = data;
    }
}