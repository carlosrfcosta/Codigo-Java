package Unidade2;

import java.io.FileInputStream;



public class StreamApp {
	
	public static void byteStream() throws Exception
	{
     FileInputStream entrada = new FileInputStream("C:/Users/Carlos Costa/Desktop/Workspace/2Disciplina/src/Unidade2/Dados");
     int contador =0;
     while((entrada.read()) != -1)
	      contador++;
	 System.out.println("Número de Caracteres é: "+contador);
	 entrada.close();
	 
    
	
	}
	     public static void main(String[] args) {
	      try{
	    	  byteStream();
	       }
	             catch(Exception e)
	      {
		       e.printStackTrace();

	      }
	}
}
