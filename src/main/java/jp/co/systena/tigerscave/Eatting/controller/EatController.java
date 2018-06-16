package jp.co.systena.tigerscave.Eatting.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.Eatting.model.Cook;
import jp.co.systena.tigerscave.Eatting.model.Customer;
import jp.co.systena.tigerscave.Eatting.model.EattingForm;
import jp.co.systena.tigerscave.Eatting.model.Foodstuff;

@Controller
public class EatController {

  @Autowired
  HttpSession session;

  EattingForm form;

  @RequestMapping("/Eatting")
  public Model show(Model model) {

    form = new EattingForm();

    // Viewに渡すデータを設定
    model.addAttribute("eattingForm", form);
    session.setAttribute("eattingForm", form);

    // 履歴Map
    session.setAttribute("account", new ArrayList<Map<String, String>>());


    return model;
  }

  @RequestMapping(value = "/Eatting", params="eatting" , method = RequestMethod.POST)
  public ModelAndView eating(EattingForm pstForm, ModelAndView model) {

    //セッション取得
    EattingForm form = (EattingForm)session.getAttribute("eattingForm");
    // 食材取得
    Foodstuff food = form.getFoodstuffService().foodList.get(pstForm.getFood());
    // 料理人取得
    Cook cook = form.getCookService().getCookList().get(pstForm.getCook());
    // お客取得
    Customer customer = form.getCustomerService().getCustomerList().get(pstForm.getCustomer());

    // 食事時間
    int eattingTime = customer.getEattime(food.getAmount());
    // 金額
    int money = cook.getPrice() + food.getPrace();
    // message作成
    String message = cook.cooking(food.getName()) + "を食べるのに"+ eattingTime + "分かかりました。代金は" + money + "円です。";

    form.setMessage(message);
    model.getModelMap().addAttribute("eattingForm", form);
    session.setAttribute("eattingForm", form);

    // 履歴設定
    List<Map<String, String>> orderList = (List<Map<String, String>>) session.getAttribute("account");
    Map<String, String> orderMap = new HashMap<>();
    orderMap.put("name", customer.getName());
    orderMap.put("money", String.valueOf(money));
    orderMap.put("food", food.getName());
    orderMap.put("cook", cook.getName());
    orderList.add(orderMap);

    model.getModelMap().addAttribute("accountList", orderList);
    session.setAttribute("account", orderList);


    return model;
  }

  @RequestMapping(value = "/Eatting", params="account" , method = RequestMethod.POST)
  public ModelAndView eating() {

    List<Map<String, String>> orderList = (List<Map<String, String>>) session.getAttribute("account");

    int total = 0;
    // 合計算出
    for (Map<String, String> orderMap: orderList) {
      total +=  Integer.valueOf(orderMap.get("money"));
    }

    // Viewに渡すデータを設定
    ModelAndView mav = new ModelAndView();
    mav.getModelMap().addAttribute("accountList", orderList);
    mav.getModelMap().addAttribute("total", total);
    mav.setViewName("EatAccount");

    return mav;
  }

}
