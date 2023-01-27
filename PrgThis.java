/* Java Program to use this
* User: Narjis Fatima
* Date:1/27/2023*/

public class PrgThis {
    String name;
    private String password;
    double balance;

    public static void main(String[] args) {

        PrgThis myAccount = new PrgThis("John Abraham Joseph ", "SID10025", 100.50);
        System.out.println("Name : " + myAccount.name + " Balance amount: " +  myAccount.balance);

    }

    public PrgThis(String initName, String initPass, double initBalance) {
        this.name = initName;
        this.password = initPass;
        this.balance = initBalance;
    }
}
