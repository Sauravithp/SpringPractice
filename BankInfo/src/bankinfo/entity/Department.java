/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinfo.entity;

/**
 *
 * @author thapaniwas
 */
public class Department {
    private int dId;
    private String dName;
    public Department() {
    }
    

    
    public Department(int dId, String dName) {
        this.dId = dId;
        this.dName = dName;
    }

    public int getdId() {
        return dId;
    }

    public int setdId(int dId) {
        this.dId = dId;
        return dId;
    }

    public String getdName() {
        return dName;
    }

    public String setdName(String dName) {
        this.dName = dName;
        return dName;
    }

    @Override
    public String toString() {
        return "Department{" + "dId=" + dId + ", dName=" + dName + '}';
    }
    
    
    
}
