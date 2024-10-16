package com.Model;

public class ProductModel1 {
	private long  ProductId;
	private String ProductName;
	private int ProductQuanty;
	private double ProductPrice;
	private String mfgDate;
	private String expDate;
	
	public ProductModel1() {
		// TODO Auto-generated constructor stub
	}

	public ProductModel1(long productId, String productName, int productQuanty, double productPrice, String mfgDate,
			String expDate) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductQuanty = productQuanty;
		ProductPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}

	public ProductModel1(long productId, String productName) {
		super();
		ProductId = productId;
		ProductName = productName;
	}

	public ProductModel1(long productId) {
		super();
		ProductId = productId;
	}

	public long getProductId() {
		return ProductId;
	}

	public void setProductId(long productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductQuanty() {
		return ProductQuanty;
	}

	public void setProductQuanty(int productQuanty) {
		ProductQuanty = productQuanty;
	}

	public double getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "ProductModel [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductQuanty="
				+ ProductQuanty + ", ProductPrice=" + ProductPrice + ", mfgDate=" + mfgDate + ", expDate=" + expDate
				+ "]";
	}
	
}
