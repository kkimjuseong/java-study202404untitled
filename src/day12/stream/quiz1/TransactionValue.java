package day12.stream.quiz1;

public class TransactionValue {

    private final String TransactionValue;
    private final String TransactionYear;
    private final String Trader;

    public TransactionValue(Transaction transaction) {
        this.TransactionValue = String.valueOf(transaction.getValue());
        this.TransactionYear = String.valueOf(transaction.getYear());
        this.Trader = String.valueOf(transaction.getTrader());
    }


    public String getTransactionValue() {
        return TransactionValue;
    }

    public String getTransactionYear() {
        return TransactionYear;
    }

    @Override
    public String toString() {
        return "\nYear : " + TransactionYear +"\n"+
                " Value='" + TransactionValue + '\'' +
                ", Year='" + TransactionYear + '\'' +
                ", trader='" + Trader + '\'' +
                '}';
    }
}
