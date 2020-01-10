package com.umutcanbolat.seleniumsimpletest;

import org.junit.jupiter.api.Test;
 
public class JUnit5ExampleTest {
 
    @Test
    void justAnExample() {
    	Login login = new Login();
    	login.testLogin();
    }
}