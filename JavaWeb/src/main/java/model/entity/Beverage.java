package model.entity;

// 飲料實體(entity)
public class Beverage {
	// 原始資料
	private String userName;
	private String email;
	private String orderDate;
	private String amount;
	private String beverageName;
	private String ice;
	private String sugar;
	private String[] additionalArray;
	private String memo;
	// 加值資料(計算飲料價格)
	private int totalPrice;
	// ----------------------------------
	public Beverage(String userName, String email, String orderDate, String amount, String beverageName, String ice,
			String sugar, String[] additionalArray, String memo, int totalPrice) {
		super();
		this.userName = userName;
		this.email = email;
		this.orderDate = orderDate;
		this.amount = amount;
		this.beverageName = beverageName;
		this.ice = ice;
		this.sugar = sugar;
		this.additionalArray = additionalArray;
		this.memo = memo;
		this.totalPrice = totalPrice;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBeverageName() {
		return beverageName;
	}
	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}
	public String getIce() {
		return ice;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	public String getSugar() {
		return sugar;
	}
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	public String[] getAdditionalArray() {
		return additionalArray;
	}
	public void setAdditionalArray(String[] additionalArray) {
		this.additionalArray = additionalArray;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
