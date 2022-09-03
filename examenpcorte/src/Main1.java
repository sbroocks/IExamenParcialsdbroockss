package examenpcorte;

public class Main1 {

	public void main(String[] args) {
		
			
				double size_bytes=19999;
				String cnt_size;
				
				double size_kb = size_bytes /1000;
				double size_mb = size_kb / 1000;
				double size_gb = size_mb / 1000 ;
		 
				 if (size_gb > 0){
					    cnt_size = size_gb + " GB";
			        }else if(size_mb > 0)
					    cnt_size = size_mb + " MB";
			        } else {
			    	           String size_kb;
							String cnt_size = size_kb + " KB";
			        }	     
				System.out.println("Converted Size: " + cnt_size);			
			
		
	}




	}


