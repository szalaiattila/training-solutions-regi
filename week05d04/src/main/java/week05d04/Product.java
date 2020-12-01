package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate expireDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        expireDate = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }
    public boolean isExpireDate() {
        return expireDate;
    }
    public LocalDate getExpiredDate() {
        if (expireDate.isBefore(LocalDate.now())){
            rerturn true;
        }
        return false;
    }
}
