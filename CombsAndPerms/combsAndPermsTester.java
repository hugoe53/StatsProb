package CombsAndPerms;

public class combsAndPermsTester
{
        public static void main(String[] args) 
        {
            combsAndPermsWork example = new combsAndPermsWork();
            example.combinations(6,7);               // This is 2.35 in the book
            example.combinations(3,3,2);             // This is 2.52 in the book
            System.out.println(example.perms(3));    // This is 2.36 in the book
            System.out.println(example.perms(6));    // This is 2.37a in the book
        }
}