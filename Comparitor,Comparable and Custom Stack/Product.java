package Day6;

import java.io.*;

public class Product implements Serializable, Comparable<Product>
{
    int pid;
    String Pname;
    int Prating;
    
    @Override
    public int compareTo(final Product o) {
        return o.getPid() - this.pid;
    }
    
    public int getPid() {
        return this.pid;
    }
    
    public void setPid(final int pid) {
        this.pid = pid;
    }
    
    public String getPname() {
        return this.Pname;
    }
    
    public void setPname(final String pname) {
        this.Pname = pname;
    }
    
    public int getPrating() {
        return this.Prating;
    }
    
    public void setPrating(final int prating) {
        this.Prating = prating;
    }
    
    public Product(final int pid, final String pname, final int prating) {
        this.pid = pid;
        this.Pname = pname;
        this.Prating = prating;
    }
    
    @Override
    public String toString() {
        return "Product details : [pid=" + this.pid + ", Pname=" + this.Pname + ", Prating=" + this.Prating + "]";
    }
}