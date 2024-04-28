// Generics

import java.util.ArrayList;

class MyGeneric<T1, T2> {
    int val = 100;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

}

class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(52);
        al.add(99);

        int a = al.get(1);
        System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric(52, "Shubham", 99);
        String str = g1.getT1();
        int integer = g1.getT2();
        System.out.println(str + " has got marks " + integer);

        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
        Test<String> sObj = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
