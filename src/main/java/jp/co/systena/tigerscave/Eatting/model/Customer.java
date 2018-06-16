package jp.co.systena.tigerscave.Eatting.model;

public abstract class Customer {

  public int pace;
  public String name;

  public void setPace(int pace) {
    this.pace = pace;
  }

  public abstract int getEattime(int amount);
  public abstract String getName();
}
