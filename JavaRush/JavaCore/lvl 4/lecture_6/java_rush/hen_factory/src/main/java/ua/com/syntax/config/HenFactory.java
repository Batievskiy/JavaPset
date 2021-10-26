package ua.com.syntax.config;

import ua.com.syntax.entity.Hen;
import ua.com.syntax.entity.impl.BelarusianHenImpl;
import ua.com.syntax.entity.impl.MoldovanHenImpl;
import ua.com.syntax.entity.impl.RussianHenImpl;
import ua.com.syntax.entity.impl.UkrainianHen;
import ua.com.syntax.interfaces.Country;

public class HenFactory {

    public static Hen getHen(String country) {

        Hen hen = null;

        switch (country) {
            case Country.RUSSIA -> hen = new RussianHenImpl();
            case Country.UKRAINE -> hen = new UkrainianHen();
            case Country.BELARUS -> hen = new BelarusianHenImpl();
            case Country.MOLDOVA -> hen = new MoldovanHenImpl();
        }
        return hen;
    }
}
