package com.addreesbook;

import java.util.ArrayList;

public class MultipleAddreessBook  extends AddressBookSystem {
	
	public void  addNewAddressbook () {
		
		//String newAddressBookname  = sc.next();
		while (true) {
				System.out.println("Choose what you want to do: ");
				System.out.println("1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
				int choose = sc.nextInt();

				if (choose == 4) {
					System.out.println("Exited");
					break;
				}

				switch (choose) {
				case 1:
					System.out.println("Enter the name of address book: ");
					String address_name = sc.next();

					if (hashmap.containsKey(address_name)) {
						System.out.println("Adress book name exits, enter different name");
						break;
					}

					ArrayList<Contacts> new_address_book = new ArrayList<>();
					arrayDetails = new_address_book;
					while (true) {
						System.out.println("Choose what you want to do: ");
						System.out
								.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display Contact\n5.Exit");
						int choose1 = sc.nextInt();
						if (choose1 == 4) {
							System.out.println("Exited");
							break;
						}
						switch (choose1) {
						case 1:
							details.addDetails();
							break;
						case 2:
							details.editDetails();
							break;
						case 3:
							details.deleteDetails();
							break;
						case 4:
							details.display();
							break;
						default:
							System.out.println("Choose valid option");
							break;
						}
						hashmap.put(address_name, arrayDetails);
						System.out.println(hashmap);
					}
					break;

				case 2:
					System.out.println("Enter the name of address book: ");
					String address_name_old = sc.next();

					if (hashmap.containsKey(address_name_old)) {

						ArrayList<Contacts> old_address_book = new ArrayList<>();
						arrayDetails = old_address_book;
						arrayDetails = hashmap.get(address_name_old);
						while (true) {
							System.out.println("Choose what you want to do: ");
							System.out.println(
									"1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Display contact.\n5.Exit");
							int choose1 = sc.nextInt();
							if (choose1 == 4) {
								System.out.println("Exited");
								break;
							}
							switch (choose1) {
							case 1:
								details.addDetails();
								break;
							case 2:
								details.addDetails();
								break;
							case 3:
								details.addDetails();
								break;
							case 4:
								details.display();
								break;
							default:
								System.out.println("Choose valid option");
								break;
							}
							hashmap.put(address_name_old, arrayDetails);
							System.out.println(hashmap);
						}
					} else {
						System.out.println("Enter valid address book name");
					}
					break;

				case 3:
					System.out.println(hashmap);
					break;

				default:
					System.out.println("Enter valid option");

				}
			}
		}
		
			
		
	}


