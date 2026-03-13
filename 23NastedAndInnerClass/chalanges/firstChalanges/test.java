package firstChalanges;

public class test {
    
    public static void main(String[] args) {

        System.out.println("-----------------------------Library Section -------------------------------");

        Library Science = new Library();
        Science.setTitle("The Great Gatsby");
        Science.setAuthor("F. Scott Fitzgerald");
        Science.setItemID("B001");

        Science.checkOut("The Great Gatsby");
        Science.returnItem("The Great Gatsby"); 
        Science.getTitle();
        Science.getAuthor();
        Science.getItemID(); 

        System.out.println("-----------------------------DVD Section -------------------------------");

        DVD dvdFirst = new DVD();

        dvdFirst.setTitle("Action Movie");
        dvdFirst.setDirector("John Doe");
        dvdFirst.setDuration("120 minutes");

        dvdFirst.checkOut("Action Movie");
        dvdFirst.returnItem("Action Movie");
        dvdFirst.getTitle();
        dvdFirst.getDirector();
        dvdFirst.getDuration();


        System.out.println("-----------------------------Magazine Section -------------------------------");

        Magazine mag = new Magazine();

        mag.setTitle("Tech Monthly");
        mag.setAuthor("Jane Smith");
        mag.setItemID("M001");

        mag.checkOut();
        mag.returnItem("Issue 5");

        mag.getTitle();
        mag.getAuthor();
        mag.getItemID();

        System.out.println("-----------------------------Book Section -------------------------------");

        Book book1 = new Book();
        book1.checkOut();
        book1.returnItem("Mystery Novel");

        

    }


}
