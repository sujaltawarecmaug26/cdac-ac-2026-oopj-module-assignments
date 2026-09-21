package org.sujal.com;
import java.util.Scanner;
import java.io.*;

/*Assignment:
Create a menu driven program for Encryption and Decryption of Text files, 
user selects Encryption the text file shoulb be read and converted
 to a non readable format and stored in a file.
When he selects Decrypt, the encrypted file should be decrypted to its original format
 */




public class Program {

	public static void main(String[] args) {
		int userChoice = 3;
		Scanner sc = new Scanner(System.in);
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
			bw.write("Hello EveryOne, This is Sujal Taware");
			bw.newLine();
			bw.write("I'm from Nagpur, I'm pursuing PGCP-AC Course at CDAC Mumbai");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		do {
			System.out.println("Menu for Encryption and Decryption of Text files:");
			System.out.println("1)Display Normal File");
			System.out.println("2) Encryption File");
			System.out.println("3) Decryption File");
			System.out.println("4) Exit");
			
			System.out.print("Enter your choice: ");
			userChoice = sc.nextInt();
			
			switch(userChoice) {
			case 1:
				System.out.println("==============================================");
				try(BufferedReader br = new BufferedReader(new FileReader ("data.txt")))
				{
			
					String data;
					
					while((data = br.readLine()) != null) {
						System.out.println(data);
					}
					System.out.println("==============================================");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				break;
			case 2:
				
				int key = 3;
				
				try (BufferedReader br = new BufferedReader(new FileReader ("data.txt"));
						BufferedWriter bw = new BufferedWriter(new FileWriter("encrypted.txt"))){
					
						int ch;
						
						while((ch = br.read()) != -1) {
							 // Encrypt the character
							char encrypted = (char) (ch + key);
							
							// Write encrypted character into encrypted.txt
							bw.write(encrypted);
							
						}
						
						bw.close();
						System.out.println("===============================================");
						System.out.println("File encrypted successfully.");
						BufferedReader encryptReader = new BufferedReader(new FileReader ("encrypted.txt"));
						
						String encrypt;
						
						while((encrypt = encryptReader.readLine()) != null) {
												
						System.out.println(encrypt);
						
						}
						encryptReader.close();
						
						System.out.println("===============================================");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				break;
			case 3:
				
				try (BufferedReader br = new BufferedReader(new FileReader ("encrypted.txt"))){
					
					BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
					
						int ch;
						
						while((ch = br.read()) != -1) {
							 // decrypt  the character
							char decrypt = (char) (ch - 3);
							
							// Write decrypt  character into  data.txt
							bw.write(decrypt);
							
						}
						
						bw.close();
						System.out.println("===============================================");
						System.out.println("File decrypted  successfully.");
						BufferedReader decryptReader = new BufferedReader(new FileReader ("data.txt"));
						
						String decrypt;
						
						while((decrypt = decryptReader.readLine()) != null) {
												
						System.out.println(decrypt);
						
						}
						
						decryptReader.close();
						System.out.println("===============================================");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Exiting from menu.....");
				break;
			}
			 
		}while(userChoice != 4);

	}

}
