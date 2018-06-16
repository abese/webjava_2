package jp.co.systena.tigerscave.Eatting.model;

import jp.co.systena.tigerscave.Eatting.service.CookService;
import jp.co.systena.tigerscave.Eatting.service.CustomerService;
import jp.co.systena.tigerscave.Eatting.service.FoodstuffService;

public class EattingForm {

  private CookService cookService;
  private CustomerService customerService;
  private FoodstuffService foodstuffService;

  private int cook = 0;
  private int customer = 0;
  private int food = 0;

  private String message;

  public EattingForm() {
    cookService = new CookService();
    customerService = new CustomerService();
    foodstuffService = new FoodstuffService();
  }

  public int getCook() {
    return cook;
  }

  public void setCook(int cook) {
    this.cook = cook;
  }

  public int getCustomer() {
    return customer;
  }

  public void setCustomer(int customer) {
    this.customer = customer;
  }

  public int getFood() {
    return food;
  }

  public void setFood(int food) {
    this.food = food;
  }

  public CookService getCookService() {
    return cookService;
  }

  public void setCookService(CookService cookService) {
    this.cookService = cookService;
  }

  public CustomerService getCustomerService() {
    return customerService;
  }

  public void setCustomerService(CustomerService customerService) {
    this.customerService = customerService;
  }

  public FoodstuffService getFoodstuffService() {
    return foodstuffService;
  }

  public void setFoodstuffService(FoodstuffService foodstuffService) {
    this.foodstuffService = foodstuffService;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


}
