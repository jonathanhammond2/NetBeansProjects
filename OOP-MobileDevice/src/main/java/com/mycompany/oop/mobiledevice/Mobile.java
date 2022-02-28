
package com.mycompany.oop.mobiledevice;

import java.util.Date;

abstract class Mobile {
    private String manufacturer;
    private String operating_system;
    private String model;
    private double cost;
    
    private String SIMCard;
    private String Processor;
    private int InternalMemorySize;
    private boolean isSingleSim;
    private Date manufacturingDate;
    
    //Constructor
    Mobile (String man, String OS, String model, double cost){
        this.manufacturer = man;
        this.operating_system = OS;
        this.model = model;
        this.cost = cost;
    }

    public Mobile(String manufacturer, String operating_system, String model, 
            double cost, String SIMCard, String Processor, int InternalMemorySize, 
            boolean isSingleSim, Date manufacturingDate) {
        this.manufacturer = manufacturer;
        this.operating_system = operating_system;
        this.model = model;
        this.cost = cost;
        this.SIMCard = SIMCard;
        this.Processor = Processor;
        this.InternalMemorySize = InternalMemorySize;
        this.isSingleSim = isSingleSim;
        this.manufacturingDate = manufacturingDate;
    }
    
    public abstract void dialNumber();
    public abstract String toString();

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSIMCard(String SIMCard) {
        this.SIMCard = SIMCard;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public void setInternalMemorySize(int InternalMemorySize) {
        this.InternalMemorySize = InternalMemorySize;
    }

    public void setIsSingleSim(boolean isSingleSim) {
        this.isSingleSim = isSingleSim;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public String getSIMCard() {
        return SIMCard;
    }

    public String getProcessor() {
        return Processor;
    }

    public int getInternalMemorySize() {
        return InternalMemorySize;
    }

    public boolean isIsSingleSim() {
        return isSingleSim;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }
    
}
