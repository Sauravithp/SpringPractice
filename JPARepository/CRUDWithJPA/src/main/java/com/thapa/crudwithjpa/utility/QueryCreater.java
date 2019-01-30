package com.thapa.crudwithjpa.utility;

public class QueryCreater {

    public static String getAll() {
        String query = "Select e from Employee e";
        return query;
    }
}
