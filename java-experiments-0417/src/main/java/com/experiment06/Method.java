package com.experiment06;

public class Method {
    public static int all = 0;
    public static void loading(Boat b, Container[] c) throws DangerException {
        for (int i = 0; i < c.length; i++) {
            all = all + c[i].getW();
        }
        if (all > b.getMaxw() || c.length > b.getMaxn())
            throw new DangerException();
//        DangerException e = new DangerException();
    }
}
