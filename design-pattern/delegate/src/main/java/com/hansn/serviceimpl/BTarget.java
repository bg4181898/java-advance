package com.hansn.serviceimpl;

import com.hansn.service.Target;

public class BTarget implements Target {
    public void dosomething(String commond) {
        System.out.println("B员工做具体的事情"+commond);
    }
}
