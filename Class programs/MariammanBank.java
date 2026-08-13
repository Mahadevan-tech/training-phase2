// ============================================================
// 1. BANK NAME
// ============================================================

// The bank name is:

// Mariamman Indian Bank

// The bank name is common to all customers.

// For example:

// Account 1 → Mariamman Indian Bank
// Account 2 → Mariamman Indian Bank
// Account 3 → Mariamman Indian Bank

// Since the bank name is common for every account, create:

//     static String bankName = "Mariamman Indian Bank";

// Do NOT create a separate bankName for every object.
// 2. CUSTOMER ACCOUNT INFORMATION
// ============================================================

// Every customer has their own account information.

// The following details must be maintained:

//     accountNumber
//     accountHolderName
//     mobileNumber
//     accountType
//     balance

// These values are different for every customer.

// Therefore, these must be NON-STATIC instance variables.


// Example:

// Customer 1:
//     Account Number : 1001
//     Account Holder : Arun
//     Mobile Number  : 9876543210
//     Account Type   : Savings
//     Balance        : Rs.25000

// Customer 2:
//     Account Number : 1002
//     Account Holder : Kumar
//     Mobile Number  : 9876501234
//     Account Type   : Current
//     Balance        : Rs.50000
// ============================================================
// 3. DATA SECURITY – PRIVATE VARIABLES
// ============================================================

// Since this is a banking application, customers should not be allowed
// to directly access or modify sensitive account information.

// Therefore, the following variables MUST be declared as private:

//     accountNumber
//     accountHolderName
//     mobileNumber
//     accountType
//     balance

// For example:

//     private int accountNumber;
//     private String accountHolderName;
//     private String mobileNumber;
//     private String accountType;
//     private double balance;


// The following type of direct access should NOT be possible:

//     account.balance = 500000;

//     account.accountNumber = 9999;

// The data should be accessed through appropriate methods.
// ============================================================
// 4. CONSTRUCTOR REQUIREMENT
// ============================================================

// When a new bank account is created, the following information is
// mandatory:

//     accountNumber
//     accountHolderName
//     mobileNumber
//     accountType
//     balance

// Therefore, use a CONSTRUCTOR to initialize these values when the
// object is created.

// The constructor should receive:

//     accountNumber
//     accountHolderName
//     mobileNumber
//     accountType
//     balance


// Example object creation:

//     BankAccount account =
//         new BankAccount(
//             1001,
//             "Arun",
//             "9876543210",
//             "Savings",
//             25000
//         );


// Do NOT create the object first and then use setters for all these
// initial values.

// The constructor should initialize the required account information.
// ============================================================
// 5. GETTER REQUIREMENT
// ============================================================

// The bank allows customers to VIEW their account information.

// Therefore, create getter methods for the required private variables.

// Create methods such as:

//     getAccountNumber()
//     getAccountHolderName()
//     getMobileNumber()
//     getAccountType()
//     getBalance()

// These methods should return the corresponding values.

// Example:

//     System.out.println(account.getBalance());


// The following should NOT be used:

//     account.balance


// because balance is private.

// ============================================================
// 6. SETTER REQUIREMENT
// ============================================================

// The customer is allowed to update their MOBILE NUMBER.

// Therefore, create:

//     setMobileNumber(String mobileNumber)

// Example:

//     account.setMobileNumber("9999999999");


// After updating, the new mobile number should be displayed using:

//     getMobileNumber()


// ============================================================
// 7. IMPORTANT – DO NOT CREATE SETTERS FOR EVERYTHING
// ============================================================

// Do NOT blindly create setters for every variable.

// The following variables should NOT have setters:

//     accountNumber
//     balance
//     accountType

// Reason:

// ACCOUNT NUMBER:
// The account number is assigned by the bank and should not be changed
// by the customer.

// BALANCE:
// The customer should not directly set the balance.

// For example, this should NOT be allowed:

//     account.setBalance(500000);

// The balance should change only through proper banking operations such
// as:

//     deposit()
//     withdraw()


// ACCOUNT TYPE:
// The account type is decided when the account is created and should
// not be directly changed by the customer.


class MariammanBank {
    static String bankname="Mariamman Indian Bank";
    private int accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    MariammanBank(int accountNumber,String accountHolderName,long mobileNumber,String accountType,double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.mobileNumber=mobileNumber;
        this.accountType=accountType;
        this.balance=balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public long getMobileNumber()
    {
        return mobileNumber;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setMobileNumber(long mobileNumber)
    {
        this.mobileNumber=mobileNumber;
    }

    public void deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Invalid Amount");
            return;
        }
        balance+=amount;
        System.out.println("Deposited Amount : "+amount);
        System.out.println("Updated Balance : "+balance);
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance-=amount;
            System.out.println("Withdrawn Amount : "+amount);
            System.out.println("Updated Balance : "+balance);
        }
    }
    

    




}
