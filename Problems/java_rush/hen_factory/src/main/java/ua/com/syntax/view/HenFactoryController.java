package ua.com.syntax.view;

import ua.com.syntax.config.HenFactory;
import ua.com.syntax.entity.Hen;
import ua.com.syntax.interfaces.Country;

public class HenFactoryController {
    public void run() {
        Hen hen = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(hen.getDescription());
    }
}
