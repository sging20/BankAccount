public class BankAccount{
// Instance Variables
private int accountID;
private double balance;
private String password;


public BankAccount(int a, String p){
  //initialize
  accountID = a;
  balance= 0;
  password= p;
}
//method
public int getAccountID(){
  return accountID;
}

}
