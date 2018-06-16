package jp.co.systena.tigerscave.Eatting.model;

public class Champion extends Customer {

  public Champion() {
    name ="チャンピオン";
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
