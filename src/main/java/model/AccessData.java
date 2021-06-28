package model;

import java.util.List;

import dao.DataDAO;

public class AccessData {
	public List<Data> getData(String userId) {
		/*
		List<Data> dataList = new ArrayList<>();
		Data data = new Data();
		data.setDist(100.0);
		data.setUserId(userId);
		data.setDate();
		dataList.add(data);
		*/
		DataDAO dao = new DataDAO();
		List<Data> dataList = dao.findByUserId(userId);
		return dataList;
	}
	public void postData(Data data) {
		DataDAO dao = new DataDAO();
		dao.create(data);
	}
	public double sumDist(String userId) {
		DataDAO dao = new DataDAO();
		double distTotal = dao.sumDistByUserId(userId);
		return distTotal;
	}
}
