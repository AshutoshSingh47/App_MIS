package com.example.data_op;
/** Activity for future use in database.*/

public class data_holder {
    String Machine_Name;
    String Tool_In_charge;
    String Part_Name;

    public String getPart_Name() {
        return Part_Name;
    }

    public void setPart_Name(String part_Name) {
        this.Part_Name = part_Name;
    }
    public String getMachine_Name() {
        return Machine_Name;
    }

    public void setMachine_Name(String machine_Name) {
        this.Machine_Name = machine_Name;
    }

    public String getTool_In_charge() {
        return Tool_In_charge;
    }

    public void setTool_In_charge(String tool_In_charge) {
        this.Tool_In_charge = tool_In_charge;
    }



    public data_holder(String Part_Name, String Machine, String Tool_In_charge) {
        this.Part_Name = Part_Name;
        this.Machine_Name = Machine;
        this.Tool_In_charge = Tool_In_charge;

    }


//    public String getId() {
//        return Id;
//    }
//
//    public void setId(String Id) {
//        this.Id = Id;
//    }

//    public String getIncharge() {
//        return Incharge;
//    }
//
//    public void setIncharge(String Incharge) {
//        this.Incharge = Incharge;
//    }
//
//    public String getPart_name() {
//        return Part_Name;
//    }
//
//    public void setPart_name(String Part_Name) {
//        this.Part_Name = Part_Name;
//    }
}
