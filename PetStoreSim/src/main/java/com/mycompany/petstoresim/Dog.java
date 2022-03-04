package com.mycompany.petstoresim;

public class Dog extends Pet {

    public Dog(String PetID, String Name, int age, String breed, String color, double weight, Boolean immunized,
            aquisition aquired, int price, careLVL care) {
        super(PetID, Name, age, breed, color, weight, immunized, aquired, price, care);
        //TODO Auto-generated constructor stub
    }



    private Boolean ugly;
    
    

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return super.getAge();
    }



    @Override
    public aquisition getAquired() {
        // TODO Auto-generated method stub
        return super.getAquired();
    }



    @Override
    public String getBreed() {
        // TODO Auto-generated method stub
        return super.getBreed();
    }



    @Override
    public careLVL getCare() {
        // TODO Auto-generated method stub
        return super.getCare();
    }



    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return super.getColor();
    }



    @Override
    public Boolean getImmunized() {
        // TODO Auto-generated method stub
        return super.getImmunized();
    }



    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }



    @Override
    public String getPetID() {
        // TODO Auto-generated method stub
        return super.getPetID();
    }



    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }



    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        return super.getWeight();
    }



    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub
        super.setAge(age);
    }



    @Override
    public void setAquired(aquisition aquired) {
        // TODO Auto-generated method stub
        super.setAquired(aquired);
    }



    @Override
    public void setBreed(String breed) {
        // TODO Auto-generated method stub
        super.setBreed(breed);
    }



    @Override
    public void setCare(careLVL care) {
        // TODO Auto-generated method stub
        super.setCare(care);
    }



    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }



    @Override
    public void setImmunized(Boolean immunized) {
        // TODO Auto-generated method stub
        super.setImmunized(immunized);
    }



    @Override
    public void setName(String Name) {
        // TODO Auto-generated method stub
        super.setName(Name);
    }



    @Override
    public void setPetID(String PetID) {
        // TODO Auto-generated method stub
        super.setPetID(PetID);
    }



    @Override
    public void setPrice(int price) {
        // TODO Auto-generated method stub
        super.setPrice(price);
    }



    @Override
    public void setWeight(double weight) {
        // TODO Auto-generated method stub
        super.setWeight(weight);
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }



    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }



    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }



    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
