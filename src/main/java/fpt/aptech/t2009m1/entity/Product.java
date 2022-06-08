package fpt.aptech.t2009m1.entity;

import fpt.aptech.t2009m1.entity.base.BaseEntity;
import fpt.aptech.t2009m1.entity.myEnum.ProductStatus;
import fpt.aptech.t2009m1.util.ValidationRegexHelper;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Product extends BaseEntity {
    private int id;
    private String name;
    private String description;
    private String detail;
    private double price;
    private String thumbnail;
    private String manufactureEmail;
    private String manufacturePhone;
    private HashMap<String,String> errors;
    public Product(int id, String name, String description, String detail, Double price, String thumbnail, String manufactureEmail, String manufacturePhone, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, ProductStatus status) {
        this.name = "";
        this.description = "";
        this.detail = "";
        this.price = 0.0;
        this.thumbnail = "";
        this.manufactureEmail = "";
        this.manufacturePhone = "";
        errors = new HashMap<>();
    }
    public Product(int id, String name, String description, String detail, double price, String thumbnail, String manufactureEmail, String manufacturePhone, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, ProductStatus productStatus) {
        super(createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy, productStatus);
        this.id = id;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.price = price;
        this.thumbnail = thumbnail;
        this.manufactureEmail = manufactureEmail;
        this.manufacturePhone = manufacturePhone;
        errors = new HashMap<>();
    }

    public Product(int id, String name, String description, String detail, double price, String thumbnail, String manufactureEmail, String manufacturePhone, HashMap<String, String> errors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.price = price;
        this.thumbnail = thumbnail;
        this.manufactureEmail = manufactureEmail;
        this.manufacturePhone = manufacturePhone;
        this.errors = errors;
    }
    public Product(String name, String description, String detail, double price, String thumbnail, String manufactureEmail, String manufacturePhone) {
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.price = price;
        this.thumbnail = thumbnail;
        this.manufactureEmail = manufactureEmail;
        this.manufacturePhone = manufacturePhone;
        errors = new HashMap<>();
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getManufactureEmail() {
        return manufactureEmail;
    }

    public void setManufactureEmail(String manufactureEmail) {
        this.manufactureEmail = manufactureEmail;
    }

    public String getManufacturePhone() {
        return manufacturePhone;
    }

    public void setManufacturePhone(String manufacturePhone) {
        this.manufacturePhone = manufacturePhone;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(HashMap<String, String> errors) {
        this.errors = errors;
    }
    public boolean isValid() {
        return this.checkValid();
    }

    public boolean checkValid() {
        if(name == "" || name == null) {
            errors.put("name", "Please enter Name");
        }
        if(price == 0) {
            errors.put("price", "Please enter Price");
        }
        if(thumbnail == "" || thumbnail == null) {
            errors.put("thumbnail", "Please enter Thumbnail");
        }
        if(manufactureEmail == "" || manufactureEmail == null) {
            errors.put("manufactureEmail", "Please enter  Email");
        }
        if(manufacturePhone == "" || manufacturePhone == null) {
            errors.put("manufacturePhone", "Please enter  Phone");
        }
        if(manufactureEmail != "" && !ValidationRegexHelper.validateEmail(manufactureEmail)) {
            errors.put("manufactureEmail", "error email");
        }
        if(manufacturePhone != "" && !ValidationRegexHelper.validatePhone(manufacturePhone)) {
            errors.put("manufacturePhone", "Eror phone number");
        }
        return errors.size() == 0;
    }
}
