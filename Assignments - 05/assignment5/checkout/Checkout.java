package For_Java.assignments.assignment5.checkout;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    private List<DessertItem> list;

    public Checkout() {
        this.list = new ArrayList<DessertItem>();
    }

    public int numberOfItems() {
        if (list != null)
            return this.list.size();
        else
            return 0;
    }

    public void enterItem(DessertItem item) {
        if (item != null && this.list != null) {
            this.list.add(item);
        }
    }

    public void clear() {
        if (this.list != null)
            this.list.clear();
        else
            this.list = new ArrayList<DessertItem>();
    }

    public int totalCost() {
        int totalCost = 0;
        if (this.list != null) {
            for (int i = 0; i < list.size(); i++) {
                DessertItem item = list.get(i);
                totalCost = totalCost + item.getCost();
            }
        }
        return totalCost;
    }

    public int totalTax() {
        int totalCost = this.totalCost();
        float totalTax = (float) (totalCost * DessertShoppe.taxRate);
        return Math.round(totalTax);
    }

    @Override
    public String toString() {
        String result = "";
        String itemNameFormat = "%-" + DessertShoppe.maximumSizeForItemName + "s";
        String priceFormat = "%" + (DessertShoppe.maximumWidth - DessertShoppe.maximumSizeForItemName) + "s";
        /*String result = "Number of items: " + this.numberOfItems() + "\n";
        result += "Total cost: " + totalCost() + "\n";
        result += "Total tax: " + totalTax() + "\n";
        result += "Cost + Tax: " + (totalCost() + totalTax()) + "\n" + "\n" + "\n";*/
        result += "        " + DessertShoppe.nameOfStore + "\n";
        result += "        --------------------" + "\n";
        if (this.list != null) {
            for (int i = 0; i < list.size(); i++) {
                DessertItem item = list.get(i);
                String ss = "";
                String str = item.getName();
                str = str.replaceAll("\\s+", " ");
                str = str.trim();

                String newresult = str;
                while (newresult.length() > DessertShoppe.maximumSizeForItemName) {
                    int index = 0;
                    if (newresult.charAt(DessertShoppe.maximumSizeForItemName) == ' ')
                        index = DessertShoppe.maximumSizeForItemName - 1;
                    else
                        index = newresult.substring(0, DessertShoppe.maximumSizeForItemName).lastIndexOf(" ");
                    if (index < 0) {
                        index = DessertShoppe.maximumSizeForItemName - 1;
                    }
                    ss = ss + String.format(itemNameFormat, newresult.substring(0, index + 1)) + "\n";
                    newresult = newresult.substring(index + 1, newresult.length());
                    newresult = newresult.trim();
                }
                ss = ss + String.format(itemNameFormat, newresult);
                ss = ss + String.format(priceFormat, DessertShoppe.cents2dollarsAndCents(item.getCost())) + "\n";
                result += ss;
            }
        }
        result += "\n";
        result += String.format(itemNameFormat, "Tax");
        result += String.format(priceFormat, DessertShoppe.cents2dollarsAndCents(this.totalTax())) + "\n";
        result += String.format(itemNameFormat, "Total Cost");
        result += String.format(priceFormat, DessertShoppe.cents2dollarsAndCents(this.totalCost()+this.totalTax())) + "\n";
        return result;
    }
}
