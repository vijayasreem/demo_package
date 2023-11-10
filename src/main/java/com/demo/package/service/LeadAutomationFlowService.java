package com.demo.package.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.demo.package.model.LeadAutomationFlow;

@Repository
public class LeadAutomationFlowService {

	@PersistenceContext
    private EntityManager entityManager;

	public void createLeadAutomationFlow(LeadAutomationFlow leadAutomationFlow) {
		entityManager.persist(leadAutomationFlow);
	}
	
	public LeadAutomationFlow getLeadAutomationFlowById(long id) {
		return entityManager.find(LeadAutomationFlow.class, id);
	}
	
	public List<LeadAutomationFlow> getAllLeadAutomationFlow() {
		String hql = "FROM LeadAutomationFlow";
		return (List<LeadAutomationFlow>) entityManager.createQuery(hql).getResultList();
	}
	
	public void updateLeadAutomationFlow(LeadAutomationFlow leadAutomationFlow) {
		LeadAutomationFlow leadAutomationFlowToUpdate = getLeadAutomationFlowById(leadAutomationFlow.getId());
		leadAutomationFlowToUpdate.setEmailTemplates(leadAutomationFlow.getEmailTemplates());
		leadAutomationFlowToUpdate.setStatus(leadAutomationFlow.getStatus());
		entityManager.flush();
	}
	
	public void deleteLeadAutomationFlow(long id) {
		entityManager.remove(getLeadAutomationFlowById(id));
	}

	public void testLeadAutomationFlow(LeadAutomationFlow leadAutomationFlow) {
		// Test the lead automation flow logic
	}
	
	public void deployLeadAutomationFlow(LeadAutomationFlow leadAutomationFlow) {
		// Deploy the lead automation flow logic
	}
	
	public void monitorLeadAutomationFlow(LeadAutomationFlow leadAutomationFlow) {
		// Monitor the lead automation flow logic
	}
	
	public void trackLeadAutomationFlow(LeadAutomationFlow leadAutomationFlow) {
		// Track the lead automation flow logic
	}

}