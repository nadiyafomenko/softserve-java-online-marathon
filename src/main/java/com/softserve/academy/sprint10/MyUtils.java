package com.softserve.academy.sprint10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    private Connection connection;
    private Statement statement;
    private String schemaName;

    public Connection createConnection() throws SQLException {
        DriverManager.registerDriver(new org.h2.Driver());
        connection = DriverManager.getConnection("jdbc:h2:mem:test", "", "");
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public Statement createStatement() throws SQLException {
        statement = connection.createStatement();
        return statement;
    }

    public void closeStatement() throws SQLException {
        statement.close();
    }

    public void createSchema(String schemaName) throws SQLException {

    }

    public void dropSchema() throws SQLException {

    }

    public void useSchema() throws SQLException {

    }

    public void createTableRoles() throws SQLException {

    }

    public void createTableDirections() throws SQLException {
        // code
    }

    public void createTableProjects() throws SQLException {
        // code
    }

    public void createTableEmployee() throws SQLException {
        // code
    }

    public void dropTable(String tableName) throws SQLException {
        // code
    }

    public void insertTableRoles(String roleName) throws SQLException {
        // code
    }

    public void insertTableDirections(String directionName) throws SQLException {
        // code
    }

    public void insertTableProjects(String projectName, String directionName) throws SQLException {
        // code
    }

    public void insertTableEmployee(String firstName, String roleName, String projectName) throws SQLException {
        // code
    }

    public int getRoleId(String roleName) throws SQLException {
       return 0;
    }

    public int getDirectionId(String directionName) throws SQLException {
        return 0;
    }

    public int getProjectId(String projectName) throws SQLException {
        return 0;
    }

    public int getEmployeeId(String firstName) throws SQLException {
        return 0;
    }

    public List<String> getAllRoles() throws SQLException {
       return new ArrayList<>();
    }

    public List<String> getAllDirestion() throws SQLException {
        return new ArrayList<>();
    }

    public List<String> getAllProjects() throws SQLException {
        return new ArrayList<>();
    }

    public List<String> getAllEmployee() throws SQLException {
        return new ArrayList<>();
    }

    public List<String> getAllDevelopers() throws SQLException {
        return new ArrayList<>();
    }

    public List<String> getAllJavaProjects() throws SQLException {
        return new ArrayList<>();
    }

    public List<String> getAllJavaDevelopers() throws SQLException {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        try {
            new MyUtils().createConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
