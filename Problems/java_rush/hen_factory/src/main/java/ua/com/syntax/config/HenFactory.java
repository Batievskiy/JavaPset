package ua.com.syntax.config;

import ua.com.syntax.entity.Hen;
import ua.com.syntax.entity.impl.BelarusianHen;
import ua.com.syntax.entity.impl.MoldovanHen;
import ua.com.syntax.entity.impl.RussianHenImpl;
import ua.com.syntax.entity.impl.UkrainianHen;
import ua.com.syntax.interfaces.Country;

public class HenFactory {

    public static Hen getHen(String country) {

        Hen hen = null;

        switch (country) {
            case Country.RUSSIA -> hen = new RussianHenImpl();
            case Country.UKRAINE -> hen = new UkrainianHen();
            case Country.BELARUS -> hen = new BelarusianHen();
            case Country.MOLDOVA -> hen = new MoldovanHen();
        }
        return hen;
    }
}
