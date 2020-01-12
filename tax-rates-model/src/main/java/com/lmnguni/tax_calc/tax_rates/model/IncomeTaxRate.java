package com.lmnguni.tax_calc.tax_rates.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class IncomeTaxRate implements Serializable, Comparable<IncomeTaxRate> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int yearOfAssignment;

    @Column
    private Double minimumAmount;

    @Column
    private Double maximumAmount;

    @Column
    private int minimumAge;

    @Column
    private int maximumAge;

    @Column
    private Double percentage;

    public IncomeTaxRate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfAssignment() {
        return yearOfAssignment;
    }

    public void setYearOfAssignment(int yearOfAssignment) {
        this.yearOfAssignment = yearOfAssignment;
    }

    public Double getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(Double minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public Double getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(Double maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(int maximumAge) {
        this.maximumAge = maximumAge;
    }

    @Override
    public int compareTo(IncomeTaxRate incomeTaxRate) {
        return this.minimumAmount.compareTo(incomeTaxRate.minimumAmount);
    }
}
