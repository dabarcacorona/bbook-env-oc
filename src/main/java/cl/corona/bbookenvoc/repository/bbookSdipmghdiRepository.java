package cl.corona.bbookenvoc.repository;

import cl.corona.bbookenvoc.model.bbookSdipmghdi;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public interface bbookSdipmghdiRepository extends CrudRepository<bbookSdipmghdi, Long> {

    List<bbookSdipmghdi> findByDownloadDate1IsNullAndBatchNum(long batchNum);

    @Modifying(clearAutomatically = true)
    @Query(value = "update app_sam.bbook_sdipmghdi s set s.download_date_1 = sysdate where batch_num = :batchNum", nativeQuery = true)
    public void updSdipmghdi(@Param("batchNum") long batchNum);

}
