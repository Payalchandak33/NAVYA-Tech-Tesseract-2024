package VacciNet;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.time.Period;
import java.util.Scanner;
import java.util.HashMap;

import java.util.Arrays;
 class Vaccine {
	 int id;
	 public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BOLD = "\u001B[1m";
		private int value;
		 public Vaccine(int id, int value) {
		        this.id = id;
		        this.value = value;
		 }
		    public int getValue() {
		    	return value;
		    }

			static String removeSpace(String keyRemove) {
				keyRemove=keyRemove.replaceAll("\\s","");
				return keyRemove;
			}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ANSI_BOLD + "Child's Data:" + ANSI_RESET);
		System.out.print(" Name:\t");
		Scanner sc1=new Scanner(System.in);
		String Name=sc1.nextLine();
        
        // Ask the user to enter the birth date
        System.out.print(" Enter your birth date (YYYY-MM-DD): ");
        String birthDateString = sc1.nextLine();
        
        // Parse the input string into a LocalDate object
        LocalDate birthDate = LocalDate.parse(birthDateString);
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Calculate the period between the birth date and current date
        Period period = Period.between(birthDate, currentDate);
       
        // Display the age
   
        
        
       
double years = period.getYears() + period.getMonths() / 12.0 + period.getDays() / 365.25;
        
        // Display the age
        System.out.println("\nYour age is approximately " + String.format("%.2f", years) + " years");
        if(years<=1)
        {
        	System.out.println(ANSI_BOLD+"\nSo,given are the vaccinations for this age:"+ANSI_RESET);
            System.out.println("1.BCG (Bacillus Calmette-Guérin): Given at birth");
            System.out.println("2.Hepatitis B: Given at birth.");
            System.out.println("3.OPV (Oral Polio Vaccine): Given at birth, 6 weeks, 10 weeks, and 14 weeks.");
            System.out.println("4.IPV (Inactivated Polio Vaccine): This may be given instead of or in addition to OPV.");
            System.out.println("5.Pentavalent Vaccine: Given at 6 weeks, 10 weeks, and 14 weeks.");
            System.out.println("6.Rotavirus Vaccine: Given orally at 6 weeks, 10 weeks, and 14 weeks.");
            System.out.println("7.PCV (Pneumococcal Conjugate Vaccine):Given at 6 weeks, 10 weeks, and 14 weeks.");
            System.out.println("8.Measles, Mumps, and Rubella (MMR) Vaccine: Given at 9 months.");
            System.out.println("9.Typhoid Conjugate Vaccine (TCV): Given at 9 months.");
            System.out.println("10.Hepatitis A Vaccine: Given at 12 months.");
            System.out.println("11.Varicella (Chickenpox) Vaccine: Given at 12 months.");
        	 // Create a list
        	
            

            
            HashMap<Integer,String> map1=new HashMap<>();
        	map1.put(1," BCG (Bacillus Calmette-Guérin): Given at birth.");
        	map1.put(2," Hepatitis B: Given at birth.");
        	map1.put(3," OPV (Oral Polio Vaccine): Given at birth, 6 weeks, 10 weeks, and 14 weeks.");
        	map1.put(4," IPV (Inactivated Polio Vaccine): This may be given instead of or in addition to OPV.");
        	map1.put(5," Pentavalent Vaccine: Given at 6 weeks, 10 weeks, and 14 weeks.");
        	map1.put(6," Rotavirus Vaccine: Given orally at 6 weeks, 10 weeks, and 14 weeks.");
        	map1.put(7," PCV (Pneumococcal Conjugate Vaccine):Given at 6 weeks, 10 weeks, and 14 weeks.");
        	map1.put(8," Measles, Mumps, and Rubella (MMR) Vaccine: Given at 9 months.");
        	map1.put(9," Typhoid Conjugate Vaccine (TCV): Given at 9 months.");
        	map1.put(10," Hepatitis A Vaccine: Given at 12 months.");
        	map1.put(11," Varicella (Chickenpox) Vaccine: Given at 12 months.");
        	
        	
        System.out.print("\nEnter the serial numbers of vaccines already taken (separated by spaces): ");
        String input = sc1.nextLine();

        if (input.equals("0")) {
            System.out.println(map1);
        } else {
            String[] keysToRemove = input.split("\\s+");
            for (String keyStr : keysToRemove) {
                try {
                    int key = Integer.parseInt(keyStr);
                    if (!map1.containsKey(key)) {
                        System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                        System.exit(0); // Terminate the program if invalid input is detected
                    }
                    map1.remove(key);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                    System.exit(0); // Terminate the program if invalid input format is detected
                }
            }
            
            // Print the updated map
            System.out.println("\nAccording to your child's age group and your selected choices, here is a list of vaccinations that need to be taken:");
            for (String value : map1.values()) {
                System.out.println(value);
            }
			if(map1.isEmpty())
			{
				System.out.println("Congratulations,You are fully vaccinated according to your age group !");
			}
        }
        }
 //----------------------------------------------------------------------------------------------- 
        else if(years>1 && years<=2)
        {
        	System.out.println(ANSI_BOLD+"\nSo,given are the vaccinations for this age:"+ANSI_RESET);
            System.out.println("1.Hepatitis A (HepA) : Given at 12 months and 2 yers and older(2 doses) .");
            System.out.println("2.Diphtheria,tentanus,pertussis (DTaP): 4th dose given at 15 months(total 5doses).");
            System.out.println("3.Inactive Poliovirus Vaccine(IPV): Given at 2months , 6-18 months and 4-6 years.");
            System.out.println("4.Haemophilus Influenzae type B(Hib):1st dose given at 2 months and 3 doses are given at 12-15 months of age(Total 4doses).");
            System.out.println("5.Measles Mumps and Rubella (MR): 2 doses given within 16-24 months.");
            System.out.println("6.Hepatitis B(HepB):3 doses given within 6-18 months.");
            System.out.println("7.Chickenpox: 1st dose given at 12-15 months and 2nd dose to 4-6 years old.");
            System.out.println("8.Pneumococcal conjugate vaccine(PCV13):Given at 2,4,6 and 12-15 months (4 doses).");
            
        	 // Create a list
            HashMap<Integer,String> map=new HashMap<>();
        	map.put(1," Hepatitis A (HepA) : Given at 12 months and 2 yers and older(2 doses) .");
        	map.put(2," Diphtheria,tentanus,pertussis (DTaP): 4th dose given at 15 months(total 5doses).");
        	map.put(3," Inactive Poliovirus Vaccine(IPV): Given at 2months , 6-18 months and 4-6 years.");
        	map.put(4," Haemophilus Influenzae type B(Hib):1st dose given at 2 months and 3 doses are given at 12-15 months of age(Total 4doses).");
        	map.put(5," Measles Mumps and Rubella (MR): 2 doses given within 16-24 months.");
        	map.put(6," Hepatitis B(HepB):3 doses given within 6-18 months.");
        	map.put(7," Chickenpox: 1st dose given at 12-15 months and 2nd dose to 4-6 years old.");
        	map.put(8," Pneumococcal conjugate vaccine(PCV13):Given at 2,4,6 and 12-15 months (4 doses).");
       
        System.out.print("\nEnter the serial numbers of vaccines already taken (separated by spaces): ");
        String input = sc1.nextLine();

        // Split the input by spaces
        if (input.equals("0")) {
            System.out.println(map);
        } else {
            String[] keysToRemove = input.split("\\s+");
            for (String keyStr : keysToRemove) {
                try {
                    int key = Integer.parseInt(keyStr);
                    if (!map.containsKey(key)) {
                        System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                        System.exit(0); // Terminate the program if invalid input is detected
                    }
                    map.remove(key);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                    System.exit(0); // Terminate the program if invalid input format is detected
                }
            }
            
            // Print the updated map
            System.out.println("\nAccording to your child's age group and your selected choices, here is a list of vaccinations that need to be taken:");
            for (String value : map.values()) {
                System.out.println(value);
            }
        }

        }
//----------------------------------------------------------------------------------------------- 
        else if(years>2 && years<=4)
        {
        	System.out.println(ANSI_BOLD+"\nSo,given are the vaccinations for this age:"+ANSI_RESET);
            System.out.println("1.Diphtheria, Tetanus, Pertussis (DTaP) Vaccine: Booster dose given at 4 to 6 years of age");
            System.out.println("2.Inactivated Polio Vaccine (IPV): Booster dose given at 4 to 6 years of age.");
            System.out.println("3.Measles, Mumps, and Rubella (MMR) Vaccine: Booster dose given at 4 to 6 years of age.");
            System.out.println("4.Typhoid Conjugate Vaccine (TCV).");
            System.out.println("5.Japanese Encephalitis (JE) Vaccine:Depending on the risk of exposure, the vaccine may be given between 1 to 3 years of age.");
            System.out.println("6.Influenza Vaccine.");
            
        	 // Create a list
            HashMap<Integer,String> map=new HashMap<>();
        	map.put(1," Diphtheria, Tetanus, Pertussis (DTaP) Vaccine: Booster dose given at 4 to 6 years of age");
        	map.put(2," Inactivated Polio Vaccine (IPV): Booster dose given at 4 to 6 years of age. ");
        	map.put(3," Measles, Mumps, and Rubella (MMR) Vaccine: Booster dose given at 4 to 6 years of age.");
        	map.put(4," Typhoid Conjugate Vaccine (TCV).");
        	map.put(5," Japanese Encephalitis (JE) Vaccine:Depending on the risk of exposure, the vaccine may be given between 1 to 3 years of age.");
        	map.put(6," Influenza Vaccine");
       
        System.out.print("\nEnter the serial numbers of vaccines already taken (separated by spaces): ");
        String input = sc1.nextLine();

        if (input.equals("0")) {
            System.out.println(map);
        } else {
            String[] keysToRemove = input.split("\\s+");
            for (String keyStr : keysToRemove) {
                try {
                    int key = Integer.parseInt(keyStr);
                    if (!map.containsKey(key)) {
                        System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                        System.exit(0); // Terminate the program if invalid input is detected
                    }
                    map.remove(key);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                    System.exit(0); // Terminate the program if invalid input format is detected
                }
            }
            
            // Print the updated map
            System.out.println("\nAccording to your child's age group and your selected choices, here is a list of vaccinations that need to be taken:");
            for (String value : map.values()) {
                System.out.println(value);
            }
        }

        }
//----------------------------------------------------------------------------------------------- 
        else if(years>4 && years<=6)
        {
        	System.out.println(ANSI_BOLD+"\nSo,given are the vaccinations for this age:"+ANSI_RESET);
            System.out.println("1.Chickenpox (varicella): 2nd dose");
            System.out.println("2.Diphtheria,Tetanus and Whooping Cough(pertussis)(DTaP): 5th dose.");
            System.out.println("3.Influenza(flu).");
            System.out.println("4.Measles,Mumps and Rubella (MMR): 2nd dose");
            System.out.println("5.Polio (IPV): 4th dose.");
            System.out.println("6.Diphtheria Pertussis & Tetanus (DPT): Booster 2 (Second dose).");
            
        	 // Create a list
            HashMap<Integer,String> map=new HashMap<>();
        	map.put(1," Chickenpox (varicella): 2nd dose.");
        	map.put(2," Diphtheria,Tetanus and Whooping Cough(pertussis)(DTaP): 5th dose.");
        	map.put(3," Influenza(flu).");
        	map.put(4," Measles,Mumps and Rubella (MMR): 2nd dose.");
        	map.put(5," Polio (IPV): 4th dose.");
        	map.put(6," Diphtheria Pertussis & Tetanus (DPT): Booster 2 (Second dose).");
       
        System.out.print("\nEnter serial numbers of vaccines already taken (separated by spaces): ");
        String input = sc1.nextLine();

        if (input.equals("0")) {
            System.out.println(map);
        } else {
            String[] keysToRemove = input.split("\\s+");
            for (String keyStr : keysToRemove) {
                try {
                    int key = Integer.parseInt(keyStr);
                    if (!map.containsKey(key)) {
                        System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                        System.exit(0); // Terminate the program if invalid input is detected
                    }
                    map.remove(key);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input: \"" + keyStr + "\" is not a valid serial number.");
                    System.exit(0); // Terminate the program if invalid input format is detected
                }
            }
            
            // Print the updated map
            System.out.println("\nAccording to your child's age group and your selected choices, here is a list of vaccinations that need to be taken:");
            for (String value : map.values()) {
                System.out.println(value);
            }
			if(map.isEmpty())
			{
				System.out.println("Congratulations,You are fully vaccinated according to your age group !");
			}
        }

        }
        if(years<=6 ){
        System.out.println("\nDoes your child come under any of the below mentioned category:(Enter "+ANSI_BOLD+"1 for Yes "+ANSI_RESET+"and"+ANSI_BOLD+" 0 for No"+ANSI_RESET+")?\n1.Severe allergies or allergic reactions to vaccine components.\r\n"
        	    + "2.History of severe allergic reactions (anaphylaxis) to previous vaccinations.\r\n"
        	    + "3.Immune system disorders or conditions that weaken the immune system, such as HIV/AIDS, leukemia, or other cancers.\r\n"
        	    + "4.History of seizures or convulsions.\r\n"
        	    + "5.Previous adverse reactions to vaccines.\r\n"
        	    + "6.Current illness or fever.\r\n"
        	    + "7.Recent administration of certain medications or treatments that may affect the immune system.\r\n" 
        	    + "8.Preterm birth or low birth weight.\r\n"
        	    + "9.Family history of adverse reactions to vaccines.");
        	int ans = sc1.nextInt();
        	try {
        	    if (ans == 1) {
        	        // Strings are equal
        	        System.out.println("It is recommended to consult a doctor before taking the vaccination");
        	        System.out.println("Do you want to book an appointment?(Enter "+ANSI_BOLD+"1 for Yes "+ANSI_RESET+"and"+ANSI_BOLD+" 0 for No"+ANSI_RESET+")");
        	        int ans1 = sc1.nextInt();

        	        if (ans1 == 1) {
        	            // The user wants to book an appointment
						
        	            System.out.println("Enter your residential address pincode:(Example:411002)");
        	            int sourcePincode = sc1.nextInt();
        	            Vaccine[] nodes = {
        	                    new Vaccine(0, 411052),
        	                    new Vaccine(1, 411058),
        	                    new Vaccine(2, 411004),
        	                    new Vaccine(3, 411038),
        	                    new Vaccine(4, 411042),
        	                    new Vaccine(5, 411005),
        	                    new Vaccine(6, 411007),
        	                    new Vaccine(7, 411045),
        	                    new Vaccine(8, 411001),
        	                    new Vaccine(9, 411028),
        	                    new Vaccine(10, 411046),
        	                    new Vaccine(11, 411002)
        	            };
        	  
        	            int graph[][] = new int[][]{
        	                {0,4,2,3,0,0,0,0,0,0,0,0},
        	                {4,0,0,0,0,0,0,0,0,0,10,0},
        	                {2,0,0,3,0,0,0,0,0,0,0,0},
        	                {3,0,3,0,7,0,15,11,0,0,0,0},
        	                {0,0,0,7,0,5,12,13,0,9,0,4},
        	                {0,0,0,0,5,0,6,8,2,0,0,0},
        	                {0,0,0,15,12,6,0,4,0,0,0,0},
        	                {0,0,0,11,13,8,4,0,0,0,0,0},
        	                {0,0,0,0,0,2,0,0,0,0,0,0},
        	                {0,0,0,0,9,0,0,0,0,0,13,0},
        	                {0,10,0,0,0,0,0,0,0,13,0,0},
        	                {0,0,0,0,4,0,0,0,0,0,0,0}
        	            };
        	            Vaccine source = findNodeByPincode(nodes, sourcePincode);
        	            if (source != null) {
        	                DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        	                dijkstra.dijkstra(graph, source, nodes);
        	            } else {
        	                System.out.println("Please enter a valid pincode !");

        	            }   
        	        } else if (ans1 == 0) {
        	            // The user does not want to book an appointment
        	            System.out.println(ANSI_BOLD + "Thank you!!\nStay Safe and Stay Healthy" + ANSI_RESET);   
        	        } else {
        	            // Invalid input for ans1
        	            System.out.println("Please enter the answer in Yes(1) or No(0)");
        	        }
				
        	    } else if (ans == 0) {
        	        // The user does not come under any of the mentioned categories
        	        System.out.println("Your child is eligible to take the above mentioned vaccinations.\nWould you like to book an appointment?(Enter "+ANSI_BOLD+"1 for Yes "+ANSI_RESET+"and"+ANSI_BOLD+" 0 for No"+ANSI_RESET+")");
        	        int ans2 = sc1.nextInt();
        	        try {
        	            if (ans2 == 1) {
        	                // The user wants to book an appointment
        	                System.out.println("Enter your residential address pincode:(Example:411002)");
        	                int sourcePincode = sc1.nextInt();
        	                Vaccine[] nodes = {
        	                        new Vaccine(0, 411052),
        	                        new Vaccine(1, 411058),
        	                        new Vaccine(2, 411004),
        	                        new Vaccine(3, 411038),
        	                        new Vaccine(4, 411042),
        	                        new Vaccine(5, 411005),
        	                        new Vaccine(6, 411007),
        	                        new Vaccine(7, 411045),
        	                        new Vaccine(8, 411001),
        	                        new Vaccine(9, 411028),
        	                        new Vaccine(10, 411046),
        	                        new Vaccine(11, 411002)
        	                };
        	  
        	                int graph[][] = new int[][]{
        	                    {0,4,2,3,0,0,0,0,0,0,0,0},
        	                    {4,0,0,0,0,0,0,0,0,0,10,0},
        	                    {2,0,0,3,0,0,0,0,0,0,0,0},
        	                    {3,0,3,0,7,0,11,11,0,0,0,0},
        	                    {0,0,0,7,0,5,13,13,0,9,0,4},
        	                    {0,0,0,0,5,0,8,8,2,0,0,0},
        	                    {0,0,0,11,13,8,0,0,0,0,0,0},
        	                    {0,0,0,11,13,8,0,0,0,0,0,0},
        	                    {0,0,0,0,0,2,0,0,0,0,0,0},
        	                    {0,0,0,0,9,0,0,0,0,0,13,0},
        	                    {0,10,0,0,0,0,0,0,0,13,0,0},
        	                    {0,0,0,0,4,0,0,0,0,0,0,0}
        	                };
        	                Vaccine source = findNodeByPincode(nodes, sourcePincode);
        	                if (source != null) {
        	                    DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        	                    dijkstra.dijkstra(graph, source, nodes);
        	                } else {
        	                    System.out.println("Please enter a valid pincode !");
        	                }   
        	            } else if (ans2 == 0) {
        	                // The user does not want to book an appointment
        	                System.out.println(ANSI_BOLD + "Thank you!!\nStay Safe and Stay Healthy" + ANSI_RESET);
        	            } else {
        	                // Invalid input for ans2
        	                System.out.println("Please enter the answer in Yes(1) or No(0)");
        	            }
        	        } catch (InputMismatchException e) {
        	            // Handle non-integer input
        	            System.out.println("Please enter the answer in Yes(1) or No(0)");
        	        }
        	    } else {
        	        // Invalid input for ans
        	        System.out.println("Please enter the answer in Yes(1) or No(0)");
        	    }
        	} catch (InputMismatchException e) {
        	    // Handle non-integer input
        	    System.out.println("Please enter the answer in Yes(1) or No(0).");
        	}
        	sc1.close();
		}
		else{
			System.out.println("Enter valid age !");
		}
                }
	public static Vaccine findNodeByPincode(Vaccine[] nodes,int pincode) {
		for(Vaccine node:nodes) {
			if(node.getValue()==pincode) {
				return node;
			}
		
	}
		return null;
    }
	}
 class DijkstraAlgorithm{
		private static final int V=12;
		public static final String ANSI_RESET = "\u001B[0m";
                public static final String ANSI_BOLD = "\u001B[1m";
			private int minDistance(int[] dist,boolean[] sptSet) {
				int min=Integer.MAX_VALUE;
				int minIndex=-1;
				for(int v=0;v<V;v++) {
				if(!sptSet[v] && dist[v]<=min) {
				min=dist[v];
				minIndex=v;
				}
				}
				return minIndex;
			}

			private void  printSolution(int[] dist, Vaccine[] nodes) {
				int minDistance=Integer.MAX_VALUE;
				int minPincode=-1;
				

			    for (int i = 0; i < V; i++) {
			        int pincode = nodes[i].getValue();
			        if ((pincode == 411045 || pincode == 411002 || pincode == 411001 || pincode == 411004) && dist[i]<minDistance) {

			        	minDistance=dist[i];
			        	minPincode=pincode;
			        }
			    }
			    if(minPincode==411045) {
			    	System.out.println("Hospital name:"+ANSI_BOLD+" Umarji mother and childcare hospital,Baner-411045"+ANSI_RESET);
			    	System.out.println("Distance from your address to the hospital is:"+ANSI_BOLD+""+minDistance+" km"+ANSI_RESET);
			    }
			    if(minPincode==411002) {
			    	System.out.println("Hospital name:"+ANSI_BOLD+" Kamla nehru hospitla, Kasba Peth-411002"+ANSI_RESET);
			    	System.out.println("Distance from your address to the hospital is:"+ANSI_BOLD+""+minDistance+" km"+ANSI_RESET);
			    }
			    if(minPincode==411001) {
			    	System.out.println("Hospital name:"+ANSI_BOLD+" B.J.Government Medical college and Sassoon  general hospital, Railway Station Road-411001"+ANSI_RESET);
			    	System.out.println("Distance from your address to the hospital is:"+ANSI_BOLD+""+minDistance+" km"+ANSI_RESET);
			    }
			    if(minPincode==411004) {
			    	System.out.println("Hospital name:"+ANSI_BOLD+" K.Yashwantrao Vishnu Tharkade Dawakhana, Erandwane-411004"+ANSI_RESET);
			    	System.out.println("Distance from your address to the hospital is:"+ANSI_BOLD+""+minDistance+" km"+ANSI_RESET);
			    }
				System.out.println("We hope that we were of help to provide the information about the vaccinations you were looking for.\nSo let us all come together and educate society about vaccination.");
			}
			 
		    public void dijkstra(int[][]graph,Vaccine src, Vaccine[] nodes) 
		    {
			int[] dist=new int[V];
			boolean[] sptSet=new boolean[V];
			Arrays.fill(dist, Integer.MAX_VALUE);
			Arrays.fill(sptSet, false);
			dist[src.id]=0;
			for(int count=0;count<V-1;count++) {
			int u=minDistance(dist,sptSet);
			sptSet[u]=true;
			for(int v=0;v<V;v++) {
			if(!sptSet[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v]) {
				dist[v]=dist[u]+graph[u][v];
			}
			}
			}
			printSolution(dist,nodes);
		   }
	}

 
	




