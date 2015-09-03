package com.amtf;

/**
 * 工具类
 * 提供常用的一些方法
 */
public class App {

    /**
     * Generate a well format string for Log's tag
     * log in this format (filename.java:XX) xx line number
     * you can link the shortcut the same way gets linked when there's an error.
     * @return String
     */
    public static String getTag() {
        String tag = "";
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (int i = 0; i < ste.length; i++) {
            if (ste[i].getMethodName().equals("getTag")) {
                tag = "("+ste[i + 1].getFileName() + ":" + ste[i + 1].getLineNumber()+")";
            }
        }
        return tag;
    }
}
