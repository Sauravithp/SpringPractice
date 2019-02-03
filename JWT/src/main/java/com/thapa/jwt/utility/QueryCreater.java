package com.thapa.jwt.utility;

public class QueryCreater {

    public static String getAll() {
        String query = "Select first_Name from UserDetails";
        return query;
    }


    public static String queryToFetchUserDetailsByFirstName(String firstName) {
        String query = "select e from UserDetails e where e.first_Name= '" + firstName + "'";
        return query;

    }
}
