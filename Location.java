package com.example.grocerydeliveryapplication;

/**
 * @author : GadsdenS123
 * @Description :
 * @created : 2025-06-01, Sunday
 **/
public class Location {
    String location;

    public Location()
    { }

    public Location(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        String location = this.getLocation();
        return location;
    }
}
