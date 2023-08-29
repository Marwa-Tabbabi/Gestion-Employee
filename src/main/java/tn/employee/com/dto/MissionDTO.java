package tn.teams.fromzero.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;
import tn.teams.fromzero.entities.Mission;



@Data
public class MissionDTO {
	
	private Long id; 
	private String name;
	private String period;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date datedebut;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date datefin;
    
	
	public static MissionDTO fromentitie(Mission mission) {
		 MissionDTO missiondto = new MissionDTO();
		 BeanUtils.copyProperties(mission, missiondto);
		 
		 return missiondto; 
	}
	public static  Mission toentitie(MissionDTO dto) {
		Mission mission = new Mission();
		BeanUtils.copyProperties(dto, mission);
		return mission;
		
	}
}

