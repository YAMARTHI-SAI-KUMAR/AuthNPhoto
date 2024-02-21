package ImageBl.demo.Dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImageDto {

    private String name;
    private String type;
    private byte[] imageData;
    
}
