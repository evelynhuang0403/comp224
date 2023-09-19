public class Account {
    public String number;
    private String type; // default value of null
    private float balance;//primitive type have a default value of 0

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Account(String type, float balance){
        this.type = type;
        this.balance = balance;
    }

    public void increaseBalance(float add){
        this.balance = this.balance + add;
    }

    public float decreaseBalance(float num){
        this.balance -= num;
        return this.balance;
    }

    public Account(String number, String type, float balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public void print(){
        System.out.println("**************");
        System.out.println("Number: " + number);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + balance);
        System.out.println("**************");
    }
}
