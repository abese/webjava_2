package jp.co.systena.tigerscave.Eatting.service;

import java.util.ArrayList;
import java.util.List;
import jp.co.systena.tigerscave.Eatting.model.Cook;
import jp.co.systena.tigerscave.Eatting.model.PizzaCraftsman;
import jp.co.systena.tigerscave.Eatting.model.SushiCraftsman;

public class CookService {

  private List<Cook> cookList;

  public CookService() {
    cookList = new ArrayList<Cook>();
    Cook pizza = new PizzaCraftsman();
    pizza.setPrice(100);
    cookList.add(pizza);

    Cook sushi = new SushiCraftsman();
    sushi.setPrice(1000);
    cookList.add(sushi);
  }

  public List<Cook> getCookList() {
    return cookList;
  }

  public void setCookList(List<Cook> cookList) {
    this.cookList = cookList;
  }


}
