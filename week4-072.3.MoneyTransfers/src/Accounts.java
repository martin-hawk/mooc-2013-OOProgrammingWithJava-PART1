
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account aAccount = new Account("A account", 100);
        Account bAccount = new Account("B account", 0);
        Account cAccount = new Account("C account", 0);

        transfer(aAccount, bAccount, 50);
        transfer(bAccount, cAccount, 25);
        
        System.out.println(aAccount);
        System.out.println(bAccount);
        System.out.println(cAccount);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
