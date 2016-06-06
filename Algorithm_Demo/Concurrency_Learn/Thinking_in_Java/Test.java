public class Test{
	public static void main(String args[]){
		for(int i=0;i<4; i++){
	        new Thread(new Runnable()
	        {   
	            @Override
	            public void run()
	            {
	                while (true)
	                {

	                }   
	            }
	        }).start();;
    	}
	}
}