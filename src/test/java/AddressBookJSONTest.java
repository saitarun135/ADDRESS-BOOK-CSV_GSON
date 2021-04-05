/**
 https://howtodoinjava.com/gson/gson-serialize-deserialize-json/
 toJson -->serialization
 fromJson -->De-serialization
 setPrettyPrinting().create();  -->proper readable way of printing
 Gson gson = new Gson();    -->pre defined class
 Gson gson = new GsonBuilder() -->customization gson
 **/
 import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AddressBookJSONTest {
    @Test
    public void givenJSONFile_WhenRead_ShouldReturnTrue(){
        AddressBookJSON json=new AddressBookJSON();
        boolean result=json.jsonRead();
        Assert.assertTrue(result);
    }
    @Test
    public void givenJSONFile_WhenWrite_ShouldReturnTrue() throws IOException {
        AddressBookJSON json = new AddressBookJSON();
        ContactInfo contact1 = new ContactInfo("Sai","Tarun","pelluru","ongole","Andhrapradesh",523001,
                "864044255","saitarun800@gmail.com");
       // ContactInfo contact2=new ContactInfo("sravani","Lakshmi","MM-Road","ongole","AndhraPradesh",523001,
         //                                       "880220020","sravspup@gamau.in");
        boolean result1=json.jsonWrite(contact1);
        //boolean result2=json.jsonWrite(contact2);
        Assert.assertTrue(result1);
        //Assert.assertTrue(result2);
    }
}
