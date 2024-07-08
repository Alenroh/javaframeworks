package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final InhousePartRepository InhousePartRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository OutsourcedPartRepository;

    public BootStrapData(InhousePartRepository InhousePartRepository, ProductRepository productRepository, OutsourcedPartRepository OutsourcedPartRepository) {
        this.InhousePartRepository = InhousePartRepository;
        this.productRepository = productRepository;
        this.OutsourcedPartRepository = OutsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if  (InhousePartRepository.count() == 0) {
            initializeInhouseParts();
            initializeOutsourcedParts();
        }
        if (InhousePartRepository.count() == 0) {
            initializeInhouseParts();
            initializeOutsourcedParts();
        }

        if (productRepository.count() == 0) {
            initializeProducts();
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products: " + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts: " + InhousePartRepository.count());
        System.out.println(InhousePartRepository.findAll());
        System.out.println("Number of Parts: " + OutsourcedPartRepository.count());
        System.out.println(OutsourcedPartRepository.findAll());
    }

    private void initializeOutsourcedParts() {
        OutsourcedPart outsourcedPart1 = new OutsourcedPart();
        outsourcedPart1.setCompanyName("TechParts Ltd");
        outsourcedPart1.setName("Power Capacitor");
        outsourcedPart1.setInv(5);
        outsourcedPart1.setPrice(20.0);
        outsourcedPart1.setId(101L);
        outsourcedPart1.setPartId(995);
        outsourcedPart1.setMin(0);
        outsourcedPart1.setMax(100);
        OutsourcedPartRepository.save(outsourcedPart1);

        OutsourcedPart outsourcedPart2 = new OutsourcedPart();
        outsourcedPart2.setCompanyName("Global Components Inc.");
        outsourcedPart2.setName("High Efficiency Motor");
        outsourcedPart2.setInv(3);
        outsourcedPart2.setPrice(25.0);
        outsourcedPart2.setId(102L);
        outsourcedPart2.setPartId(996);
        outsourcedPart2.setMin(0);
        outsourcedPart2.setMax(100);
        OutsourcedPartRepository.save(outsourcedPart2);

        OutsourcedPart outsourcedPart3 = new OutsourcedPart();
        outsourcedPart3.setCompanyName("TechMasters Corp.");
        outsourcedPart3.setName("LED Display Panel");
        outsourcedPart3.setInv(7);
        outsourcedPart3.setPrice(18.5);
        outsourcedPart3.setId(103L);
        outsourcedPart3.setPartId(997);
        outsourcedPart3.setMin(0);
        outsourcedPart3.setMax(100);
        OutsourcedPartRepository.save(outsourcedPart3);

        OutsourcedPart outsourcedPart4 = new OutsourcedPart();
        outsourcedPart4.setCompanyName("Appliance Solutions LLC");
        outsourcedPart4.setName("Water Pump Assembly");
        outsourcedPart4.setInv(10);
        outsourcedPart4.setPrice(15.0);
        outsourcedPart4.setId(104L);
        outsourcedPart4.setPartId(998);
        outsourcedPart4.setMin(0);
        outsourcedPart4.setMax(100);
        OutsourcedPartRepository.save(outsourcedPart4);

        OutsourcedPart outsourcedPart5 = new OutsourcedPart();
        outsourcedPart5.setCompanyName("PartsXpress Ltd.");
        outsourcedPart5.setName("Temperature Sensor Module");
        outsourcedPart5.setInv(2);
        outsourcedPart5.setPrice(30.0);
        outsourcedPart5.setId(105L);
        outsourcedPart5.setPartId(999);
        outsourcedPart5.setMin(0);
        outsourcedPart5.setMax(100);
        OutsourcedPartRepository.save(outsourcedPart5);
    }

    private void initializeInhouseParts() {
        InhousePart inhousePart1 = new InhousePart();
        inhousePart1.setName("Heavy Duty Gearbox");
        inhousePart1.setInv(8);
        inhousePart1.setPrice(22.0);
        inhousePart1.setId(201L);
        inhousePart1.setPartId(95);
        inhousePart1.setMin(0);
        inhousePart1.setMax(100);
        InhousePartRepository.save(inhousePart1);

        InhousePart inhousePart2 = new InhousePart();
        inhousePart2.setName("Microprocessor Controller");
        inhousePart2.setInv(4);
        inhousePart2.setPrice(27.5);
        inhousePart2.setId(202L);
        inhousePart2.setPartId(96);
        inhousePart2.setMin(0);
        inhousePart2.setMax(100);
        InhousePartRepository.save(inhousePart2);

        InhousePart inhousePart3 = new InhousePart();
        inhousePart3.setName("Filtration Unit");
        inhousePart3.setInv(6);
        inhousePart3.setPrice(19.0);
        inhousePart3.setId(203L);
        inhousePart3.setPartId(97);
        inhousePart3.setMin(0);
        inhousePart3.setMax(100);
        InhousePartRepository.save(inhousePart3);

        InhousePart inhousePart4 = new InhousePart();
        inhousePart4.setName("Digital Control Panel");
        inhousePart4.setInv(12);
        inhousePart4.setPrice(16.0);
        inhousePart4.setId(204L);
        inhousePart4.setPartId(98);
        inhousePart4.setMin(0);
        inhousePart4.setMax(100);
        InhousePartRepository.save(inhousePart4);

        InhousePart inhousePart5 = new InhousePart();
        inhousePart5.setName("Pressure Release Valve");
        inhousePart5.setInv(3);
        inhousePart5.setPrice(32.0);
        inhousePart5.setId(205L);
        inhousePart5.setPartId(99);
        inhousePart5.setMin(0);
        inhousePart5.setMax(100);
        InhousePartRepository.save(inhousePart5);
    }

    private void initializeProducts() {
        Product fridge = new Product("Fridge", 899.99, 10);
        productRepository.save(fridge);

        Product washingMachine = new Product("Washing Machine", 549.99, 8);
        productRepository.save(washingMachine);

        Product microwave = new Product("Microwave Oven", 129.99, 15);
        productRepository.save(microwave);

        Product dishwasher = new Product("Dishwasher", 699.99, 6);
        productRepository.save(dishwasher);

        Product airConditioner = new Product("Air Conditioner", 799.99, 12);
        productRepository.save(airConditioner);
    }
}
