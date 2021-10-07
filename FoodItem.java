class FoodItem{

String name;
float price;
String hotelname;
int quantity;
float rating;
Type type;
Ordertype ordertype;

FoodItem(String name,float price,String hotelname,int quantity){
	this.name=name;
	this.price=price;
	this.hotelname=hotelname;
	this.quantity=quantity;
}

FoodItem(String name,float price,float rating){
	this.name=name;
	this.price=price;
	this.rating=rating;

}

void displayDetails(){
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.hotelname);
	System.out.println(this.quantity);
	System.out.println(this.rating);
}

void TotalPrice(){
	float TotalPrice;
	TotalPrice=this.quantity*this.price;	
	System.out.println("TotalBillvalue="+TotalPrice);
}
void HotelName(){
	System.out.println(this.hotelname);
}
void NameandPrice(){
	System.out.println(this.name);
	System.out.println(this.price);
}

}
