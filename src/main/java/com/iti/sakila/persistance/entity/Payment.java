package com.iti.sakila.persistance.entity;
// Generated Apr 1, 2023, 5:10:50 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name="payment"
    ,catalog="sakila"
)
public class Payment  implements java.io.Serializable {


     private Short paymentId;
     private Staff staff;
     private Customer customer;
     private Rental rental;
     private BigDecimal amount;
     private Timestamp paymentDate;
     private Timestamp lastUpdate;

    public Payment() {
    }

	
    public Payment(Staff staff, Customer customer, BigDecimal amount, Timestamp paymentDate) {
        this.staff = staff;
        this.customer = customer;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
    public Payment(Staff staff, Customer customer, Rental rental, BigDecimal amount, Timestamp paymentDate, Timestamp lastUpdate) {
       this.staff = staff;
       this.customer = customer;
       this.rental = rental;
       this.amount = amount;
       this.paymentDate = paymentDate;
       this.lastUpdate = lastUpdate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="payment_id", unique=true, nullable=false)
    public Short getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Short paymentId) {
        this.paymentId = paymentId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="staff_id", nullable=false)
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id", nullable=false)
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rental_id")
    public Rental getRental() {
        return this.rental;
    }
    
    public void setRental(Rental rental) {
        this.rental = rental;
    }

    
    @Column(name="amount", nullable=false, precision=5, scale=2)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="payment_date", nullable=false, length=19)
    public Timestamp getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", length=19)
    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }




}


