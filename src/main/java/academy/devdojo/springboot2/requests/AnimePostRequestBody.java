package academy.devdojo.springboot2.requests;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {
    // Validation
    @NotEmpty(message = "The anime name cannot be empty")
    private String name;
    @URL(message=" The URL is not valid")
    private String url;

}
