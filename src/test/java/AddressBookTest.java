import org.junit.Assert;
import org.junit.Test;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.ArrayList;

public class AddressBookTest {
    ArrayList<Contact> contact = new ArrayList<>();



    @Test
    public void whenPersonContactDetailsAddedToFil_ShouldReturn_True() {
        Contact contact1 = new Contact("Sai", "Tarun", "pelluru", "Ongole", "AndhraPradesh", 523001,7387555893L, "saitarun800@gmail.com");
        Contact contact2 =new Contact("Sravani","Lakshmi","ongole","ongole","Andhrapradesh",523001,8080808022L,"sravs@gm.in");
        AddressBookIO addressBook = new AddressBookIO();
        contact.add(contact1);
        contact.add(contact2);
        boolean isAdded = addressBook.addContact(contact);
        Assert.assertTrue(isAdded);
    }
    @Test
    public void PersonContactDetailsAddedToFile_WhenRead_ShouldReturn_True() throws IOException {
        Contact contact1 = new Contact("Sai", "Tarun", "pelluru", "Ongole", "AndhraPradesh", 523001,7387555893L, "saitarun800@gmail.com");
        Contact contact2 =new Contact("Sravani","Lakshmi","ongole","ongole","Andhrapradesh",523001,8080808022L,"sravs@gm.in");
        AddressBookIO addressBook = new AddressBookIO();
        contact.add(contact1);
        contact.add(contact2);
        boolean isAdded = addressBook.addContact(contact);
        if (isAdded) {
            boolean isRead = addressBook.viewContact();
            Assert.assertTrue(isAdded);
        }
}
    @Test
    public void givenCSV_FileWhenRead_ShouldReturnTrue() throws CsvValidationException, IOException{
    	AddressBookOpenCSV opencsv= new AddressBookOpenCSV();
    	boolean result=opencsv.readCSV();
    	Assert.assertTrue(result);
    }
    @Test
    public void givenCSVFile_WhenWrite_ShouldReturnTrue() throws IOException {
        String ADDRESS_BOOK_CSV_FILE_PATH = ".src/test/resources/AddressBook.csv";
        ArrayList<String[]> contacts = new ArrayList<>();
       String[] contact1 = {"Sai", "Tarun", "pelluru", "Ongole", "AndhraPradesh", String.valueOf(523001), String.valueOf(7387555893L), "saitarun800@gmail.com"};
       String[] contact2 ={"Sravani","Lakshmi","ongole","ongole","Andhrapradesh", String.valueOf(523001), String.valueOf(8080808022L),"sravs@gm.in"};

        contacts.add(contact1);
        contacts.add(contact2);
        AddressBookOpenCSV opencsv=new AddressBookOpenCSV();
        Boolean result = opencsv.writeCSVFile(contacts);
        Assert.assertTrue(result);
    }

}