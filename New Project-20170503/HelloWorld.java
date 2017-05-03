  
    import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorld{
  
public static void main(String args[]) {

System.out.println ("Exec started");
    try{
    Runtime rt = Runtime.getRuntime();
    Process proc = rt.exec("/home/cg/root/myscript.sh");
    proc.waitFor();
    
    System.out.println ("exit: ");
}catch(Exception e){}
}
    
}
