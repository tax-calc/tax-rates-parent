package com.lmnguni.tax_calc.tax_rates.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MedicalCreditRate extends BaseEntity implements Serializable {

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
