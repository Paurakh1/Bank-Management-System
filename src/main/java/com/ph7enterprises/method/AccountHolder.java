/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ph7enterprises.method;

/**
 *
 * @author ace
 */
public class AccountHolder {
    private String accountId; 
    private String name;
    private String currentBalance;
    private String phoneNum; 
    private String address; 
    private String accountType; 
    private String eWallet; 
    private String opeaningDate; 
    private String accStatus; 
    private String totalTransaction;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String geteWallet() {
        return eWallet;
    }

    public void seteWallet(String eWallet) {
        this.eWallet = eWallet;
    }

    public String getOpeaningDate() {
        return opeaningDate;
    }

    public void setOpeaningDate(String opeaningDate) {
        this.opeaningDate = opeaningDate;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public String getTotalTransaction() {
        return totalTransaction;
    }

    public void setTotalTransaction(String totalTransaction) {
        this.totalTransaction = totalTransaction;
    }

    
    
    
     @Override
    public String toString() {
        return "Student{" + "id=" + accountId +", opeaningDate=" + opeaningDate  + ", name=" + name + ", module=" + currentBalance +" ,PhoneNo."+ phoneNum +",address"+address+",accountType"+accountType+",totalTransaction"+totalTransaction+",account Status"+accStatus+",eWallet"+eWallet+'}';
    } 
  
}


