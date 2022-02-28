package com.mycompany.inheritanceexample.guilfordcollege;

class Address {
    private String streetAddress;
    private  String city;
    private String state;
    private String zipCode;
    
    
    //constructor
    public Address()
    { //create an address with all empty fields
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        
    }
    /*javadoc:
    /**
     * A Constructor that creates an actual address
     */
    public Address(String stAdd, String ct, String st, String zip)
    {
        this.streetAddress = stAdd;
        this.city = ct;
        this.state = st;
        this.zipCode = zip;
    }
    
    /**
     * 
     * @param streetAddress 
     * @return void
     * @param streetAddress
     */

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        
        /**
         * 
         * @param streetAddress
         */
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
    
    //--------------------------------------------------------------------------
    
    public boolean equals (Object right)
    {
        Address add = (Address)right;
        return streetAddress.equals(add.streetAddress)
                && city.equalsIgnoreCase(add.city)
                && state.equalsIgnoreCase(add.state)
                && zipCode.equalsIgnoreCase(add.zipCode);
    }
    
    public String toString()
    {
        return "This Address is:\n\t" 
                + streetAddress + ", " + city
                + ", " + state + " ," + zipCode;
    }
    
    public Object clone()
    {
        return new Address(streetAddress, city, state, zipCode);
    }
}



