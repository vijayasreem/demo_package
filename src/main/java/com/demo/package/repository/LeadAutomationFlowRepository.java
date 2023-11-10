@Repository
public class LeadAutomationFlowRepository {

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

}