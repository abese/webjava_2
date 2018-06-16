package jp.co.systena.tigerscave.Eatting.service;

import java.util.ArrayList;
import java.util.List;
import jp.co.systena.tigerscave.Eatting.model.Foodstuff;
import jp.co.systena.tigerscave.Eatting.model.RoastBeef;
import jp.co.systena.tigerscave.Eatting.model.Tuna;

public class FoodstuffService {

  public List<Foodstuff> foodList;

  public FoodstuffService() {
    foodList = new ArrayList<Foodstuff>();
    RoastBeef roastBeef = new RoastBeef();
    foodList.add(roastBeef);
    Tuna tuna = new Tuna();
    foodList.add(tuna);
  }

  public List<Foodstuff> getFoodList() {
    return foodList;
  }
}
