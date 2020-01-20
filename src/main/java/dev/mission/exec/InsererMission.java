package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
public class InsererMission implements Runnable{

	private MissionRepository missionRepository;
	
	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
		}
	
	@Override
	public void run() {
		Mission mission = new Mission();
		mission.setLibelle("Mission 1");
		mission.setTauxJournalier(new BigDecimal("90.90"));
		mission.setDateDebut(LocalDate.of(2020, 1, 12));
		mission.setDateFin(LocalDate.of(2020, 4, 4));
		this.missionRepository.save(mission);
		
		Mission mission2 = new Mission();
		mission2.setLibelle("Mission 2");
		mission2.setTauxJournalier(new BigDecimal("100.90"));
		mission2.setDateDebut(LocalDate.of(2020, 2, 04));
		mission2.setDateFin(LocalDate.of(2020, 6, 5));
		this.missionRepository.save(mission2);
	}

}
