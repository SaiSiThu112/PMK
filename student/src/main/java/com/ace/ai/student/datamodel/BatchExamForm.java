package com.ace.ai.student.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;


import lombok.NoArgsConstructor;


import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchExamForm {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id; 
    private String startDate;
    private String endDate;
    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean deleteStatus;

    @ManyToOne
    @JoinColumn(name="batch_id")
    private Batch batch;

    @ManyToOne
    @JoinColumn(name="exam_form_id")
    private ExamForm examForm;

    public  BatchExamForm(String startDate, String endDate, boolean status, Batch batch, ExamForm examForm){
        this.startDate = startDate;
        this.endDate = endDate;
        this.deleteStatus = status;
        this.batch = batch;
        this.examForm = examForm;
    }
    public  BatchExamForm(Batch batch, ExamForm examForm){       
        this.batch = batch;
        this.examForm = examForm;
    }
    public BatchExamForm(int id, String startDate, String endDate){
        this.id= id;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
