import java.io.*;

public class Program {

	public static void main(String[] args) {
		
		Manager [] arrManager = new Manager[50];
		Engineer [] arrEngineer = new Engineer[50];
		SalesPerson[] arrSalesPerson = new SalesPerson[50];
		
		int managerCount = 0;
		int engineerCount = 0;
		int salesPersonCount = 0;
		int mainChoice = 1;
		
		while(mainChoice != 5)
		{
		  System.out.println(".... Main Menu....");
		  System.out.println("1) Add");
		  System.out.println("2) Display");
		  System.out.println("3) Sort");
		  System.out.println("4) Save and Load");
		  System.out.println("5) Exit");
		  
		  System.out.println("Enter your choice:");
		  int choice = ConsoleInput.getInt();
		  

		    switch(choice)
		    {
		        case 1:
		             // Add
		        	int addChoice = 1;
		        	while(addChoice != 7) {
		        		System.out.println("");
		        		System.out.println(".... Add Menu....");
		        		System.out.println("4) Manager");
		      		  	System.out.println("5) Engineer");
		      		  	System.out.println("6) SalesPerson");
		      		  	System.out.println("7) Exit");
		      		  	
		      		  System.out.println("Enter your choice:");
		    		  int choice1 = ConsoleInput.getInt();
		    		  
		    		  switch(choice1) {
		    		  		case 4:
		    		  			
		    		  		//add Manager Details here........
		    		  		System.out.println("====================================");
		    		  		System.out.print("Enter Manager Name: ");
		    		  		String name = ConsoleInput.getString();
		    		  		
		    		  		System.out.print("Enter Manager Address: ");
		    		  		String address = ConsoleInput.getString();
		    		  		
		    		  		System.out.print("Enter Manager Age: ");
		    		  		int age = ConsoleInput.getInt();
		    		  		
		    		  		System.out.print("Enter Manager Salary: ");
		    		  		float basicSalary = ConsoleInput.getFloat();
		    		  		
		    		  		System.out.print("Enter Manager Gender(M/F): ");
		    		  		char gender = ConsoleInput.getChar();
		    		  		
		    		  		System.out.print("Enter Manager Hra: ");
		    		  		float hra = ConsoleInput.getFloat();
		    		  		System.out.print("====================================");
		    		  		
		    		  		
		    		  		
		    		  		arrManager[managerCount] = new Manager(name,address,age,gender,basicSalary,hra);
		    		  		managerCount++;
		    		  		
		    		  			break;
		    		  		case 5:
		    		  		
		    		  			//add Engineer Details here........
			    		  		System.out.println("====================================");
			    		  		System.out.print("Enter Engineer Name: ");
			    		  		String Egname = ConsoleInput.getString();
			    		  		
			    		  		System.out.print("Enter Engineer Address: ");
			    		  		String Egaddress = ConsoleInput.getString();
			    		  		
			    		  		System.out.print("Enter Engineer Age: ");
			    		  		int Egage = ConsoleInput.getInt();
			    		  		
			    		  		System.out.print("Enter Engineer Salary: ");
			    		  		float EgbasicSalary = ConsoleInput.getFloat();
			    		  		
			    		  		System.out.print("Enter Engineer Gender(M/F): ");
			    		  		char Eggender = ConsoleInput.getChar();
			    		  		
			    		  		System.out.print("Enter Engineer Hra: ");
			    		  		float overtime = ConsoleInput.getFloat();
			    		  		System.out.print("====================================");
			    		  		
			    		  		
			    		  		arrEngineer[engineerCount] = new Engineer(Egname,Egaddress,Egage,Eggender,EgbasicSalary,overtime);
			    		  		engineerCount++;
			    		  		
		    		  			break;
		    		  		case 6:
		    		  			
		    		  		//add Engineer Details here........
			    		  		System.out.println("====================================");
			    		  		System.out.println("Enter SalesPerson Name: ");
			    		  		String Sname = ConsoleInput.getString();
			    		  		
			    		  		System.out.print("Enter SalesPerson Address: ");
			    		  		String Saddress = ConsoleInput.getString();
			    		  		
			    		  		System.out.print("Enter SalesPerson Age: ");
			    		  		int Sage = ConsoleInput.getInt();
			    		  		
			    		  		System.out.print("Enter SalesPerson Salary: ");
			    		  		float SbasicSalary = ConsoleInput.getFloat();
			    		  		
			    		  		System.out.print("Enter SalesPerson Gender(M/F): ");
			    		  		char Sgender = ConsoleInput.getChar();
			    		  		
			    		  		System.out.print("Enter SalesPerson Hra: ");
			    		  		float commission = ConsoleInput.getFloat();
			    		  		System.out.println("====================================");
			    		  		
			    		  		
			    		  		arrSalesPerson[salesPersonCount] = new SalesPerson(Sname,Saddress,Sage,Sgender,SbasicSalary,commission);
			    		  		salesPersonCount++;
		    		  			break;
		    		  		case 7:
		    		  			System.out.println("Exiting Add Menu......");
		    		  			addChoice = 7;
		    		  			break;
		    		  }
		        	}
		        	
		             break;

		        case 2:
		        	
		             // Display Manager
		        	System.out.println("........Details of Manager........");

		        	for (int i = 0; i < managerCount; i++) {

		        	    System.out.println("Name: " + arrManager[i].getName());
		        	    System.out.println("Address: " + arrManager[i].getAddress());
		        	    System.out.println("Age: " + arrManager[i].getAge());
		        	    System.out.println("Gender: " + arrManager[i].getGender());
		        	    System.out.println("Basic Salary: " + arrManager[i].getBasicSalary());
		        	    System.out.println("HRA: " + arrManager[i].getHra());

		        	}
		        	System.out.println(".................................");
		        	System.out.println();
		        	
		        	// Display Engineer..
		        	System.out.println("Details of Engineer........");

		        	for (int i = 0; i < engineerCount; i++) {

		        	    System.out.println("Name: " + arrEngineer[i].getName());
		        	    System.out.println("Address: " + arrEngineer[i].getAddress());
		        	    System.out.println("Age: " + arrEngineer[i].getAge());
		        	    System.out.println("Gender: " + arrEngineer[i].getGender());
		        	    System.out.println("Basic Salary: " + arrEngineer[i].getBasicSalary());
		        	    System.out.println("Overtime: " + arrEngineer[i].getOvertime());
		        	    System.out.println("====================================");
		        	}
		        	System.out.println(".................................");
		        	System.out.println();
		        	
		        	// Display SalesPerson...
		        	System.out.println("Details of SalesPerson........");

		        	for (int i = 0; i < salesPersonCount; i++) {

		        	    System.out.println("Name: " + arrSalesPerson[i].getName());
		        	    System.out.println("Address: " + arrSalesPerson[i].getAddress());
		        	    System.out.println("Age: " + arrSalesPerson[i].getAge());
		        	    System.out.println("Gender: " + arrSalesPerson[i].getGender());
		        	    System.out.println("Basic Salary: " + arrSalesPerson[i].getBasicSalary());
		        	    System.out.println("Commission: " + arrSalesPerson[i].getCommission());
		        	    System.out.println("====================================");
		        	}

		             break;

		        case 3:
		             // Sort
		        	int sortChoice = 1;
		        	while(sortChoice != 3) {
		        		
		        		System.out.println(".... Sort Menu....");
		        		System.out.println("1) Sort to Ascending");
		      		  	System.out.println("2) Sort to Descending");
		      		  	System.out.println("3) Exit");
		      		  	
		      		  System.out.println("Enter your choice:");
		    		  int choice2 = ConsoleInput.getInt();
		    		  
		    		  switch(choice2) {
		    		  case 1:
		    			  //Sort to Ascending......
		    			  for(int i = 0; i < managerCount; i++) {
				        		for (int j = 0; j < managerCount - 1 - i; j++) {
				        			if(arrManager[j].getName().compareTo(arrManager[j+1].getName()) > 0) {
				        			Manager temp = arrManager[j];
				        			arrManager[j] = arrManager[j+1];
				        			arrManager[j+1] = temp;
				        			}
				        		}
				        	}
		    			  for(int i = 0; i < engineerCount; i++) {
				        		for (int j = 0; j < engineerCount - 1 - i; j++) {
				        			if(arrEngineer[j].getName().compareTo(arrEngineer[j+1].getName()) > 0) {
				        			Engineer temp = arrEngineer[j];
				        			arrEngineer[j] = arrEngineer[j+1];
				        			arrEngineer[j+1] = temp;
				        			}
				        		}
				        	}
		    			  
		    			  for(int i = 0; i < salesPersonCount; i++) {
				        		for (int j = 0; j < salesPersonCount - 1 - i; j++) {
				        			if(arrSalesPerson[j].getName().compareTo(arrSalesPerson[j+1].getName()) > 0) {
				        			SalesPerson temp = arrSalesPerson[j];
				        			arrSalesPerson[j] = arrSalesPerson[j+1];
				        			arrSalesPerson[j+1] = temp;
				        			}
				        		}
				        	}
		    			  break;
		    		  case 2:
		    			//Sort to Descending......
		    			  for (int i = 0; i < managerCount - 1; i++) {

		    				    for (int j = 0; j < managerCount - 1 - i; j++) {

		    				        if (arrManager[j].getName()
		    				                .compareTo(arrManager[j + 1].getName()) < 0) {

		    				            Manager temp = arrManager[j];
		    				            arrManager[j] = arrManager[j + 1];
		    				            arrManager[j + 1] = temp;
		    				        }
		    				    }
		    				}
		    			  
		    			  for (int i = 0; i < engineerCount - 1; i++) {

		    				    for (int j = 0; j < engineerCount - 1 - i; j++) {

		    				        if (arrEngineer[j].getName()
		    				                .compareTo(arrEngineer[j + 1].getName()) < 0) {

		    				            Engineer temp = arrEngineer[j];
		    				            arrEngineer[j] = arrEngineer[j + 1];
		    				            arrEngineer[j + 1] = temp;
		    				        }
		    				    }
		    				}
		    			  
		    			  for (int i = 0; i < salesPersonCount - 1; i++) {

		    				    for (int j = 0; j < salesPersonCount - 1 - i; j++) {

		    				        if (arrSalesPerson[j].getName()
		    				                .compareTo(arrSalesPerson[j + 1].getName()) < 0) {

		    				            SalesPerson temp = arrSalesPerson[j];
		    				            arrSalesPerson[j] = arrSalesPerson[j + 1];
		    				            arrSalesPerson[j + 1] = temp;
		    				        }
		    				    }
		    				}
		    			  
		    			  break;
		    		  case 3:
		    			//Exit 
				        System.out.println("Exiting Sort Menu......");
				        sortChoice = 3;
		    			  break;
		    		  }
		        	}
		        	
		             break;

		        case 4:
		        	//save data into the file
				try {
					BufferedWriter bw =
		            new BufferedWriter(new FileWriter("EmployeeData.txt"));
					
					//write manager data into a file
					for (int i = 0; i < managerCount; i++) {

						bw.write(
							    "MANAGER|" +
							    arrManager[i].getName() + "|" +
							    arrManager[i].getAddress() + "|" +
							    arrManager[i].getAge() + "|" +
							    arrManager[i].getGender() + "|" +
							    arrManager[i].getBasicSalary() + "|" +
							    arrManager[i].getHra()
							);
							bw.newLine();
					}
					
					//write engineer data into a file
					for (int i = 0; i < engineerCount; i++) {
						bw.write(
							    "ENGINEER|" +
							    arrEngineer[i].getName() + "|" +
							    arrEngineer[i].getAddress() + "|" +
							    arrEngineer[i].getAge() + "|" +
							    arrEngineer[i].getGender() + "|" +
							    arrEngineer[i].getBasicSalary() + "|" +
							    arrEngineer[i].getOvertime()
							);
							bw.newLine();
					}
					
					//write Salesperson data into a file
					for (int i = 0; i < managerCount; i++) {
					    
						bw.write(
							    "SALESPERSON|" +
							    arrSalesPerson[i].getName() + "|" +
							    arrSalesPerson[i].getAddress() + "|" +
							    arrSalesPerson[i].getAge() + "|" +
							    arrSalesPerson[i].getGender() + "|" +
							    arrSalesPerson[i].getBasicSalary() + "|" +
							    arrSalesPerson[i].getCommission()
							);
							bw.newLine();
					}
					
					bw.close();
		        	System.out.println("Successfully saved......");
		        	
		        	
					BufferedReader br = new BufferedReader(new FileReader("EmployeeData.txt"));
					
					String data;
					
					while((data = br.readLine()) != null) {
						
						System.out.println(data);
					}
					
					br.close();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		        	
		             break;
		        case 5:
		        	//exit
		        	System.out.println("Exiting Main Menu......");
		             mainChoice = 5;
		             break;
		        	
		    }
		}

	}

}
