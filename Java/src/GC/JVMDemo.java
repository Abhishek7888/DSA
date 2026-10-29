package src.GC;

import java.util.ArrayList;

class JVMDemo {

    static void infinite(){
        infinite();
    }
    static void fillheap (){
        var list = new java.util.ArrayList<byte[]>();
        while (true){
            list.add(new byte[1024*1024*1024]);
        }
    }

    static void printClassLoader(){
        ClassLoader loader = JVMDemo.class.getClassLoader();
        System.out.println("App " + loader);
        System.out.println("Ext:"+ loader.getParent());
        System.out.println("Boot:"+ loader.getParent().getParent());
    }

    public static void main(String[] args) {

        printClassLoader();
        // uncomment one at a time to see the errors:
         try { infinite(); } catch (StackOverflowError e) { System.out.println("Stack full: " + e); }
         fillheap();
    }
}