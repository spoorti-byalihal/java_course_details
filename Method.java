class Computer {
    public void playMusic()
    {
        System.out.println("playing music");

    }
        public String getMePen(int cost){
            if(cost>=10)
               return "Pen";
            
        return "nothing";
        }

    }

    public class Method {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.playMusic();
        String str=obj.getMePen(12);
        System.out.println(str);
        
    }
    
}
