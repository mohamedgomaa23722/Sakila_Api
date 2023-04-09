package com.iti.sakila.persistance.entity;
// Generated Apr 1, 2023, 5:10:50 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * FilmCategoryId generated by hbm2java
 */
@Embeddable
public class FilmCategoryId  implements java.io.Serializable {


     private byte categoryId;
     private short filmId;

    public FilmCategoryId() {
    }

    public FilmCategoryId(byte categoryId, short filmId) {
       this.categoryId = categoryId;
       this.filmId = filmId;
    }
   


    @Column(name="category_id", nullable=false)
    public byte getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(byte categoryId) {
        this.categoryId = categoryId;
    }


    @Column(name="film_id", nullable=false)
    public short getFilmId() {
        return this.filmId;
    }
    
    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FilmCategoryId) ) return false;
		 FilmCategoryId castOther = ( FilmCategoryId ) other; 
         
		 return (this.getCategoryId()==castOther.getCategoryId())
 && (this.getFilmId()==castOther.getFilmId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCategoryId();
         result = 37 * result + this.getFilmId();
         return result;
   }   


}


