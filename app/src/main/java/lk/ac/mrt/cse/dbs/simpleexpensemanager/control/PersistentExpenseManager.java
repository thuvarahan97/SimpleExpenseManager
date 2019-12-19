package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentTransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.ui.MainActivity;

public class PersistentExpenseManager extends ExpenseManager {

    public PersistentExpenseManager() {
        setup();
    }

    @Override
    public void setup() {

        TransactionDAO PersistentTransactionDAO = new PersistentTransactionDAO(MainActivity.getContext());
        setTransactionsDAO(PersistentTransactionDAO);

        AccountDAO PersistentAccountDAO = new PersistentAccountDAO(MainActivity.getContext());
        setAccountsDAO(PersistentAccountDAO);

        // dummy data
        Account dummyAcct1 = new Account("12345A", "Commercial Bank", "Thuvarahan", 50000.0);
        Account dummyAcct2 = new Account("98765Z", "Bank Of Ceylon", "Rajinthan", 35000.0);
        getAccountsDAO().addAccount(dummyAcct1);
        getAccountsDAO().addAccount(dummyAcct2);

        /*** End ***/
    }
}
