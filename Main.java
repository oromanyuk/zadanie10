import java.util.Random;

class Main {
  public static void main(String[] args) {
    int maxg = 0;
    int [][] mas = new int [10][10];
    Random rnd = new Random();
    for(int i = 0; i < 10; i++)
    {
      for (int l = 0; l < 10; l++ )
      {
        mas[i][l] = rnd.nextInt(55);
        System.out.print(mas[i][l]+ "\t");
      }
      System.out.println("\n");
    }
    int a = 0;
    for(int i = 0; i < 10; i++)
    {
      if(maxg < mas[i][a])
      {
        maxg = mas[i][a];
      }
      a++;
    }
    System.out.println("Максимальное число в диагонали - " + maxg);
    int maxp = 0;
    a = 9;
    for(int i = 0; i < 10; i++)
    {
      if(maxp < mas[i][a])
      {
        maxp = mas[i][a];
      }
      a--;
    }
    System.out.println("\nМаксимальное число в побочной диагонали - " + maxp);
    int num = 1;
    for (int l = 0; l < 10; l++)
    {
      int sum = 0;
      for(int i = 0; i < 10; i++)
      {
        sum = sum + mas[i][l];
      }
      System.out.println("\n Сумма в " + num + " столбце равна " + sum);
      num++;
    }
  }
}