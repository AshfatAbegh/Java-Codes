package BookShop;

public class Start{
    public static void main(String [] args){

        StoryBook sb1 = new StoryBook("3456419121257","The Wind in the Willows","Tamim Hasan",100.00,85,"Story Book");
        StoryBook sb2 = new StoryBook("5464189452446","Neil Gaiman","Sourov Mallik",50.00,75,"Story Book");
        StoryBook sb3 = new StoryBook("5154647565194","The Notebook","Nicolas Perks",900.00,100,"Story Book");
        StoryBook sb4 = new StoryBook("7634361165468","The Robinhood","Walter White",200.00,60,"Story Book");
        StoryBook sb5 = new StoryBook();
        sb5.setIsbn("7634361165468");
        sb5.setBookTitle("The Robinhood");
        sb5.setAuthorName("Walter White");
        sb5.setPrice(145);
        sb5.setAvailableQuantity(77);
        sb5.setCategory("Story Book");

        sb1.addQuantity(41);
        sb2.addQuantity(7);
        sb3.addQuantity(2);
        sb4.addQuantity(17);
        sb5.addQuantity(20);

        sb1.sellQuantity(21);
        sb2.sellQuantity(17);
        sb3.sellQuantity(13);
        sb4.sellQuantity(12);
        sb5.sellQuantity(10);


        TextBook tb1 = new TextBook("3564646484","English","Anisul Islam",80.,20,1);
        TextBook tb2 = new TextBook("5462651642","Gk","Hasib Khan",60.5,15,1);
        TextBook tb3 = new TextBook("5484649464","Math","Arman Alam",90.5,30,9);
        TextBook tb4 = new TextBook("7452549845","Programming","Sabbir Rahman",85.2,55,9);
        TextBook tb5 = new TextBook();

        tb5.setIsbn("5452549845");
        tb5.setBookTitle("programming");
        tb5.setAuthorName("Sabbir Rahman");
        tb5.setPrice(110);
        tb5.setAvailableQuantity(31);
        tb5.setStandard(9);

        tb1.addQuantity(18);
        tb2.addQuantity(21);
        tb3.addQuantity(10);
        tb4.addQuantity(11);
        tb5.addQuantity(3);

        tb1.sellQuantity(24);
        tb2.sellQuantity(29);
        tb3.sellQuantity(11);
        tb4.sellQuantity(17);
        tb5.sellQuantity(19);


        BookShop bookShop = new BookShop("Book Shop 1");

        if(bookShop.insertBook(sb1))
        {
            System.out.println("Done");
        }
        else{System.out.println("Not Done");}

        if(bookShop.insertBook(sb2))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }
        if(bookShop.insertBook(sb3))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        if(bookShop.insertBook(sb4))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        if(bookShop.insertBook(sb5))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        if(bookShop.insertBook(tb1))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        if(bookShop.insertBook(tb2))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        if(bookShop.insertBook(tb3))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        if(bookShop.insertBook(tb4))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        if(bookShop.insertBook(tb5))
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println("Not Done");
        }

        bookShop.showAllBooks();

        Book forSearch = new Book();
        forSearch=bookShop.searchBook("646932");
        if(forSearch!=null)
        {System.out.println("---------------------------");
            forSearch.showDetails();}
        else{System.out.println("Don't match");}
    }
}

