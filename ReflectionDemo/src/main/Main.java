package main;

import tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Class clazz;

        // 1. Fall
        clazz = Schwein.class;

        // 2.Fall
        clazz = new Schwein().getClass();

        // 3.Fall
        clazz = Class.forName("tiere.Schwein");

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println("-----------------------------");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("-----------------------------");
        methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("-----------------------------");
        //Method singleMethod = clazz.getMethod("setName", String.class);

        Object object = clazz. getDeclaredConstructor().newInstance();
        System.out.println(object);

        object = clazz. getDeclaredConstructor(String.class).newInstance("Miss piggy");
        System.out.println(object);

        Method f = clazz.getMethod("fuettern");
        f.invoke(object);
        System.out.println(object);

        Method s = clazz.getDeclaredMethod("setGewicht", int.class);
        s.setAccessible(true);
        s.invoke(object, -100);
        System.out.println(object);

    }
}