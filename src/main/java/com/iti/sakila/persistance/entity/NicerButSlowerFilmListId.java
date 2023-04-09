package com.iti.sakila.persistance.entity;
// Generated Apr 1, 2023, 5:10:50 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * NicerButSlowerFilmListId generated by hbm2java
 */
@Embeddable
public class NicerButSlowerFilmListId  implements java.io.Serializable {
     private String actors;
     private String category;
     private String description;
     private Short fid;
     private Short length;
     private BigDecimal price;
     private String rating;
     private String title;

    public NicerButSlowerFilmListId() {
    }

	
    public NicerButSlowerFilmListId(String category) {
        this.category = category;
    }
    public NicerButSlowerFilmListId(String actors, String category, String description, Short fid, Short length, BigDecimal price, String rating, String title) {
       this.actors = actors;
       this.category = category;
       this.description = description;
       this.fid = fid;
       this.length = length;
       this.price = price;
       this.rating = rating;
       this.title = title;
    }
   


    @Column(name="actors", length=65535)
    public String getActors() {
        return this.actors;
    }
    
    public void setActors(String actors) {
        this.actors = actors;
    }


    @Column(name="category", nullable=false, length=25)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }


    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


    @Column(name="FID")
    public Short getFid() {
        return this.fid;
    }
    
    public void setFid(Short fid) {
        this.fid = fid;
    }


    @Column(name="length")
    public Short getLength() {
        return this.length;
    }
    
    public void setLength(Short length) {
        this.length = length;
    }


    @Column(name="price", precision=4, scale=2)
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Column(name="rating", length=5)
    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }


    @Column(name="title", length=128)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NicerButSlowerFilmListId) ) return false;
		 NicerButSlowerFilmListId castOther = ( NicerButSlowerFilmListId ) other; 
         
		 return ( (this.getActors()==castOther.getActors()) || ( this.getActors()!=null && castOther.getActors()!=null && this.getActors().equals(castOther.getActors()) ) )
 && ( (this.getCategory()==castOther.getCategory()) || ( this.getCategory()!=null && castOther.getCategory()!=null && this.getCategory().equals(castOther.getCategory()) ) )
 && ( (this.getDescription()==castOther.getDescription()) || ( this.getDescription()!=null && castOther.getDescription()!=null && this.getDescription().equals(castOther.getDescription()) ) )
 && ( (this.getFid()==castOther.getFid()) || ( this.getFid()!=null && castOther.getFid()!=null && this.getFid().equals(castOther.getFid()) ) )
 && ( (this.getLength()==castOther.getLength()) || ( this.getLength()!=null && castOther.getLength()!=null && this.getLength().equals(castOther.getLength()) ) )
 && ( (this.getPrice()==castOther.getPrice()) || ( this.getPrice()!=null && castOther.getPrice()!=null && this.getPrice().equals(castOther.getPrice()) ) )
 && ( (this.getRating()==castOther.getRating()) || ( this.getRating()!=null && castOther.getRating()!=null && this.getRating().equals(castOther.getRating()) ) )
 && ( (this.getTitle()==castOther.getTitle()) || ( this.getTitle()!=null && castOther.getTitle()!=null && this.getTitle().equals(castOther.getTitle()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getActors() == null ? 0 : this.getActors().hashCode() );
         result = 37 * result + ( getCategory() == null ? 0 : this.getCategory().hashCode() );
         result = 37 * result + ( getDescription() == null ? 0 : this.getDescription().hashCode() );
         result = 37 * result + ( getFid() == null ? 0 : this.getFid().hashCode() );
         result = 37 * result + ( getLength() == null ? 0 : this.getLength().hashCode() );
         result = 37 * result + ( getPrice() == null ? 0 : this.getPrice().hashCode() );
         result = 37 * result + ( getRating() == null ? 0 : this.getRating().hashCode() );
         result = 37 * result + ( getTitle() == null ? 0 : this.getTitle().hashCode() );
         return result;
   }   


}


