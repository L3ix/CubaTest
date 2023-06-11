package com.company.prjoject.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "SUPER_PERSON")
@Entity(name = "super_Person")
@NamePattern("%s|shortName")
public class Person extends BaseIntegerIdEntity implements SoftDelete, Versioned, Creatable, Updatable {
    private static final long serialVersionUID = -3086683742035559679L;

    @Column(name = "SHORT_NAME", nullable = false)
    private String shortName;

    @Column(name = "LONG_NAME")
    private String longName;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "CREATE_TS")
    private Date createTs;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "UPDATE_TS")
    private Date updateTs;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "DELETE_TS")
    private Date deleteTs;

    @Column(name = "DELETED_BY")
    private String deletedBy;

    @Column(name = "VERSION")
    @Version
    private Integer version;



    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date date) {
        createTs = date;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean isDeleted() {
        return deleteTs == null;
    }

    public Date getDeleteTs() {
        return deleteTs;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}