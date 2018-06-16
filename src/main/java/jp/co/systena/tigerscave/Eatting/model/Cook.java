package jp.co.systena.tigerscave.Eatting.model;

public abstract class Cook {

  protected int price;
  protected String name;

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }

  public abstract String cooking(String foodstuff);
  public abstract String getName();
}
