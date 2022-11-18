/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.external.external_exam.service;

import Entity.Category;
import Entity.Garments;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vivek
 */
@Stateless
public class garmentsbean {
    
    @PersistenceContext(unitName = "com.external_EXTERNAL_EXAM_war_1.0-SNAPSHOTPU2")
    EntityManager em;

    public Collection<Garments> getallgarments(){
        return em.createNamedQuery("Garments.findAll").getResultList();
    }
    
    public Collection<Garments> getgarmentsbycategory(Integer categoryid){
        Category cat = em.find(Category.class, categoryid);
        return em.createNamedQuery("Garments.findbycategory").setParameter("categoryid", cat).getResultList();
    }
    
    public Collection<Category> getallcategories(){
        return em.createNamedQuery("Category.findAll").getResultList();
    }
}
