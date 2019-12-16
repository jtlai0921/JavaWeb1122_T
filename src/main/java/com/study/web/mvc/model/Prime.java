package com.study.web.mvc.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Prime {
    static Map<Integer, Boolean> map = new LinkedHashMap<>();
    
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        // Java 7
        for(int i=2;i<n/2;i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isPrime_java8(int n) {
        if (n <= 1) return false;
        return !IntStream.rangeClosed(2, n/2).anyMatch(i -> n % i == 0);
    }
    
    
}
