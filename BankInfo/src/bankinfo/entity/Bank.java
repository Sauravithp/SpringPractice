/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinfo.entity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thapaniwas
 */
public class Bank {
    private int id;
    private String bankName;
    private List<Department> dlist=new ArrayList<>();
    public Bank() {
    }

    public Bank(int id, String bankName, List<Department> dep) {
        this.id = id;
        this.bankName = bankName;
        dlist=new ArrayList<>();
        
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Department> getDepartment() {
        return  dlist;
    }

    public void setDepartment(Department dep) {
           
        dlist.add(dep);
        this.dlist = dlist;
    }

    @Override
    public String toString() {
        return "Bank{" + "id=" + id + ", bankName=" + bankName + ", deplist=" + dlist + '}';
    }

    

   

   

 

   

    
   

   

    

    
    
    
}
