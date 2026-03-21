// StyleManager.java

package com.kinetiq.utils;

public class StyleManager {

    public static String applyBold(String text) {
        return "\u001B[1m" + text + "\u001B[0m";
    }

    public static String applyItalic(String text) {
        return "\u001B[3m" + text + "\u001B[0m";
    }

    public static String applyUnderline(String text) {
        return "\u001B[4m" + text + "\u001B[0m";
    }

    public static String applyColor(String text, String colorCode) {
        return colorCode + text + "\u001B[0m";
    }

}