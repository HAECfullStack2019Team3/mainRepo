package projects.visitcrete.tour;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourService {
    private TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public List<TourToReturn> GetToursInPackage(int i){

        List<Tour> tourList  = tourRepository.findByContaindInTourPackagesId(i);
        List<TourToReturn> tourToReturnList = new ArrayList<>();

        for(Tour t : tourList){
            tourToReturnList.add(mapAtoB(t));
        }
        return  tourToReturnList;
    }

    public TourToReturn  mapAtoB(Tour t){

        return  new TourToReturn(t.getTitle() , t.getDescription() , t.getPrice() , t.getDuration() , t.getRegion());
    }
}
