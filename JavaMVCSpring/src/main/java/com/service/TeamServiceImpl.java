package com.service;

import com.model.Team;
@Service  
@Transactional  
public class TeamServiceImpl implements TeamService {

	@Autowired  
    private TeamDAO teamDAO;  
  
	public void addTeam(Team team) {
		 teamDAO.addTeam(team);

	}

	public void updateTeam(Team team) {
		teamDAO.updateTeam(team);

	}

	public Team getTeam(int id) {
		 return teamDAO.getTeam(id);
		
	}

	public void deleteTeam(int id) {
		// TODO Auto-generated method stub
		 teamDAO.deleteTeam(id); 
	}
	public List<team> getTeams() {  
        return teamDAO.getTeams();  
    }  
  

}
