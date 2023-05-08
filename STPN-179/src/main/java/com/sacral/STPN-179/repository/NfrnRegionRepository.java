import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NfrnRegionRepository extends JpaRepository<NfrnRegion, Long> {

    @Query("SELECT r FROM NfrnRegion r WHERE r.regionId = ?1 AND r.level = 255")
    NfrnRegion findByRegionIdAndLevel(Long regionId);

}