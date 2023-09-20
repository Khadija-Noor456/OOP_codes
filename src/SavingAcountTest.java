public class SavingAcountTest {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.0);
        SavingAccount saver2 = new SavingAccount(3000.0);

        SavingAccount.modifyInterestRate(0.03);

        saver1.calcIR();
        saver2.calcIR();



    }

}

    }

