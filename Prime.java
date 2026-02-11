package com.gqt_java.java_gqt.programs;
class Prime {
    boolean check(int n) {
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
            if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.check(7));
    }
}

