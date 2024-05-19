import java.util.ArrayList;

public class ExpenseTracker implements Tracker {
    private ArrayList<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    @Override
    public void addExpense(String name, double amount) {
        expenses.add(new Expense(name, amount));
    }

    @Override
    public void displayExpenses() {
        System.out.println("Expenses:");
        for (Expense expense : expenses) {
            System.out.println("Name: " + expense.getName() + ", Amount: $" + expense.getAmount());
        }
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
}
