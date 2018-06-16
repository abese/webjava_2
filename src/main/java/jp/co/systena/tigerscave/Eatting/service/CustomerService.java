package jp.co.systena.tigerscave.Eatting.service;

import java.util.ArrayList;
import java.util.List;
import jp.co.systena.tigerscave.Eatting.model.Champion;
import jp.co.systena.tigerscave.Eatting.model.Customer;
import jp.co.systena.tigerscave.Eatting.model.Student;

public class CustomerService {

  private List<Customer> customerList;

  public CustomerService() {
    customerList = new ArrayList<Customer>();
    Customer student = new Student();
    student.setPace(100);
    customerList.add(student);

    Customer champion = new Champion();
    champion.setPace(300);
    customerList.add(champion);
  }

  public List<Customer> getCustomerList() {
    return customerList;
  }

}
