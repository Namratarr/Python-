import java.util.Scanner;

class ArrayOperation
{
  int length;
  int[] Arr;
  Scanner sc1 = new Scanner(System.in);

  ArrayOperation(int no)
  {
    this.length= no;
    Arr = new int[no];
  }

  void Accept()
  {
    System.out.println("Enter the Elements in Array");
    for(int i=0;i<length;i++)
    {
      System.out.println("Enter Element: "+(i+1));
      Arr[i]=sc1.nextInt();
    }

  }

  void Display()
  {
    System.out.println("Array Elements are: ");
    for(int i=0;i<length;i++)
    {
      System.out.println(Arr[i]);
    }
  }

  int maxEle()
  {
    int max=0;
    for(int i=0;i<length;i++)
    {
      if(Arr[i]>max)
      {
        max=Arr[i];
      }

    }
    return max;
  }

  int minEle()
  {
    int min=Arr[0];
    for(int i=0;i<length;i++)
    {
      if(Arr[i]<min)
      {
        min=Arr[i];
      }
    }
    return min;
  }

}

class Array
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size=0,iret=0;

    System.out.println("Enter The Size of an Array: ");
    size = sc.nextInt();

    ArrayOperation obj = new ArrayOperation(size);
    obj.Accept();
    obj.Display();

    iret = obj.maxEle();
    System.out.println("Maximum Element is From an Array Is : "+iret);

    iret = obj.minEle();
    System.out.println("Mimimum Element form an Array is: "+iret);




  }
}
