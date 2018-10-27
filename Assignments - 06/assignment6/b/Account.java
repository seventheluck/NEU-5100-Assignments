package assignments.assignment6.b;

public class Account {

    protected String FirstName;
    protected String LastName;
    protected double CurBalance;

    public Account(String fname, String lname, double curbalance) {
        this.FirstName = fname;
        this.LastName = lname;
        this.CurBalance = curbalance;
    }

    public String getAcctType() {
        return "Account";
    }

    public double DebitTransaction(double debitAmount) {
        this.CurBalance -= debitAmount;
        return this.CurBalance;
    }

    public double CreditTransaction(double creditAmount) {
        this.CurBalance += creditAmount;
        return this.CurBalance;
    }

    public String toString() {
        String result = "Account name: " + this.FirstName + " " + this.LastName + ", Account Type: " + this.getAcctType() + ", Balance $" + this.CurBalance;
        return result;
    }

}
