
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class praktikum_node {
    public praktikum_node head = null;
    public praktikum_node tail = null;
    
    public int data;
    public praktikum_node next;
    
    public praktikum_node(int a){
        this.data = a;
        this.next = null;
    }
    
    public void addfirst(int namanya){
        praktikum_node newnode = new praktikum_node(namanya);
        
        if (head == null){
            head = newnode;
            tail = newnode;
        }else{
            praktikum_node isisementara = head ;
            head = newnode;
            head.next = isisementara;
        }
    }
    
    public void addlast(int namanya){
        praktikum_node newnode = new praktikum_node(namanya);
        
        if (head == null) {
            head = newnode;
            tail = newnode;
            
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    public praktikum_node() {
      this.getClass();
    }
    
    public String txt(){
        String output = "";
        praktikum_node current = head;
        while (current != null){
            output += current.getdata()+",";
            current = current.getnext();
        }
        return output;
    }
    public int getdata(){return data;}
    public praktikum_node getnext(){return next;}
    public void setdata (int b){data = b;}
    public void setnext(praktikum_node nx){next = nx;}
    
    public void delete(int pos){
        if (pos == 0){
            head = head.getnext();
            return;
        }
        
            
            praktikum_node current = head;
            int count = 0;
            while(count < pos-1){
                current = current.getnext();
                if(current == null){
                    throw new IndexOutOfBoundsException("ga ketemu");
                }
        count ++;
            }
            if (current.getnext()==null){
                throw new IndexOutOfBoundsException("ga ketemu");
            }
        current.setnext(current.getnext().getnext());
        
        
        
    }
    
    
    public static void main(String[]args){
        praktikum_node pn = new praktikum_node();
        pn.addfirst(1);
        pn.addfirst(2);
        pn.addfirst(4);
        pn.addlast(20);
        pn.addlast(25);
        
        System.out.println(pn.txt());
    }
    
}
