package Model.Supplier;
// Generated 25-jun-2020 18:32:35 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Supplier generated by hbm2java
 */
public class Supplier  implements java.io.Serializable {


     private int id;
     private String name;
     private String country;
     private Set items = new HashSet(0);

    public Supplier() {
    }

	
    public Supplier(int id) {
        this.id = id;
    }
    public Supplier(int id, String name, String country, Set items) {
       this.id = id;
       this.name = name;
       this.country = country;
       this.items = items;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}


