package springboot.rentACar.WebApi.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springboot.rentACar.Business.Abstracts.ModelService;
import springboot.rentACar.Business.Requests.CreateModelRequest;
import springboot.rentACar.Business.Responses.GetAllModelsResponse;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;
    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@Valid() CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }
}
