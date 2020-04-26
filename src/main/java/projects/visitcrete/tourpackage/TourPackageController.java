package projects.visitcrete.tourpackage;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TourPackageController {
    private TourPackageService service;

    public TourPackageController(TourPackageService service) {
        this.service = service;
    }

    @GetMapping(path = "GetAllTourPackages")
    public ResponseEntity<List<TourPackageToReturn>> getAllPackages(){

       return new ResponseEntity<List<TourPackageToReturn>>(service.GetAllTourPackages() , HttpStatus.OK);
    }
}
