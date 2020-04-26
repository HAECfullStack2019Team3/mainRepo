package projects.visitcrete.tour;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TourController {

    private TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping(path = "gettours/{id}")
    public ResponseEntity<List<TourToReturn>> getTours(@PathVariable int id){

        return new ResponseEntity<List<TourToReturn>>(tourService.GetToursInPackage(id) , HttpStatus.OK);
    }
}

