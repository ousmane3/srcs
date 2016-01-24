package TME1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Monologue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader rd;
		Writer wr;
		char cbuf[]=new char[100];	
		int nb_lu;		
		try {
				rd= new InputStreamReader(System.in);
				wr=new OutputStreamWriter(System.out);
				
			while((nb_lu=rd.read(cbuf, 0, cbuf.length-1))>0){
				
				wr.write(cbuf,0,nb_lu);
				wr.flush();	
			}
			wr.close();
			rd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur: "+e.toString());
		}
	}

}
