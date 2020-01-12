package com.lmnguni.tax_calc.tax_rates.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class IncomeTaxRebateRate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int yearOfAssessment;

    @Column
    private int minimumAge;

    @Column
    private int maximumAge;

    @Column
    private Double rebateAmount;

    public IncomeTaxRebateRate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfAssessment() {
        return yearOfAssessment;
    }

    public void setYearOfAssessment(int yearOfAssessment) {
        this.yearOfAssessment = yearOfAssessment;
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

    public Double getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(Double rebateAmount) {
        this.rebateAmount = rebateAmount;
    }
}
