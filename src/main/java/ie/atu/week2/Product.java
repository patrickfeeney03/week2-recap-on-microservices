package ie.atu.week2;

import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    @NonNull
    private String name;
    @Min(value = 0, message = "Price can't be negative")
    private float price;
}
