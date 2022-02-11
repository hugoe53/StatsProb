package CombsAndPerms;

public class combsAndPermsWork 
{
      public int combinations(int first, int second) 
      {
          return first * second;
      } 
      public int combinations(int first, int second, int third)
      {
          return first*second*third;
      }
      public int perms(int first)
      {
          int tempPerm = 1;
          int finalPerm = 0;
          while(first>0)
          {
              
              tempPerm *=first;
              first--;
          }
          finalPerm=tempPerm;
        return finalPerm;
      }
}
