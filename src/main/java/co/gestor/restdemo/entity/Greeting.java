
package co.gestor.restdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel("Model Greeting")
public class Greeting {
    private Long id;
    @ApiModelProperty(value = "the Greeting's content", required = false)
    private String content;

}