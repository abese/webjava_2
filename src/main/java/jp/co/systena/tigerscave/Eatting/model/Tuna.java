package jp.co.systena.tigerscave.Eatting.model;

public class Tuna extends Foodstuff {

  public Tuna() {
    name = "マグロ";
    prace = 300;
    amount = 700;
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
