class rectangle1
{
 int length;
 int breadth;
rectangle1(int p, int q)
{
 length=p;
 breadth=q;
}
int area()
{
 return(length*breadth);
}
}
class cuboid extends rectangle1
{
 int height;
 cuboid(int p, int q, int r)
{
 super(p,q);
 height=r;
}
int volume()
{
 return(length*breadth*height);
}
}
class Inheritance3
{
 public static void main(String args[])
{
 cuboid c1=new cuboid(15,10,8);
 int area1=c1.area();
 int volume1=c1.volume();
 System.out.println("The Area of Rectangle:"+area1);
 System.out.println("The Volume of Cuboid:"+volume1);
}
}
