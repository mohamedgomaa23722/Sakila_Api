package com.iti.sakila.persistance.entity;
// Generated Apr 1, 2023, 5:10:50 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * FilmList generated by hbm2java
 */
@Entity
@Table(name="film_list"
    ,catalog="sakila"
)
public class FilmList  implements java.io.Serializable {


     private FilmListId id;

    public FilmList() {
    }

    public FilmList(FilmListId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="actors", column=@Column(name="actors", length=65535) ), 
        @AttributeOverride(name="category", column=@Column(name="category", nullable=false, length=25) ), 
        @AttributeOverride(name="description", column=@Column(name="description", length=65535) ), 
        @AttributeOverride(name="fid", column=@Column(name="FID") ), 
        @AttributeOverride(name="length", column=@Column(name="length") ), 
        @AttributeOverride(name="price", column=@Column(name="price", precision=4, scale=2) ), 
        @AttributeOverride(name="rating", column=@Column(name="rating", length=5) ), 
        @AttributeOverride(name="title", column=@Column(name="title", length=128) ) } )
    public FilmListId getId() {
        return this.id;
    }
    
    public void setId(FilmListId id) {
        this.id = id;
    }




}


