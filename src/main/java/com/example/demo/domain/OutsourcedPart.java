package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("2")
public class OutsourcedPart extends Part{
String companyName;
int partId;

    public OutsourcedPart() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPartId() {
    return partId;
}
    public void setPartId(int partId) {
    this.partId = partId;
}
}
