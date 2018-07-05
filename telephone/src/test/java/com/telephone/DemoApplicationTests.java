package com.telephone;

import com.telephone.model.Telephone;
import com.telephone.service.ITelephoneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	ITelephoneService telephoneService;

	@Test
	public void appTest() {
		for (int i = 0; i < 9; i++) {
			Telephone telephone = new Telephone();
			telephone.setTelephone("1665547889"+i);
			telephone.setName("test00"+i);
			telephoneService.save(telephone);
		}
		List<Telephone> all = telephoneService.getAll();

		// test save function
		System.out.println("test save function");
		for (Telephone tel : all) {
			System.out.println("find " + tel.getTelephone() + ":" + tel.getName());
		}

	// test delete function

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("test delete function");
        System.out.println("");


//        telephoneService.delete(1);

        for(Integer i = 0; i < 9; i++){
            telephoneService.delete(0);

        }

        List<Telephone> update = telephoneService.getAll();
        if (update.isEmpty()){
            System.out.println("delete all person successfully");
            System.out.println("");
            System.out.println("");
        }else {
            for (Telephone b : update) {
                System.out.println("find " + b.getTelephone() + ":" + b.getName());
            }
        }



	}

}
