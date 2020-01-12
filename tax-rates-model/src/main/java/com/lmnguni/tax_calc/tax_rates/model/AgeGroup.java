package com.lmnguni.tax_calc.tax_rates.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AgeGroup {

    @Column
    private Integer minimumAge;

    @Column
    private Integer maximumAge;

    public Integer getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

    public Integer getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(Integer maximumAge) {
        this.maximumAge = maximumAge;
    }
}
