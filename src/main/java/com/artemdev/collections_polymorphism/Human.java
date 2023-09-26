package com.artemdev.collections_polymorphism;

public class Human implements Runner, Worker, Gamer {
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I`m running!");
    }

    @Override
    public void play() {
        System.out.println("I`m playing!");
    }

    @Override
    public void work() {
        System.out.println("I`m working!");
    }
}
