package com.banking.models;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Embeddable;
import javax.validation.constraints.PositiveOrZero;
import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

@Embeddable
public class Money {
    private static final Currency ESP = Currency.getInstance("ESP");
    private static final RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;
    private final Currency currency;
    private BigDecimal amount;

    /**
     * Empty class constructor
     **/
    public Money() {
        this.currency = ESP;
    }

    /**
     * Class constructor specifying amount, currency, and rounding
     **/
    public Money(BigDecimal amount, Currency currency, RoundingMode rounding) {
        this.currency = currency;
        setAmount(amount.setScale(currency.getDefaultFractionDigits(), rounding));
    }

    /**
     * Class constructor specifying amount, and currency. Uses default RoundingMode HALF_EVEN.
     **/
    public Money(BigDecimal amount, Currency currency) {
        this(amount, currency, DEFAULT_ROUNDING);
    }

    /**
     * Class constructor specifying amount. Uses default RoundingMode HALF_EVEN and default currency SUR.
     **/
    public Money(BigDecimal amount) {
        this(amount, ESP, DEFAULT_ROUNDING);
    }

    public BigDecimal increaseAmount(Money money) {
        setAmount(this.amount.add(money.amount));
        return this.amount;
    }

    public BigDecimal increaseAmount(BigDecimal addAmount) {
        setAmount(this.amount.add(addAmount));
        return this.amount;
    }

    public BigDecimal decreaseAmount(Money money) {
        setAmount(this.amount.subtract(money.getAmount()));
        return this.amount;
    }

    public BigDecimal decreaseAmount(BigDecimal addAmount) {
        setAmount(this.amount.subtract(addAmount));
        return this.amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    private void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String toString() {
        return getCurrency().getSymbol() + " " + getAmount();
    }
}