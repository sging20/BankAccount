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
  if(amount >= 0.0 && amount <= balance){
    balance -= amount;
    return true;
  }
  if(amount < 0 || amount > balance){
  return false;
  }
  return false;
}
  public String toString(){
    return "#" + String.valueOf(accountID) +"\t"+ "$" + String.valueOf(balance);
  }
  public void setPassword(String newPass){
    password = newPass;
  }

  private boolean authenticate(String password){
  return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password){
  if(authenticate(password) && withdraw(amount) ){
    return other.deposit(amount)
    }
    else return false;
  }


}
