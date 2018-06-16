package jp.co.systena.tigerscave.Eatting.model;

public class SushiCraftsman extends Cook {

  private String food = "sushi";

  public SushiCraftsman() {
    setPrice(500);
    name = "スシ職人";
  }

  @Override
  public String cooking(String foodstuff) {

    return foodstuff + food;
  }

  @Override
  public String getName() {

    return name;
  }


}
