package org.example.db;

public class Table implements AutoCloseable{

    private final String select;

    public Table(final String select) {
        this.select = select;
    }
    // Column soll bei 0 beginnen + mehrfacher Aufruf muss möglich sein
    public String getValue(final int column) throws Exception{
        return null;
    }

    public String getValue(final String  columnName)throws Exception{
        return null;
    }

    public int getColumnCount()throws Exception{
        return -1;
    }

    public String getColumnName(final int column)throws Exception{
        return null;
    }

    public boolean next() throws Exception{
        return false;
    }


    @Override
    public void close() throws Exception {

    }
}
