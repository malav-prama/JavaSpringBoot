import com.example.practice.Address;
import com.example.practice.AddressController;
import com.example.practice.AddressLogic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {

   @Mock
   AddressLogic addressLogic;

   AddressController addressController;
   @BeforeEach
   public void setup(){
       addressController=new AddressController();

       addressController.setAddressLogic(addressLogic);

   }

  //  @Test
//    public void getAddressTest_positive()
//    {
//        Address addTemp=new Address();
//        addTemp.setCity("tempe");
//
//        when(addressLogic.getAddress("1761")).thenReturn(addTemp);
//
//
//        Address address = addressController.getAddress("1761");
//        assertNotNull(address);
//        assertEquals(address.getCity(), "tempe");
//    }

//    @Test
//    public void getAddressTest_street()
//    {
//        Address addTemp=new Address();
//        addTemp.setStreetName("Rural");
//
//        when(addressLogic.getAddress("1761")).thenReturn(addTemp);
//
//
//        Address address = addressController.getAddress("1761");
//        assertNotNull(address);
//    }

//
//    @Test
//    public void getAddressTest_negative()
//    {
//        when(addressLogic.getAddress("1762")).thenReturn(null);
//        Address address = addressController.getAddress("1762");
//        assertNull(address);
//    }

}
