package org.example;

import org.example.db.Table;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String CONNECTION_STRING = "jdbc:h2:c:/tmp/gothaer;AUTO_SERVER=TRUE" ;
    public static void main( String[] args )
    {
        /*
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING, "sa","")){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery("select * from tbl_personen")){
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    for(int i = 1; i <= metaData.getColumnCount(); i++){
                        System.out.printf("%-30s",metaData.getColumnName(i));
                    }
                    System.out.println();
                    while(resultSet.next()){
                        for(int i = 1; i <= metaData.getColumnCount(); i++){
                            System.out.printf("%-30s",resultSet.getString(i));
                        }
                        System.out.println();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

         */

        try (Table table = new Table("SELECT * from tbl_personen")) {
            for(int i = 0; i < table.getColumnCount(); i++){
                System.out.printf("%-30s",table.getColumnName(i));
            }
            System.out.println();
            while(table.next()){
                for(int i = 1; i <= table.getColumnCount(); i++){
                    System.out.printf("%-30s",table.getValue(i));
                    System.out.printf("%-30s",table.getValue(i));
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
