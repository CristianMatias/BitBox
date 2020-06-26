package Model.Item;
// Generated 25-jun-2020 18:32:35 by Hibernate Tools 4.3.1


import Model.PriceReduction.Pricereduction;
import Model.Supplier.Supplier;
import Model.User.Userlogin;
import java.util.Date;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private int code;
     private Pricereduction pricereduction;
     private Supplier supplier;
     private Userlogin userlogin;
     private String description;
     private Double price;
     private String stateitem;
     private Date creationdate;

    public Item() {
    }

	
    public Item(int code) {
        this.code = code;
    }
    public Item(int code, Pricereduction pricereduction, Supplier supplier, Userlogin userlogin, String description, Double price, String stateitem, Date creationdate) {
       this.code = code;
       this.pricereduction = pricereduction;
       this.supplier = supplier;
       this.userlogin = userlogin;
       this.description = description;
       this.price = price;
       this.stateitem = stateitem;
       this.creationdate = creationdate;
    }
   
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    public Pricereduction getPricereduction() {
        return this.pricereduction;
    }
    
    public void setPricereduction(Pricereduction pricereduction) {
        this.pricereduction = pricereduction;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public Userlogin getUserlogin() {
        return this.userlogin;
    }
    
    public void setUserlogin(Userlogin userlogin) {
        this.userlogin = userlogin;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getStateitem() {
        return this.stateitem;
    }
    
    public void setStateitem(String stateitem) {
        this.stateitem = stateitem;
    }
    public Date getCreationdate() {
        return this.creationdate;
    }
    
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    @Override
    public String toString() {
        return "Item{" + "code=" + code + ", pricereduction=" + pricereduction + ", supplier=" + supplier + ", userlogin=" + userlogin + ", description=" + description + ", price=" + price + ", stateitem=" + stateitem + ", creationdate=" + creationdate + '}';
    }




}


