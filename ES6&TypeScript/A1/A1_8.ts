class Account {
    [x: string]: any;
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
class SavingAccount extends Account {
    constructor(id, name, balance, interest) {
        super(id, name, balance);
        this.interest = interest;
    }
}
class CurrentAccount extends Account {
    constructor(id, name, balance, cashCredit) {
        super(id, name, balance);
        this.cashCredit = cashCredit;
    }
}
let totalBankBalance = (...accounts) => {
    let totalBalance = 0;
    accounts.forEach((singleAccount) => {
        if (singleAccount.constructor.name === "SavingAccount") {
            totalBalance =
                totalBalance + singleAccount.balance + singleAccount.interest;
        }
        else {
            totalBalance += singleAccount.balance;
            totalBalance -= singleAccount.cashCredit;
        }
    });
    return totalBalance;
};
const account1 = new SavingAccount(12345678, "Ganesh", 50000, 10000);
const account2 = new CurrentAccount(12345677, "Venkat", 50000, 10000);
const account3 = new SavingAccount(12345676, "bala", 70000, 20000);
console.log("Total Balance in Bank is: " +
    totalBankBalance(account1, account2, account3));