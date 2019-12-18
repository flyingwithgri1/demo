package com.nyk.demo;

public class Test {

    public  static void main(String[] args){
        String unicode = "&#xeba2;&#xe319;";
        StringBuffer string = new StringBuffer();

        if (unicode.startsWith("&#x")) {
            String[] hex = unicode.replace("&#x", "").split(";");
            for (int i=0; i<hex.length; i++) {
                int data = Integer.parseInt(hex[i], 16);
                string.append((char) data);
            }
        } else if (unicode.startsWith("&#")) {
            String[] hex = unicode.replace("&#", "").split(";");
            for (int i=0; i<hex.length; i++) {
                int data = Integer.parseInt(hex[i], 10);
                string.append((char) data);
            }
        }
        System.out.println(string.toString());

    }
}
