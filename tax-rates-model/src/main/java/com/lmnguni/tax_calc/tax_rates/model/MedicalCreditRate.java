package com.lmnguni.tax_calc.tax_rates.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MedicalCreditRate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int yearOfAssessment;

    @Column
    private double primaryOwnerRebate;

    @Column
    private double firstDependantRebate;

    @Column
    private double additionalDependentRebate;

    public MedicalCreditRate() {
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

    public double getPrimaryOwnerRebate() {
        return primaryOwnerRebate;
    }

    public void setPrimaryOwnerRebate(double primaryOwnerRebate) {
        this.primaryOwnerRebate = primaryOwnerRebate;
    }

    public double getFirstDependantRebate() {
        return firstDependantRebate;
    }

    public void setFirstDependantRebate(double firstDependantRebate) {
        this.firstDependantRebate = firstDependantRebate;
    }

    public double getAdditionalDependentRebate() {
        return additionalDependentRebate;
    }

    public void setAdditionalDependentRebate(double additionalDependentRebate) {
        this.additionalDependentRebate = additionalDependentRebate;
    }
}
