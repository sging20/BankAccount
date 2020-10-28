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

public double getBalance(){
  return balance;
}


public String getPassword(){
  return password;
}

public boolean deposit(double amount){
  if(amount >= 0.0){
    balance += amount;
    return true;
  }
  else return false;
}

public boolean withdraw(double amount){
  if(amount > 0 && amount <= balance){
    balance -= amount;
    return true;
  }
  else return true;
  }
  public String toString(){
    return String.valueOf(accountID) +"\t"+String.valueOf(balance);
  }
}
