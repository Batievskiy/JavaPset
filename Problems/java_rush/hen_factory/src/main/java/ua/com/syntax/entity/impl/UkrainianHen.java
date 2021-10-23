package ua.com.syntax.entity.impl;

import ua.com.syntax.entity.Hen;
import ua.com.syntax.interfaces.Country;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 222;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" from %s. I produce %d eggs per month >---\n",
                Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
