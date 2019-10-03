//package za.ac.cput.security;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//import za.ac.cput.domain.commutors.Commutor;
//import za.ac.cput.factory.commutor.CommutorFactory;
//import za.ac.cput.helper.Misc;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class SecurityConfigurationTest {
//
//        @Autowired
//    private TestRestTemplate restTemplate;
//    private String url = "http://localhost:8080/busdetails";
//
//    @Before
//    public void addBeforeData(){
//       Commutor com  = CommutorFactory.getCommutor("Jay", "Fraanz", Misc.generateId(),100);
//       ResponseEntity<Commutor> postResponse = restTemplate.postForEntity(url + "/new", com, Commutor.class);
//    }
//
//    @Test
//    public void correctCredentials200Ok() throws Exception{
//        ResponseEntity<String> response = restTemplate.withBasicAuth("admin","admin").getForEntity(url + "/getall", String.class);
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getBody());
//        System.out.println("something");
//        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
//    }
//
//    @Test
//    public void innCorrectCredentials401() throws Exception{
//        ResponseEntity<String> response = restTemplate.withBasicAuth("administrator","admins").getForEntity(url + "/getall",String.class);
//
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getBody());
//
//        Assert.assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
//
//    }
//
//}