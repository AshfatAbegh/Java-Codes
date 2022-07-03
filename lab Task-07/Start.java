public class Start{
	public static void main(String [] args){
		
		StoryBook sb1 = new StoryBook("3456419121257","The Wind in the Willows","Tamim Hasan",100.00,80,"Story Book");
		StoryBook sb2 = new StoryBook("5464189452446","Neil Gaiman","Sourov Mallik",50.00,75,"Story Book");
		StoryBook sb3 = new StoryBook("5154647565194","The Notebook","Nicolas Perks",900.00,80,"Story Book");
		StoryBook sb4 = new StoryBook("7634361165468","Lord of the Rings","Tolkien",60.00,65,"Story Book");
		StoryBook sb5 = new StoryBook();
		sb5.setIsbn("643454642548");
		sb5.setBookTitle("The Charliechaplins");
		sb5.setAuthorName("Adam Cooks");
		sb5.setPrice(50.00);
		sb5.setAvailableQuantity(90);
		sb5.setCategory("Story Book");

		sb1.addQuantity(30);
		sb2.addQuantity(15);
		sb3.addQuantity(40);
		sb4.addQuantity(10);
		sb5.addQuantity(12);

		sb1.sellQuantity(25);
		sb2.sellQuantity(15);
		sb3.sellQuantity(20);
		sb4.sellQuantity(8);
		sb5.sellQuantity(9);


		TextBook tb1 = new TextBook("2158474542314","English","William",40.00,70,2);
		TextBook tb2 = new TextBook("8124634564561","Math","Parker",50.00,35,5);
		TextBook tb3 = new TextBook("4316546456464","Bangla","Rafi Islam",70.00,40,3);
		TextBook tb4 = new TextBook("1213456464856","Gk","Rafin Khan",60.00,55,2);
		TextBook tb5 = new TextBook();
		
		tb5.setIsbn("5434316121561");
		tb5.setBookTitle("History");
		tb5.setAuthorName("Allison");
		tb5.setPrice(80.00);
		tb5.setAvailableQuantity(30);
		tb5.setStandard(2);

		tb1.addQuantity(20);
		tb2.addQuantity(8);
		tb3.addQuantity(23);
		tb4.addQuantity(12);
		tb5.addQuantity(30);

		tb1.sellQuantity(15);
		tb2.sellQuantity(5);
		tb3.sellQuantity(18);
		tb4.sellQuantity(7);
		tb5.sellQuantity(25);


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
		forSearch=bookShop.searchBook("5464189452446");
		if(forSearch!=null)
		{System.out.println("---------------------------");
	    forSearch.showDetails();}
		else{System.out.println("Don't match");}
	}
}
