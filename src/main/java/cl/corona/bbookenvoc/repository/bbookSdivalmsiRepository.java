package cl.corona.bbookenvoc.repository;



import cl.corona.bbookenvoc.model.bbookSdivalmsi;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface bbookSdivalmsiRepository extends CrudRepository<bbookSdivalmsi, Long> {

    List<bbookSdivalmsi> findByDownloadDate1IsNullAndBatchNum(long batchNum);

    @Modifying(clearAutomatically = true)
    @Query(value = "update app_sam.bbook_sdivalmsi s set s.download_date_1 = sysdate where batch_num = :batchNum", nativeQuery = true)
    public void updSdiValmsi(@Param("batchNum") long batchNum);

}