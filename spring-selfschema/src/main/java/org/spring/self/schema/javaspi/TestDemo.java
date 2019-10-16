package org.spring.self.schema.javaspi;

import com.sun.tools.javac.util.ServiceLoader;

public class TestDemo {
    public static void main(String[] args) {
        ServiceLoader<TestService> testServices = ServiceLoader.load(TestService.class);
        for (TestService testService: testServices) {
            testService.print();
        }
    }
}
