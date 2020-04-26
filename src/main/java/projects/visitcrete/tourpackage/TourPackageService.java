package projects.visitcrete.tourpackage;

import org.springframework.stereotype.Service;
import projects.visitcrete.tourpackage.TourPackagaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourPackageService {
    private TourPackagaRepository tourPackageRepository;

    public TourPackageService(TourPackagaRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public List<TourPackageToReturn> GetAllTourPackages(){

        List<TourPackageToReturn> packageToReturn = new ArrayList<TourPackageToReturn>();
        Iterable<TourPackage> result = tourPackageRepository.findAll();

        for(TourPackage i : result){

            packageToReturn.add(mapAtoB(i));
        }
        return packageToReturn;
    }

    public TourPackageToReturn mapAtoB(TourPackage tourPackage){

        return new TourPackageToReturn(tourPackage.getId(),tourPackage.getName());
   }
}
