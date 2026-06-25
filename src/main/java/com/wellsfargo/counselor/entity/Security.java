package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private int quantity;

    protected Security() {}

    public Security(Account account, String securityName, String category, Date purchaseDate, float purchasePrice, int quantity) {
        this.account = account;
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() { return securityId; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    public String getSecurityName() { return securityName; }
    public void setSecurityName(String securityName) { this.securityName = securityName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Date getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }

    public float getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}