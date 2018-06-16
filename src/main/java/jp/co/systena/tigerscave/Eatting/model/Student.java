package jp.co.systena.tigerscave.Eatting.model;

public class Student extends Customer {

  public Student() {
    name = "学生";
  }
  @Override
  public int getEattime(int amount) {

    return amount / pace;
  }
  @Override
  public String getName() {

    return name;
  }

}
