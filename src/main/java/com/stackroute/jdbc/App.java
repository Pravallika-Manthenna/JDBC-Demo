package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();

        System.out.println("Simple jdbc demo");
        System.out.println( "General Order" );
        simpleJdbcDemo.getEmployeeDetails();

        System.out.println( "Reverse Order" );
        simpleJdbcDemo.getEmployeeDetailsInReverseOrder();

        System.out.println( "From Second Row" );
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();

        System.out.println("getEmployeeDetailsByNameAndGender");
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("Harika","Female");

        System.out.println("Result Set Meta Data");
        ResultSetMetadataDemo resultSetMetaDataDemo = new ResultSetMetadataDemo();
        resultSetMetaDataDemo.getEmployeeDetails();

        System.out.println("Jdbc transaction demo");
        JdbcTransactionDemo jdbcTransactionDemo =new JdbcTransactionDemo();
        jdbcTransactionDemo.addEmployeeDetails();

        //jdbcTransactionDemo.addEmployeeDetails();

        System.out.println("Jdbc Batch demo");
        JdbcBatchDemo jdbcBatchDemo = new JdbcBatchDemo();
        jdbcBatchDemo.batchDemo();

        System.out.println("Database MetaData demo");
        DatabaseMetadataDemo databaseMetaDataDemo = new DatabaseMetadataDemo();
        databaseMetaDataDemo.getMetaData();

    }
}