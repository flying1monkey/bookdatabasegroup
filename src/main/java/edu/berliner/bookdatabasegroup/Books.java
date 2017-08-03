package edu.berliner.bookdatabasegroup;

public class Books
{
   private String title;
   private String author;
   private String description;
   private long sku;
   private double price;

    public long getSku()
    {
        return sku;
    }

    public void setSku(long sku)
    {
        this.sku = sku;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
