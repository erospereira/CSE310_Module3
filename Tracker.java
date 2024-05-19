public interface Tracker {
    void addExpense(String name, double amount);
    void displayExpenses();
    double calculateTotal();
}
