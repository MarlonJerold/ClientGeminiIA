package com.client.gemini.botbluesky;

public enum Person {
    LAWYER ("@"),
    ACCUSED("@"),
    MAIN("@");

    private final String profileUrl;

    Person(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }
}
