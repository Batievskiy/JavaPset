package ua.com.syntax.view;

import ua.com.syntax.config.HenFactory;
import ua.com.syntax.entity.Hen;
import ua.com.syntax.interfaces.Country;

public class HenFactoryController {
    public void run() {
        Hen hen = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(hen.getDescription());

        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen1.getDescription());

        Hen hen2 = HenFactory.getHen(Country.UKRAINE);
        System.out.println(hen2.getDescription());

        Hen hen3 = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen3.getDescription());
    }
}
