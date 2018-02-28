import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException{
		String file = "./raf.dat";
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.writeBoolean(true);   //raf.writeChars("\n"); 
		raf.writeInt(89);   //raf.writeChars("\n"); 
		raf.writeDouble(89.5);    //raf.writeChars("\n");
		raf.writeUTF("Hello");     //raf.writeChars("\n");   
		raf.writeUTF("안녕하세요");   //raf.writeChars("\n");
		raf.seek(0);   //중요 
		System.out.printf("%b\n", raf.readBoolean());
		System.out.printf("kor = %d\n", raf.readInt());
		System.out.printf("avg = %.1f\n", raf.readDouble());
		System.out.printf("str = %s\n", raf.readUTF());
		System.out.printf("str = %s\n", raf.readUTF());
		raf.close();
	}
}






