package task_wealth_vally;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Policy Holder Class

class PolicyHolder {

    private String policyId;
    private String name;
    private Double investmentAmount;
    private Integer yearsInForce;

    // Constructor
    public PolicyHolder(String policyId, String name, Double investmentAmount, Integer yearsInForce) {
        this.policyId = policyId;
        this.name = name;
        this.investmentAmount = investmentAmount;
        this.yearsInForce = yearsInForce;
    }

    // Getters & Setters
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(Double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public Integer getYearsInForce() {
        return yearsInForce;
    }

    public void setYearsInForce(Integer yearsInForce) {
        this.yearsInForce = yearsInForce;
    }
}



//  main Logic Class

public class PolicyManagementApp {

    // Calculate Future Value
    public static double calculateMaturityValue(double investmentAmount, int yearsInForce) {
        return investmentAmount * Math.pow(1.08, yearsInForce);
    }

    // Find Policies above 1 lakh
    public static void findHighValuePolicies(List<PolicyHolder> policyList) {
        System.out.println("\nHigh Value Policies (Investment > 100000):");

        for (PolicyHolder holder : policyList) {
            if (holder.getInvestmentAmount() > 100000) {
                System.out.println(
                        holder.getPolicyId() + " | " + holder.getName() +
                                " | Amount: " + holder.getInvestmentAmount() +
                                " | Years: " + holder.getYearsInForce()
                );
            }
        }
    }


    //  main method, compiler always start from here so
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<PolicyHolder> list = new ArrayList<>();

        // object creation by user
        System.out.println("How many policy holders you want to enter?");
        int count = sc.nextInt();
        sc.nextLine();  // consume newline

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for Policy Holder " + i + ":");

            System.out.print("Enter Policy ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Investment Amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter Years in Force: ");
            int years = sc.nextInt();
            sc.nextLine(); //  newline

            // we can crete object
            list.add(new PolicyHolder(id, name, amount, years));
        }

        //  showig maturty valu for first polcy
        if (!list.isEmpty()) {
            PolicyHolder first = list.get(0);
            double maturity = calculateMaturityValue(first.getInvestmentAmount(), first.getYearsInForce());

            System.out.println("\nMaturity Value for " + first.getName() + ": " + maturity);
        }

        // ----------- Find policies above 1 lakh -----------
        findHighValuePolicies(list);

        sc.close();
    }
}
