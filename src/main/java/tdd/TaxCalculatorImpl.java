package tdd;

import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class TaxCalculatorImpl implements TaxCalculator {
    private final MaamResolver maamResolver;

    @Override
    public Money addMaam(Money money) {
        double maam = maamResolver.getMaam();
//        double maam = MaamResolverSingleton.getInstance().getMaam();
        return new Money(maam * money.getAmount()+money.getAmount());
    }
}
