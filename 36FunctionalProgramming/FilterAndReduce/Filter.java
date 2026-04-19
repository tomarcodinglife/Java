package FilterAndReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Filter {
    
    public static void main(String[] args) {
        List<String> fruitsnames = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        System.out.println(fruitsnames.size()); 

 
        System.out.println("Printing fruits Normally");
        for (String fruit : fruitsnames) {
            if (fruit.length() > 5) {
                System.out.println(fruit);
            }
        }

        System.out.println("Printing fruits using Stream API");
 
        /*
        Stream API ek powerful tool hai jo Java 8 me introduce kiya gaya tha, jiska use hum collections ke upar functional-style operations perform karne ke liye karte hain. Stream API ke through hum easily data ko filter, map, reduce, aur collect kar sakte hain.

        Yaha Consumer interface ka use kiya gaya hai, jo ek functional interface hai.
        Consumer interface ka ek method hota hai accept(), jo ek argument leta hai aur kuch return nahi karta. Yaha humne accept() method ko override kiya hai, jisme humne fruitsnames ko print karne ka logic likha hai.

        Aur Stream API ka use karke humne forEach() method ka use kiya hai, jisme humne ek lambda expression pass kiya hai, jo har fruit ko print karta hai. Lambda expression me humne fruit variable ko use kiya hai, jo har iteration me current fruit ko represent karta hai.
        
        */

        fruitsnames.stream().forEach(new Consumer<String>() { 
            @Override
            public void accept(String fruitsnames){
                System.out.println(fruitsnames);
            }
        });

        System.out.println("Printing fruits using Stream API and Lambda Expression");

        /*

        Yaha humne lambda expression ka use kiya hai, jisme humne Consumer interface ko implement karne ki zarurat nahi hai. Lambda expression me hum directly fruit variable ko use kar sakte hain, jo har iteration me current fruit ko represent karta hai. Lambda expression me humne arrow operator (->) ka use kiya hai, jisme left side me parameters hote hain aur right side me expression hota hai.
        
        Sath hi humne filter() method ka use kiya hai, jisme humne ek lambda expression pass kiya hai, jo har fruit ko check karta hai ki kya wo "e" par end hota hai. Agar fruit "e" par end hota hai, to wo filter ke through stream me pass ho jata hai aur forEach() method ke through print ho jata hai.
        
        */
 
        fruitsnames.stream()
                   .filter(fruit -> fruit.endsWith("e"))
                   .forEach(fruit -> System.out.println(fruit));
    }


}
