package jp.co.systena.tigerscave.Eatting.model;

public abstract class Foodstuff {

  public int prace;
  public int amount;
  public String name;

  public abstract String getName();
  public abstract int getPrace();
  public abstract int getAmount();
}
