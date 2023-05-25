package cl.corona.bbookenvoc.repository;

import cl.corona.bbookenvoc.model.bbookSdipmgdti;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface bbookSdipmgdtiRepository extends CrudRepository<bbookSdipmgdti, Long> {

    List<bbookSdipmgdti> findByDownloadDate1IsNullAndBatchNum(long batchNum);

    @Modifying(clearAutomatically = true)
    @Query(value = "update app_sam.bbook_sdipmgdti s set s.download_date_1 = sysdate where batch_num = :batchNum", nativeQuery = true)
    public void updSdipmgdti(@Param("batchNum") long batchNum);


}
