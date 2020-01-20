package dev.mission.exec;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;
import java.time.LocalDate;
import java.util.List;

@Controller
public class RechercherMissionParDateDebut implements Runnable {

	private MissionRepository missionRepository;

	public RechercherMissionParDateDebut(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	
	@Override
	public void run() {
	
		List<Mission> missions = missionRepository.findByDateDebut(LocalDate.of(2020, 1, 20));
		for (Mission m : missions ) {
	System.out.println(m);}
	}
}
