class Main {
  public static void main(String[] args) 
  {
    //RECURSION IS CALLING A METHOD WITHIN ITSELF
    int result = sum(10);
    System.out.println(result);

    int result1 = subtraction(10);
    System.out.println(result1);

    int result2 = division(10);
    System.out.println(result2);

    int result3 = multiplication(10);
    System.out.println(result3);
  }

//for example: if i received num = 3 
    //then this method would be 3 + 2 + 1
    //for example: if i received num = 5
    //then this method would add 5 + 4 + 3 + 2 + 1
    //10 + sum(9)
    //9 + sum(8)
    //8 + sum(7)
    //7 + sum(6)
    //6 + sum(5)
    //5 + sum(4)
    //4 + sum(3)
    //3 + sum(2)
    //2 + sum(1)
    //1 + sum(0)
    //10 + 45 = 55
    //9 + 36 = 45
    //8 + 28 = 36
    //7 + 21 = 28
    //6 + 15 = 21
    //5 + 10 = 15
    //4 + 6 = 10
    //3 + 3 = 6
    //2 + 1 = 3
    //1 + 0 = 1
    

  



// recursive method statement for addition
public static int sum(int num)
  {
    if(num > 0)
    {
      return num + sum(num - 1);
    }else{
      return 0;
    }
  }

// recursive method statement for subtraction
public static int subtraction(int subtract)
  {
if (subtract > 0)
  {
    return subtract - subtraction(subtract - 1);
  }else{
    return 0;
  }
  }

// recursive method statement for division
  public static int division(int divide)
  {
  if (divide > 1)
  {
      return divide / division(divide - 1);
  }else{
      return 1;
  }
  }

// recursive method statement for multiplication
  public static int multiplication(int multiply)
  {
  if (multiply > 0)
  {
     return multiply * multiplication(multiply - 1);
  }else{
    return 0;
    }
  }
}