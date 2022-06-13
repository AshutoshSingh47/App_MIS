package com.example.data_op;

public class data_holder {
    String Id,Incharge,Part_Name;

    public data_holder(String Incharge, String Part_Name) {
       // this.Id = Id;
        this.Incharge = Incharge;
        this.Part_Name = Part_Name;
    }

//    public String getId() {
//        return Id;
//    }
//
//    public void setId(String Id) {
//        this.Id = Id;
//    }

    public String getIncharge() {
        return Incharge;
    }

    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    public String getPart_name() {
        return Part_Name;
    }

    public void setPart_name(String Part_Name) {
        this.Part_Name = Part_Name;
    }
}
