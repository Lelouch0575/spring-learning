package com.kuang.demo01;

public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fee();
    }

    public void seeHouse() {
        System.out.println("see house");
    }

    public void fee() {
        System.out.println("fee");
    }

    public void hetong() {
        System.out.println("qianhetong");
    }
}
