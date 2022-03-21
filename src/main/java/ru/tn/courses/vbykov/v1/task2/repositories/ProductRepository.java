package ru.tn.courses.vbykov.v1.task2.repositories;
import ru.tn.courses.vbykov.v1.task2.enums.BrandEnum;
import ru.tn.courses.vbykov.v1.task2.enums.ColorEnum;
import ru.tn.courses.vbykov.v1.task2.enums.OperatingSystemEnum;
import ru.tn.courses.vbykov.v1.task2.enums.DisplayResolutionEnum;
import ru.tn.courses.vbykov.v1.task2.models.Smartphone;
import ru.tn.courses.vbykov.v1.task2.models.Product;
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
                new Smartphone(
                        getSize(),
                        ColorEnum.BLUE.getValue(),
                        BrandEnum.Samsung.getValue(),
                        1500,
                        DisplayResolutionEnum.PLUS.getValue(),
                        OperatingSystemEnum.Android.getValue(),
                        8));
        save(
                new Smartphone(
                        getSize(),
                        ColorEnum.BLACK.getValue(),
                        BrandEnum.Xiaomi.getValue(),
                        1500,
                        DisplayResolutionEnum.STANDART.getValue(),
                        OperatingSystemEnum.Android.getValue(),
                        10));
        save(
                new Smartphone(
                        getSize(),
                        ColorEnum.WHITE.getValue(),
                        BrandEnum.Huawei.getValue(),
                        2000,
                        DisplayResolutionEnum.STANDART.getValue(),
                        OperatingSystemEnum.Ubuntu_Touch.getValue(),
                        15));
    }
}
