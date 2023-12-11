package jp.ac.uryukyu.ie.e235746;

public class Main{
    try{
    String str = null;
    System.out.println(str.length());
    }catch(NullPointerException e){
        System.out.println("NullPointerExceptionが発生しました");
        System.out.println(e.getMessage());
    }
}

