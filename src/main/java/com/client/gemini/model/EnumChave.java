package com.client.gemini.model;

public enum EnumChave {
    GEMINI("AIzaSyCbRXps0chCu1atb-8egwwzTCvnaQH9cTc");

    private final String enumChave;

    EnumChave(String enumChave) {
        this.enumChave = enumChave;
    }

    public String getProfileUrl() {
        return enumChave;
    }
}