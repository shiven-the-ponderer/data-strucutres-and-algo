package com.shiven.designpattern.singleton;

public class LazyInit {
    
    private static LazyInit init;

    private LazyInit() {
        
    }
    
    public static synchronized LazyInit getInstance() {
        if(init==null) {
            init = new LazyInit();
        }
        return init;
    }
}
