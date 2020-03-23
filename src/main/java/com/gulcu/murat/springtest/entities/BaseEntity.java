package com.gulcu.murat.springtest.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
   // @CreatedDate
    private Date createdAt;
    @Column(name="created_by",length = 50)
    //@CreatedBy
    private String createdBy;
    @Column(name="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    //@LastModifiedDate
    private Date updatedAt;
    @Column(name="updated_by",length = 50)
    //@LastModifiedBy
    private String updatedBy;
    @Column(name="status")
    private Boolean status;

}
