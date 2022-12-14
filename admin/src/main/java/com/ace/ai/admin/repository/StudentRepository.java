package com.ace.ai.admin.repository;

import com.ace.ai.admin.datamodel.Batch;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ace.ai.admin.datamodel.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByDeleteStatus(boolean deleteStatus);
    List<Student> findByDeleteStatusAndBatchId(boolean deleteStatus,int id);
    Student findByBatchAndId(Batch batch,Integer id);
    List<Student> findByBatch(Batch batch);
    Student findByBatchAndCode(Batch batch,String code);
    Student findStudentById(Integer id);
    List<Student> findByDeleteStatusAndBatchIdOrderByIdAsc(boolean status, int batchId);

}
