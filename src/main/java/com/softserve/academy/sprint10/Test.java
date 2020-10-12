package com.softserve.academy.sprint10;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {
        MyUtils util = new MyUtils();
        util.createConnection();
    }

}
