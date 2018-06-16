package jp.co.systena.tigerscave.Eatting.model;

public class PizzaCraftsman extends Cook {

  private String food = "{0}のせピザ";

  public PizzaCraftsman( ) {
    setPrice(1000);
    name ="ピザ職人";
  }

  @Override
  public String cooking(String foodstuff) {

    return food.replace("{0}", foodstuff);
  }

  @Override
  public String getName() {

    return name;
  }

}
