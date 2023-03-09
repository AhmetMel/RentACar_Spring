package springboot.rentACar.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.rentACar.Entities.Concretes.Brand;

import java.util.List;


public interface BrandDao extends JpaRepository<Brand,Integer> {
}