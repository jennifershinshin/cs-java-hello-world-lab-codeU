package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String versionStr = System.getVersion("java.version");
        return Double.parseDouble(versionStr);
    }

    public static void main(String[] args) {
	    System.out.println(getVersion());
    }
}
