/*
 * Created on 2022-01-04 ( 14:24:59 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Datalog"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="datalog", schema="public" )
public class Datalog implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="datalogid", nullable=false)
    private Integer    datalogid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="mainnumber", length=2147483647)
    private String     mainnumber ;

    @Column(name="maintype", length=2147483647)
    private String     maintype ;

    @Column(name="subnumber", length=2147483647)
    private String     subnumber ;

    @Column(name="subtype", length=2147483647)
    private String     subtype ;

    @Column(name="status")
    private Integer    status ;

    @Column(name="remarks", length=2147483647)
    private String     remarks ;

    @Column(name="datatags", length=2147483647)
    private String     datatags ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created")
    private Date       created ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated")
    private Date       updated ;

    @Column(name="organisation_id")
    private Integer    organisationId ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public Datalog() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setDatalogid( Integer datalogid ) {
        this.datalogid = datalogid ;
    }
    public Integer getDatalogid() {
        return this.datalogid;
    }

    public void setMainnumber( String mainnumber ) {
        this.mainnumber = mainnumber ;
    }
    public String getMainnumber() {
        return this.mainnumber;
    }

    public void setMaintype( String maintype ) {
        this.maintype = maintype ;
    }
    public String getMaintype() {
        return this.maintype;
    }

    public void setSubnumber( String subnumber ) {
        this.subnumber = subnumber ;
    }
    public String getSubnumber() {
        return this.subnumber;
    }

    public void setSubtype( String subtype ) {
        this.subtype = subtype ;
    }
    public String getSubtype() {
        return this.subtype;
    }

    public void setStatus( Integer status ) {
        this.status = status ;
    }
    public Integer getStatus() {
        return this.status;
    }

    public void setRemarks( String remarks ) {
        this.remarks = remarks ;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public void setDatatags( String datatags ) {
        this.datatags = datatags ;
    }
    public String getDatatags() {
        return this.datatags;
    }

    public void setCreated( Date created ) {
        this.created = created ;
    }
    public Date getCreated() {
        return this.created;
    }

    public void setUpdated( Date updated ) {
        this.updated = updated ;
    }
    public Date getUpdated() {
        return this.updated;
    }

    public void setOrganisationId( Integer organisationId ) {
        this.organisationId = organisationId ;
    }
    public Integer getOrganisationId() {
        return this.organisationId;
    }

    //--- GETTERS FOR LINKS
    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(datalogid);
        sb.append("|");
        sb.append(mainnumber);
        sb.append("|");
        sb.append(maintype);
        sb.append("|");
        sb.append(subnumber);
        sb.append("|");
        sb.append(subtype);
        sb.append("|");
        sb.append(status);
        sb.append("|");
        sb.append(remarks);
        sb.append("|");
        sb.append(datatags);
        sb.append("|");
        sb.append(created);
        sb.append("|");
        sb.append(updated);
        sb.append("|");
        sb.append(organisationId);
        return sb.toString(); 
    } 

}
