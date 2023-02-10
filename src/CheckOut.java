import java.math.BigDecimal;

public class CheckOut {
    private BigDecimal monthIncome;
    private BigDecimal expenses;
    private BigDecimal dailyIncomes;
    private BigDecimal finalMonth;

    public BigDecimal getFinalMonth() {
        return finalMonth;
    }

    public void setFinalMonth(BigDecimal finalMonth) {
        this.finalMonth = finalMonth;
    }

    public BigDecimal getDailyIncomes() {
        return dailyIncomes;
    }

    public void setDailyIncomes(BigDecimal dailyIncomes) {
        this.dailyIncomes = dailyIncomes;
    }

    public BigDecimal getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(BigDecimal monthIncome) {
        this.monthIncome = monthIncome;
    }

    public BigDecimal getExpenses() {
        return expenses;
    }

    public void setExpenses(BigDecimal expenses) {
        this.expenses = expenses;
    }
}
