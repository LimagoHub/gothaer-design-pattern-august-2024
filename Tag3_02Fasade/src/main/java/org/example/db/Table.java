package org.example.db;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Table implements AutoCloseable{
    private static final String CONNECTION_STRING = "jdbc:h2:c:/tmp/gothaer;AUTO_SERVER=TRUE" ;
    private final String select;
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private ResultSetMetaData resultSetMetaData = null;
    private Map<String, String> row = null;
    private int columnCount = -1;

    public Table(final String select) {
        this.select = select;
    }

    public String getColumn(int column) throws Exception{
        return getColumn(getColumnName(column));
    }
    public String getColumn(String columName) throws Exception{
        return getRow().get(columName);
    }

    public String getColumnName(int column) throws Exception{
        return getResultSetMetaData().getColumnName(column + 1);
    }

    public int getColumnCount() throws Exception{
        if(columnCount == -1)
            columnCount = getResultSetMetaData().getColumnCount();
        return columnCount;
    }

    public boolean next() throws Exception{
        if(resultSet.next()) {
            dataExchange();
            return true;
        }
        return false;
    }

    private void dataExchange() throws Exception{
        for(int i = 0; i < getColumnCount(); i++) {
            getRow().put(getColumnName(i), getResultSet().getString(getColumnName(i)));
        }
    }

    @Override
    public void close() throws Exception {
        if(resultSet != null) resultSet.close();
        if(statement != null) statement.close();
        if(connection != null) connection.close();

    }

    private Connection getConnection() throws Exception{
        if(connection == null)
            connection = DriverManager.getConnection(CONNECTION_STRING,"sa","");
        return connection;
    }

    private Statement getStatement() throws Exception{
        if(statement == null)
            statement = getConnection().createStatement();
        return statement;
    }

    private ResultSet getResultSet() throws Exception{
        if(resultSet == null)
            resultSet = getStatement().executeQuery(select);
        return resultSet;
    }

    private ResultSetMetaData getResultSetMetaData() throws Exception {
        if (resultSetMetaData == null)
            resultSetMetaData = getResultSet().getMetaData();
        return resultSetMetaData;
    }

    private Map<String, String> getRow() throws Exception{
        if(row == null) {
            row = new HashMap<>();
            for (int i = 0; i < getColumnCount(); i++) {
                row.put(getColumnName(i), "");
            }
        }
        return row;
    }

}
