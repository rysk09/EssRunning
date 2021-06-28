package model;

import java.util.List;

import dao.GetLandmarkDAO;

public class GetLandmark {
	public void get(Input input) {
		GetLandmarkDAO dao = new GetLandmarkDAO();
		List<Landmark> landmarkList = dao.findByDist(Math.ceil(input.getDist()));
		String landmark;
		double landmarkDist;
		/*
		System.out.println(landmarkList.size());
		for(Landmark l: landmarkList) {
			System.out.println(l.getName());
		}
		*/
		if(landmarkList.size() == 0) {
			landmark = "Nothing!";
			landmarkDist = 0;
		} else {
			landmark = landmarkList.get(0).getName();
			landmarkDist = landmarkList.get(0).getDist();
		}
		input.setLandmark(landmark);
		input.setLandmarkDist(landmarkDist);
	}
}
