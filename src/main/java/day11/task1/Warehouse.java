package day11.task1;

public class Warehouse {
    private int countOrder;
    private int balance;

    void setCountOrder(int countOrder) {this.countOrder = countOrder; }
    int getCountOrder() { return countOrder; }

    void setBalance(int balance) { this.balance = balance; }
    int getBalance() { return                                   balance; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Количество собранных заказов ").append(countOrder);
        sb.append("; Доход от доставленных заказов ").append(balance);
        return sb.toString();
    }

}
