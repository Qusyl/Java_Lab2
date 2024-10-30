package Pckg;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class Main {

    public static void PrintList(List<User> users)
    {
        for(User user : users)
        {
            user.Print();
        }
    }
    public static void SortLastName(List<User> users)
    {
        users.sort(Comparator.comparing(User::getLastName));
    }

    public static void SortAge(List<User> users)
    {
        users.sort(Comparator.comparingInt(User::getAge));
    }

    public static void AgeChecker(List<User> users)
    {
        for(User user : users)
        {
            if(user.getAge() < 7)
            {
                System.out.println("User's " + user.getFirstName() + " " + user.getLastName() + " age is lower, than 7!");
            }
        }
    }
    public static int AverageAgeFind(List<User> users)
    {
        int len = 0;
        int sum = 0;
        for(User user : users)
        {
            sum += user.getAge();
            len++;
        }
        int aver = sum/len;
        return aver;
    }
    public static int DiffCountries(List<User> users) {
        String[] temp = new String[users.size()];
        int uniqueCount = 0;

        for (User user : users) {
            String country = user.getCountry();
            boolean exists = false;

            for (int i = 0; i < uniqueCount; i++) {
                if (temp[i].equals(country)) {
                    exists = true;
                    break;
                }
            }
            

            if (!exists) {
                temp[uniqueCount] = country;
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        List<User> Users = new ArrayList<>();
        Users.add(new User("5535","Denis","Dyubko",19,"Russia"));
        Users.add(new User("1923","Michael","Jaksonov",33,"Canada"));
        Users.add(new User("4453","Jack","Frescovich",25,"Russia"));
        Users.add(new User("2543","Vlad","Davidov",12,"UA"));
        Users.add(new User("7791","Sergey","Piratov",26,"Vietnam"));
        Users.add(new User("7221","Tom","Kruz",32,"America"));
        Users.add(new User("1243","Sergey","Golovach",25,"UA"));
        Users.add(new User("7777","Baby","The Babovich",3,"UA"));
        System.out.println("-----------ListBefore--------");
        PrintList(Users);
        System.out.println("----------SortedList--------");
        SortLastName(Users);
        PrintList(Users);
        System.out.println("--------SortedAgeList-------");
        SortAge(Users);
        PrintList(Users);
        System.out.println("---------CheckedAge----------");
        AgeChecker(Users);
        System.out.println("--------AverageAge----------");
        System.out.println(AverageAgeFind(Users));
        System.out.println("------NumOfDifferentCountries------");
        System.out.println("---"+ DiffCountries(Users) + "---");




    }
}
