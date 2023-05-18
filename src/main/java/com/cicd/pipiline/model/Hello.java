package com.cicd.pipiline.model;

public class Hello {
    private String hello;

    public Hello(String hello){
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "hello='" + hello + '\'' +
                '}';
    }

    public String shout(){
        return this.hello;
    }
}
