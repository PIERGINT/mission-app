package dev.mission.exec;

import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


public class ListerMissions implements Runnable {
	private MissionRepository missionRepository;

	public ListerMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		List<Mission> list = this.missionRepository.findAll();
		for (Mission ref: list) {
		System.out.println(ref.getId() +". "+ ref.getLibelle());}
	}
}
