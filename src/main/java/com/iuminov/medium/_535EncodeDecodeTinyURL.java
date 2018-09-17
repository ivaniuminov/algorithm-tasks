package com.iuminov.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _535EncodeDecodeTinyURL {

    private static final Map<String, String> URLS = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        java.util.Random rand = new Random();
        String key = rand.nextInt(1000000) + "";
        URLS.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return URLS.get(shortUrl);
    }
}
