How to Run the Project using IntelliJ IDEA

Step 1: Create a Java Project
Open IntelliJ IDEA
Click File → New → Project

Make sure a JDK is selected under Project SDK
Click Next → Next → Finish
Note: This is a plain Java application, not a Spring Boot project.

Step 2: Create Package and Class
In the Project window, right-click src → New → Package

Name the package: task_wealth_vally

Right-click the package → New → Java Class
Name the class: PolicyManagementApp

You can keep the PolicyHolder class inside the same file or create a separate file for it.

Step 3: Paste the Code
Copy and paste your complete Java program into PolicyManagementApp.java

Ensure the package name at the top is:


package task_wealth_vally;

Step 4: Build the Project
Click Build → Build Project
Fix any compilation errors if shown.

Step 5: Run the Program
Click the green Run button next to the main() method
OR
Right-click PolicyManagementApp.java → Run 'PolicyManagementApp.main()'

Program Flow
The program performs the following operations:
Accepts number of policy holders from the user

Takes policy details as input:

Policy ID

Holder Name

Investment Amount

Years in Force

Calculates maturity value for the first policy holder
Displays all policies whose investment amount is greater than 100,000





Sample Input


How many policy holders you want to enter?
2

Enter details for Policy Holder 1:
Enter Policy ID: P001
Enter Name: Alice
Enter Investment Amount: 120000
Enter Years in Force: 5

Enter details for Policy Holder 2:
Enter Policy ID: P002
Enter Name: Bob
Enter Investment Amount: 90000
Enter Years in Force: 3


Sample Output



Maturity Value for Alice: 176580.83

High Value Policies (Investment > 100000):
P001 | Alice | Amount: 120000.0 | Years: 5