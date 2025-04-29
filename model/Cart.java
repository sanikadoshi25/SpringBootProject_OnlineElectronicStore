package com.estore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private UserDtls user;

	@ManyToOne
	private Product product;

	private Integer quantity;
	
	@Transient
	private Double totalPrice;
	
	@Transient
	private Double totalOrderPrice;
	
	 public Cart() {}

	    public Cart(Integer id, UserDtls user, Product product, Integer quantity, Double totalPrice, Double totalOrderPrice) {
	        this.id = id;
	        this.user = user;
	        this.product = product;
	        this.quantity = quantity;
	        this.totalPrice = totalPrice;
	        this.totalOrderPrice = totalOrderPrice;
	    }

	    // Getters and Setters
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public UserDtls getUser() {
	        return user;
	    }

	    public void setUser(UserDtls user) {
	        this.user = user;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public void setProduct(Product product) {
	        this.product = product;
	    }

	    public Integer getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(Integer quantity) {
	        this.quantity = quantity;
	    }

	    public Double getTotalPrice() {
	        return (product != null && quantity != null) ? quantity * product.getDiscountPrice() : 0.0;
	    }

	    public void setTotalPrice(Double totalPrice) {
	        this.totalPrice = totalPrice;
	    }

	    public Double getTotalOrderPrice() {
	        return totalOrderPrice;
	    }

	    public void setTotalOrderPrice(Double totalOrderPrice) {
	        this.totalOrderPrice = totalOrderPrice;
	    }
}
