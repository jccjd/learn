package Ipwl.reflect;

import Ipwl.servertest.Serverlet;

public class test2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clz = Class.forName("Ipwl.servertest.LoginServerlet");
        //调用空构造 确保空构造存在
        Serverlet ser = (Serverlet)clz.newInstance();
    }
}
