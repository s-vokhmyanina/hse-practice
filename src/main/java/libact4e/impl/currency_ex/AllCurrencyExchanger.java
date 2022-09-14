package libact4e.impl.currency_ex;

import libact4e.Setoid;

import java.util.Iterator;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class AllCurrencyExchanger<CurrencyExchanger> implements Setoid<CurrencyExchanger> {

    @Override
    public boolean contains(CurrencyExchanger x) {
        return false;
    }

    @Override
    public Iterator<CurrencyExchanger> iterator() {
        return null;
    }
}