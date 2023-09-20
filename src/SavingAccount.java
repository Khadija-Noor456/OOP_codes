import java.util.Objects;

public class SavingAccount {
  private static double AnnualInterestRate;
  private double SavingBalance;

  SavingAccount(double SavingBalance){
    this.SavingBalance = SavingBalance;
  }
  public static void  modifyInterestRate (double newRate){
    AnnualInterestRate = newRate;

  }


  public void calcIR(){
    double IR = (SavingBalance*AnnualInterestRate)/12;
    SavingBalance+=IR;

  }
  public double getSavingBalance(){
    return SavingBalance;
  }




}










