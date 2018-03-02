package comDylan;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.fail;

/**
 * Created by dylanb on 02/03/2018.
 */
public class GameTest {
    private GameInterface game;

    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        game = (GameInterface) ctx.getBean("game");
    }
    @AfterMethod
    public void tearDown() throws Exception {
    }
    @Test
    public void testAdd() throws Exception {
        Game add = new Game();
        add.createArrayList();
        List<String> result1 =add.ArrayTest();
        Assert.assertEquals(result1,add.al);
    }

    @Configuration
    public class AppConfig {
        @Bean(name="game")
        public GameInterface getService(){
            return new Game();
        }
    }

    @Test
    public void TestArrayMethod(){
        Game add = new Game();
        add.createArrayList();
        List<String> result1 =add.ArrayTest();
        Assert.assertNotNull(result1);
        for(String eachColor: result1){
            System.out.println(eachColor);
        }

    }

    @Test
    public void TestSetMethod(){
        Game add = new Game();
        add.createSetList();
        Set<String> result2 =add.SetTest();
        Assert.assertNotNull(result2);
        System.out.println("Print out of Set values");
        for(String eachColor: result2){
            System.out.println(eachColor);
        }

    }

    @Test
    public void TestMapMethod(){
        Game add = new Game();
        add.createMapList();
        Map<Integer, String> result3 =add.MapTest();
        Assert.assertNotNull(result3);

        System.out.println("Map Keys");
        for(Integer key: result3.keySet()){
            System.out.println("Key :" +key);
        }

        System.out.println("Print out of Map Values");
        for(String value: result3.values()){
            System.out.println("Value :" +value);
        }


    }

    @Test(timeout=1000)
    public void TestTimeout(){
        Game add = new Game();
        add.createArrayList();
        add.createSetList();
        add.createMapList();
        List<String> result =add.ArrayTest();
        Assert.assertNotNull(result);
        for(String eachColor: result){
            System.out.println(eachColor);
        }
    }

    @Test
    public void TestFailure(){

        fail("Testing failure");
    }

    @Ignore
    public void ignoreTest(){
        Game add = new Game();
        add.createArrayList();
        List<String> result =add.ArrayTest();
        Assert.assertNotNull(result);
    }

}