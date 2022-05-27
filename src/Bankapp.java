import java.util.LinkedList;
        import java.util.List;

public class Bankapp {
    public interface InterestRate {
        default double getbaserate() {
            return 2.5;
        }
    }
    public abstract static class Account implements InterestRate {
        private String name;
        private String pin;
        private double balance;
        protected static int index =2000;
        protected String Accountnumber;
        protected  double rate;

        public Account(String name,String pin, double initial_deposit) {
            this.name=name;
            this.pin=pin;
            balance=initial_deposit+100;
            index++;
            this.Accountnumber=setaccountnumber();
            setrate();
        }

        public abstract void setrate();

        private String setaccountnumber() {
            String lastwopin = pin.substring(pin.length()-3,pin.length());
            int uniqueID=index;
            int randnum = (int) ((int) Math.random()*Math.pow(10,3));
            return lastwopin+uniqueID+randnum;
        }

        public void compoundInterest() {
            double interest = balance*(rate/100);
            balance=balance+interest;
            System.out.println("Interest: "+interest);
            balance();
        }

        public void deposit(double amount) {
            balance=balance+amount;
            System.out.println("Depositing: "+amount);
            balance();
        }

        public void withdraw(double amount) {
            balance=balance+
        }
    }
}



