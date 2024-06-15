package app;

public class OutputFormatter {

    // Виправте функціонал методу
    public String getOutputData(Buyer buyer) {
        return "Buyer: " + buyer.getFirstName() +
                " " + buyer.getLastName() +
                ", phone " + buyer.getPhone();
    }
}
