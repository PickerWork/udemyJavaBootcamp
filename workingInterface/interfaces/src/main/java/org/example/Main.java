package org.example;

public class Main {
    public static void main(String[] args) {
        /*ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.add();*/
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}