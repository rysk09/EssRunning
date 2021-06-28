package model;

import java.util.List;

import dao.GetLandmarkDAO;

public class GetLandmark {
	public void get(Input input) {
		GetLandmarkDAO dao = new GetLandmarkDAO();
		List<Landmark> landmarkList = dao.findByDist(input.getDist());
		String landmark;
		/*
		System.out.println(landmarkList.size());
		for(Landmark l: landmarkList) {
			System.out.println(l.getName());
		}
		*/
		if(landmarkList.size() == 0) {
			landmark = "Nothing!";
		} else {
			landmark = landmarkList.get(0).getName();
		}
		input.setLandmark(landmark);
	}
}
