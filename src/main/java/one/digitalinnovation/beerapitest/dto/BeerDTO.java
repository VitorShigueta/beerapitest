package one.digitalinnovation.beerapitest.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerapitest.enums.BeerType;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.StackManipulation;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {

    private Long id;

    @NotNull
    @Size(min = 1, max = 200)
    private String name;

    @NotNull
    @Size(min = 1, max = 200)
    private String brand;

    @NotNull
    @Max(500)
    private Integer max;

    @NotNull
    @Max(100)
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @NotNull
    private BeerType type;
}
