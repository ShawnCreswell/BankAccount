public class TestBank{
    public static void main(String[] args){
        BankAccount newBank = new BankAccount(45.67, 39.00);
        System.out.println(newBank.getAccountNumber());
        BankAccount.displayTotalMoney();

        double checkingBalance = newBank.getCheckingBalance();
        System.out.printf("checking: $%.2f\n", checkingBalance);

        double savingsBalance = newBank.getSavingBalance();
        System.out.printf("saving: $%.2f\n", savingsBalance);

        System.out.println("--------------------------------------------");
        System.out.println("You deposited 750.00 into Checking Account");
        newBank.depositMoney("checking", 750.00);
        System.out.println("--------------------------------------------");

        newBank.seeTotalBalance();
        System.out.println("--------------------------------------------");
        System.out.println("You made a withdraw of 250.00 from Checking Account");
        newBank.withdrawMoney("checking",250);
        System.out.println("--------------------------------------------");
        newBank.seeTotalBalance();






//        newBank.depositMoney("savings",1200);
//        double savingsBalance = newBank.getSavingBalance();
//        double checkingBalance = newBank.getCheckingBalance();
//        System.out.printf("saving: $%.2f\n", savingsBalance);
//        System.out.printf("checking: $%.2f\n", checkingBalance);
//        BankAccount.displayTotalMoney();


    }
}