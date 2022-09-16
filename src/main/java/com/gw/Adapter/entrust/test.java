package com.gw.Adapter.entrust;

import com.gw.Adapter.extend.PrintBanner;

import java.util.Stack;

public class test {
    public static void main(String[] args) {
        PrintBanner test = new PrintBanner("test");
        test.printWeak();
        test.printStrong();
        test.otherThings();
        Stack<Integer> integers = new Stack<>();
    }
}
