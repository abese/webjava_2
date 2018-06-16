package jp.co.systena.tigerscave.Eatting.model;

public class RoastBeef extends Foodstuff {

  public RoastBeef() {
    name = "ローストビーフ";
    prace = 1000;
    amount = 1500;
  }


  @Override
  public String getName() {

    return name;
  }

  @Override
  public int getPrace() {

    return prace;
  }

  @Override
  public int getAmount() {

    return amount;
  }


}
