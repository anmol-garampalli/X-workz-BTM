class CurrencyStarter{
public static void main(String Nagappa[]){

Currency ref = new Currency();
ref.name="Euro";
ref.countrys="Germany";
ref.value=12000;
ref.displayDetails();

ref.country=new Countrys();
Countrys country=ref.countrys;

country.name="Germany";
country.code=4310;
country.displayDetails();


}



}