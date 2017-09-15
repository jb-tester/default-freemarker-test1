package com.mytests.springboot.webapp.defaults.freemarker.defaultfreemarkertest1;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/14/2017.
 * Project: DefaultFreemarker_test0
 * *******************************
 */
public class Data {
    String name;
    String status;

    public Data(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
