package com.levelup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
    private String s;
    private String name;

    public Hello(String s) {
        this.s = s;
    }

    public Hello() {
    }

    public void sayHello(){
        System.out.println(s + " " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"springConfig.xml"});
        Hello h = (Hello) ac.getBean("hello");
        h.sayHello();
        System.out.println();
    }
}
