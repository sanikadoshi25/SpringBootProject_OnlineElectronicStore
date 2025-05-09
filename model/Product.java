//package com.estore.model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//public class Product {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//
//	@Column(length = 500)
//	private String title;
//
//	@Column(length = 5000)
//	private String description;
//
////	private String category;
//	
//	@ManyToOne
//    @JoinColumn(name = "category_id", referencedColumnName = "id")
//    private Category category;
//
//
//	private Double price;
//
//	private int stock;
//
//	private String image;
//
//	private int discount;
//	
//	private Double discountPrice;
//	
//	private Boolean isActive;
//
//	public Product(Integer id, String title, String description, Category category, Double price, int stock,
//			String image, int discount, Double discountPrice, Boolean isActive) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.description = description;
//		this.category = category;
//		this.price = price;
//		this.stock = stock;
//		this.image = image;
//		this.discount = discount;
//		this.discountPrice = discountPrice;
//		this.isActive = isActive;
//	}
//
//	public Product() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Category getCategory() {
//		return category;
//	}
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}
//
//	public Double getPrice() {
//		return price;
//	}
//
//	public void setPrice(Double price) {
//		this.price = price;
//	}
//
//	public int getStock() {
//		return stock;
//	}
//
//	public void setStock(int stock) {
//		this.stock = stock;
//	}
//
//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//	public int getDiscount() {
//		return discount;
//	}
//
//	public void setDiscount(int discount) {
//		this.discount = discount;
//	}
//
//	public Double getDiscountPrice() {
//		return discountPrice;
//	}
//
//	public void setDiscountPrice(Double discountPrice) {
//		this.discountPrice = discountPrice;
//	}
//
//	public Boolean getIsActive() {
//		return isActive;
//	}
//
//	public void setIsActive(Boolean isActive) {
//		this.isActive = isActive;
//	}
//	
//	
//	
////	
////	// Constructors
////    public Product() {}
////
////    public Product(Integer id, String title, String description, String category, Double price, int stock,
////                   String image, int discount, Double discountPrice, Boolean isActive) {
////        this.id = id;
////        this.title = title;
////        this.description = description;
////        this.category = category;
////        this.price = price;
////        this.stock = stock;
////        this.image = image;
////        this.discount = discount;
////        this.discountPrice = discountPrice;
////        this.isActive = isActive;
////    }
////
////    // Getters and Setters
////    public Integer getId() {
////        return id;
////    }
////
////    public void setId(Integer id) {
////        this.id = id;
////    }
////
////    public String getTitle() {
////        return title;
////    }
////
////    public void setTitle(String title) {
////        this.title = title;
////    }
////
////    public String getDescription() {
////        return description;
////    }
////
////    public void setDescription(String description) {
////        this.description = description;
////    }
////
////    public String getCategory() {
////        return category;
////    }
////
////    public void setCategory(String category) {
////        this.category = category;
////    }
////
////    public Double getPrice() {
////        return price;
////    }
////
////    public void setPrice(Double price) {
////        this.price = price;
////    }
////
////    public int getStock() {
////        return stock;
////    }
////
////    public void setStock(int stock) {
////        this.stock = stock;
////    }
////
////    public String getImage() {
////        return image;
////    }
////
////    public void setImage(String image) {
////        this.image = image;
////    }
////
////    public int getDiscount() {
////        return discount;
////    }
////
////    public void setDiscount(int discount) {
////        this.discount = discount;
////    }
////
////    public Double getDiscountPrice() {
////        return discountPrice;
////    }
////
////    public void setDiscountPrice(Double discountPrice) {
////        this.discountPrice = discountPrice;
////    }
////
////    public Boolean getIsActive() {
////        return isActive;
////    }
////
////    public void setIsActive(Boolean isActive) {
////        this.isActive = isActive;
////    }
//	
//}

package com.estore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 500)
	private String title;

	@Column(length = 5000)
	private String description;

	private String category;

	private Double price;

	private int stock;

	private String image;

	private int discount;
	
	private Double discountPrice;
	
	private Boolean isActive;
	
	
	// Constructors
    public Product() {}

    public Product(Integer id, String title, String description, String category, Double price, int stock,
                   String image, int discount, Double discountPrice, Boolean isActive) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.image = image;
        this.discount = discount;
        this.discountPrice = discountPrice;
        this.isActive = isActive;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
	
}