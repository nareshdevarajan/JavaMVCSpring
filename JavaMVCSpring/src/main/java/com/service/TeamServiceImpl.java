package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.dao.TeamDAO;
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
	public List<Team> getTeam() {  
        return teamDAO.getTeam();  
    }

	@Override
	public java.util.List<Team> getTeam() {
		// TODO Auto-generated method stub
		return null;
	}  
  

}
