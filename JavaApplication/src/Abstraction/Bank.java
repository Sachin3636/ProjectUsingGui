package Abstraction;

public abstract class Bank {

	String bname;
    String branch;
    String ifscCode;
    double balance;

    
    public Bank(String bname, String branch, String ifscCode, double balance) {
        this.bname = bname;
        this.branch = branch;
        this.ifscCode = ifscCode;
        this.balance = balance;
    }

   
    public abstract void display();

    public void show() {
        System.out.println("in concrete method");
        
    }

}
