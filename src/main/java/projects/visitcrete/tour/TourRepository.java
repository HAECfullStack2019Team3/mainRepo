package projects.visitcrete.tour;

import org.springframework.data.repository.CrudRepository;
import projects.visitcrete.tourpackage.TourPackage;

import java.util.List;

public interface TourRepository extends CrudRepository<Tour , Integer> {

   List<Tour>  findByContaindInTourPackagesId(int id );
}

