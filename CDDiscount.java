package revision;

public class CDDiscount {
	
    private int numCD;
    private int discAmout;
    
    public CDDiscount() {
    }
    
    public void setNumCD(int numCD) {
        this.numCD = numCD;
    }
    
    public void compute(){
        if(numCD > 40){
            discAmout = 50;
        }else if( numCD >20){
            discAmout = 30;
        }else if (numCD > 10){
            discAmout = 20;
        }else{
            discAmout = 0;
        }
    }
    
    public int getDiscAmout() {
        return discAmout;
    }
}