class Ipodrunner{
public static void main (String args[]){

Ipod ipod =new Ipod();
ipod.name = "nokia";
ipod.colour = "black";
ipod.Brand = "apple";
ipod.price = 100.0f;
ipod.types = Ipodtypes.Ipodmini;


Ipod ipod1 = new Ipod();
ipod1.name = "Samsung";
ipod1.colour = "blue";
ipod1.Brand = "apple";
ipod1.price = 200.0f;
ipod1.types = Ipodtypes.Ipodshuffle;

ipod.Apple();
ipod1.Apple();
}
}
