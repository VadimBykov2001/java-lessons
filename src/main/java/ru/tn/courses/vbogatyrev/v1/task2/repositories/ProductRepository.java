package ru.tn.courses.vbogatyrev.v1.task2.repositories;

import ru.tn.courses.vbogatyrev.v1.task2.enums.BrandEnum;
import ru.tn.courses.vbogatyrev.v1.task2.enums.ColorEnum;
import ru.tn.courses.vbogatyrev.v1.task2.enums.DriveEnum;
import ru.tn.courses.vbogatyrev.v1.task2.enums.TransmissionEnum;
import ru.tn.courses.vbogatyrev.v1.task2.models.Car;
import ru.tn.courses.vbogatyrev.v1.task2.models.Product;

import java.util.ArrayList;

public class ProductRepository extends RepositoryImpl<Product> {

    private static ProductRepository instance;
    public static ProductRepository getInstance(){
        if(instance == null){
            instance = new ProductRepository();
        }
        return instance;
    }

    private ProductRepository() {
        super(new ArrayList<>());
        save(
                new Car(
                        getSize(),
                        ColorEnum.BLUE.getValue(),
                        BrandEnum.VAZ.getValue(),
                        1500,
                        TransmissionEnum.AUTOMATIC.getValue(),
                        DriveEnum.FRONT.getValue(),
                        8));
        save(
                new Car(
                        getSize(),
                        ColorEnum.GREEN.getValue(),
                        BrandEnum.AUDI.getValue(),
                        1500,
                        TransmissionEnum.MANUAL.getValue(),
                        DriveEnum.REAR.getValue(),
                        10));
        save(
                new Car(
                        getSize(),
                        ColorEnum.BLUE.getValue(),
                        BrandEnum.BMW.getValue(),
                        2000,
                        TransmissionEnum.AUTOMATIC.getValue(),
                        DriveEnum.FRONT.getValue(),
                        15));
    }
}
