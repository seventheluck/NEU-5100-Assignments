package assignments.assignment6.b;

public class CheckingAccount extends Account {
    public CheckingAccount(String fname, String lname, double cb) {
        super(fname, lname, cb);
    }

    @Override
    public double DebitTransaction(double debitAmount) {
        double curBalance = super.DebitTransaction(debitAmount);
        if (curBalance < Setting.minBalance) {
            this.ChargeFee();
        }
        return CurBalance;
    }

    @Override
    public double CreditTransaction(double creditAmount) {
        double curBalance = super.CreditTransaction(creditAmount);
        if (curBalance < Setting.minBalance) {
            this.ChargeFee();
        }
        return CurBalance;
    }

    private void ChargeFee() {
        CurBalance -= Setting.fee;
    }
}
