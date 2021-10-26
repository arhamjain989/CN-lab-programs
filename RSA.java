import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import.java.util.Random;
Public class RSA
{
r=new Random();
p=BigInteger.ProbablePrime(bitlength,r);
q=BigInteger.probablePrime(bitlength,r);
N=P.multiply(q);
Phi=P.subtract(BigInteger.One).multiply(q.Subtract(BigInteger.ONE));
e=BigInteger.ProbablePrime(bitlengh/2,r);
while(Phi.gcd(e).Compare To(Big Integer.ONE)>0&&e.Compare To(Phi)<0)
e.add(BigInteger.ONE);
D=e.mod Inverse(phi);
}
Public RSA(BigInteger e,BigInteger d,BigInteger N)
{
this.e=e;
this.d=d;
this.N=N;
}
Public Static Void main(String[]args) throws IOException
{
RSA rsa=new RSA();
DataInputStream.in=new DataInputStream(System.in);
String teststring;
System.Out.println("Enter the plain text:");
System.Out.println("String in Bytes:"+bytes To String(testString.get Bytes()));
byte[] encrypted=rsa.encrypt(test String.getBytes());
byte[] decrypted=rsa.decrypt(encrypted);
System.out.println("Decrypting Bytes:"+bytestoString(decrypted));
System.out.prinln("Decrypted String:"+new String(decrypted));
}
Private Static String bytestoString(byte[] encrypted)
{
String test="";
for(byte b:encrypted)
test +=Byte.toString(b);
return test;
}
Public byte[] encrypt(byte[] message)
{
return(new BigInteger(message)).modPow(e,N).toByteArray();
}
Public byte[] decrypt(byte[]message)
{
return(new BigInteger(message)).modPow(d,N).toByteArray();
} 
}
