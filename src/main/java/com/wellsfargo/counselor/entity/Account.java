package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private long accountId;

    @Column(nullable = false)
    private String accountType;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Security> securities;

    protected Account() {}

    public Account(String accountType, Advisor advisor) {
        this.accountType = accountType;
        this.advisor = advisor;
    }

    public Long getAccountId() { return accountId; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }

    public List<Security> getSecurities() { return securities; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}
